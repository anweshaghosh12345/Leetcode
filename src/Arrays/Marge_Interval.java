package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Marge_Interval {
    public static int[][] merge(int[][] intervals) {
    Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        System.out.println(Arrays.deepToString(intervals));
        for (int i = 0; i <intervals.length -1; i++) {
            for (int j = i+1; j <intervals.length ; j++) {
                int a=intervals[i][0];
                int a1=intervals[j][0];
                int b=intervals[i][1];
                int b1=intervals[j][1];
                if(a1>=a && a1<=b)
                {
                    intervals[i][0]=a;
                    intervals[j][0]=-1;
                }
                if(b>=a1 && b<=b1)
                {
                    intervals[i][1]=b1;
                    intervals[j][1]=-1;
                }
                else
                {
                    intervals[i][0]=a;
                    intervals[i][1]=b;
                }
            }
        }
        ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < intervals.length ; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            if (intervals[i][0] !=-1 && intervals[i][1] != -1) {

                temp.add(intervals[i][0]);
                temp.add(intervals[i][1]);
            }
            if(temp.size()==2) {
                arr.add(temp);
            }

        }
        int[][]ans=new int[arr.size()][2];
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j <2 ; j++) {
                ans[i][j]=arr.get(i).get(j);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[][] intervals = new int[][]{{1, 4}, {0, 2}, {3, 5}};
//                {1,3},{2,6},{8,10},{15,18}};
//                {1,4},{0,1}};

        System.out.println(Arrays.deepToString(merge(intervals)));
    }
}
