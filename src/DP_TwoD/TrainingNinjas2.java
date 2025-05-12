package DP_TwoD;
import java.util.*;

public class TrainingNinjas2 {
    public static int ninjaTraining(int n, int points[][]) {
        int size=points.length-1;
        int dp2[][] = new int[n][4];
        for (int[] row : dp2)
            Arrays.fill(row, -1);
        return training(0,3,points,size,dp2);
    }
    public static int training(int index, int last,
                               int[][]points, int len,int[][] dp2){
        int maxi=0;
        if(index ==len){
            for (int i = 0; i <=2 ; i++) {
                if(i!=last){
                    maxi=Math.max(maxi,points[index][i]);
                }
            }
            return maxi;
        }

        if(dp2[index][last]!=-1)
            return dp2[index][last];
        int sum=0;
        for (int i = 0; i <=2; i++) {
            if(i!=last) {
                sum = points[index][i] + training(index + 1, i, points, len, dp2);
                maxi = Math.max(maxi, sum);
            }
        }
        return dp2[index][last]=maxi;
    }
}
