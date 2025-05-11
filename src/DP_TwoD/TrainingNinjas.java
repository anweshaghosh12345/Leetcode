package DP_TwoD;

public class TrainingNinjas {
    public static int ninjaTraining(int n, int points[][]) {
        int max=Integer.MIN_VALUE;
        int[][]dp2=new int[points.length][points[0].length];
        for (int i = 0; i <dp2.length ; i++) {
            for (int j = 0; j < dp2[0].length; j++) {
                dp2[i][j]=-1;
            }
        }
        for (int i = 0; i <points.length ; i++) {
            for (int j = 0; j <points[0].length ; j++) {
                max=Math.max(max,training(points,i,j,dp2));
            }

        }
        return max;
    }
    public static int training(int points[][],int i,int j,int[][]dp2){
        if(i<0 || j<0||i>=points.length||j>=points[0].length)
            return 0;
        int sum=0;
        if(dp2[i][j]!=-1)
            return dp2[i][j];
       int take1=0;
       int take2=0;
        if(j==0){
            take1=sum+points[i][j]+training(points,i+1,j+1,dp2);
            take2=sum+points[i][j]+training(points,i+1,j+2,dp2);
        }
        if(j==1){
            take1=sum+points[i][j]+training(points,i+1,j-1,dp2);
            take2=sum+points[i][j]+training(points,i+1,j+1,dp2);
        }
        if(j==2){
            take1=sum+points[i][j]+training(points,i+1,j-1,dp2);
            take2=sum+points[i][j]+training(points,i+1,j-2,dp2);
        }

        return dp2[i][j]=Math.max(take1,take2);
    }
}
