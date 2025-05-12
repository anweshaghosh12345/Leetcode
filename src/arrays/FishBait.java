package arrays;

import java.util.Arrays;

public class FishBait {
    public static int solution(int[] fish, int[] baits) {
        int fishcaught=0;
        Arrays.sort(fish);
        int fishIdx=fish.length-1;
        Arrays.sort(baits);
        int baitIdx=baits.length-1;
        while(baitIdx>=0){
            int used=0;
            while (used<3&&fishIdx>=0 && fish[fishIdx]>baits[baitIdx]){
                used++;
                fishcaught++;
                fishIdx--;
            }
            baitIdx--;
        }

        return fishcaught;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}, new int[]{1})); // Output: 2
        System.out.println(solution(new int[]{2, 2, 3, 4}, new int[]{1})); // Output: 3
        System.out.println(solution(new int[]{1, 4, 3, 2}, new int[]{1, 1})); // Output: 3
    }
}
