package DP_TwoD;

import java.util.*;

public class Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int [][]dp=new int[triangle.size()+1][triangle.size()+1];
        for (int[]row:dp){
            Arrays.fill(row,-1);
        }
        return path(triangle,0,0, dp);
    }
    public static int path(List<List<Integer>> triangle,int i,int j,int[][] dp){
        if(i==triangle.size()-1 )
            return triangle.get(i).get(j);
        if(dp[i][j]!=-1)
            return dp[i][j];

        int takeJ = triangle.get(i).get(j) + path(triangle, i + 1, j, dp);
        // System.out.println("take J: " + takeJ);

        // if(j<triangle.get(i).size()-1)
        int takeJ1 = triangle.get(i).get(j) + path(triangle, i + 1, j+1, dp);
        // System.out.println("Take J + 1: " + takeJ1);


        return dp[i][j]=Math.min(takeJ1,takeJ);

    }

    public static void main(String[] args) {
        ArrayList<List<Integer>> triangle=new ArrayList<>();
//        triangle.add(Arrays.asList(-1));
//        triangle.add(Arrays.asList(-2, -3));
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));
        int result = minimumTotal(triangle);
        System.out.println("minpath : " + result);
    }
}
