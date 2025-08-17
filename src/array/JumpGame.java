package array;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int i=0;
        int n= nums.length;
        int goal=0;
        while (i<n){
            if(i>goal)
                return false;
            goal=Math.max(goal,i+nums[i]);
            if(goal>n-1)
                return true;
          i++;
        }
        return true;
    }
}
