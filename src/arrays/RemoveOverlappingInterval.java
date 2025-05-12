package arrays;

import java.util.Arrays;

public class RemoveOverlappingInterval {
    public static int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        System.out.println(Arrays.deepToString(intervals));
        int end=intervals[0][1];
        for (int i = 1; i <intervals.length; i++) {
            if(end>intervals[i][0])
            {
                count++;
            }
            else {
                end=intervals[i][1];
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[][] intervals = new int[][]{{1,100},{11,22},{1,11},{2,12}};
//            1,2},{2,3}};
//                {1,3},{2,6},{8,10},{15,18}};
//                {1,4},{0,1}};
        int c=eraseOverlapIntervals(intervals);
        System.out.println(c);
    }
}
