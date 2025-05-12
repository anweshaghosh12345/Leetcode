package arrays;

import java.util.*;

public class Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        int[][] arr=new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numRows; j++) {
                if(i==j || j==0){
                    arr[i][j]=1;
                }else {
//                    ans.get(i).set(j,(ans.get(i-1).get(j-1)+ans.get(i-1).get(j)));
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];

                }
            }
        }
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> an=new ArrayList<>();
            for (int j = 0; j < numRows; j++) {
                if(arr[i][j]!=0)
                an.add(arr[i][j]);
            }
            ans.add(an);
        }
        return ans;
    }
}
