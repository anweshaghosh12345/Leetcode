package array;

import java.util.HashMap;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i <numbers.length ; i++) {
            hm.put(numbers[i],i);
        }
        for (int i = 0; i <numbers.length ; i++) {
            int tar=target-numbers[i];
            if(hm.containsKey(tar)){
                if(hm.get(tar)!=i){
                    return new int[]{i+1,hm.get(tar)+1};
                }
            }
        }

        return new int[2];
    }
}
