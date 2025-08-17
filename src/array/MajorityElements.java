package array;

public class MajorityElements {
    public int majorityElement(int[] nums) {
        for (int num : nums) {
            int c = 0;
            for (int i : nums) {
                if (num == i)
                    c++;
            }
            if (c > nums.length / 2)
                return num;
        }
        return 0;
    }
}
