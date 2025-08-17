package numbers;

import java.util.HashMap;
import java.util.PriorityQueue;

public class MinimumNoDistinct {
        static int distinctIds(int arr[], int n, int m)
        {
            HashMap<Integer,Integer>hm=new HashMap<>();
            for (int i:arr){
                hm.put(i,hm.getOrDefault(i,0)+1);
            }
            PriorityQueue<Integer>pq=new PriorityQueue<>();
            for (int freq:hm.values()){
                pq.add(freq);
            }
            while (m>0 && !pq.isEmpty()){
                pq.poll();
                 m--;
            }
            return pq.size();
        }
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int arr[] = { 2, 4, 1, 5, 3, 5, 1, 3 };
        int m = 2;

        System.out.println(distinctIds(arr, arr.length, m));
    }
}
