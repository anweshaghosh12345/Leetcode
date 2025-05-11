package Arrays;

public class Sort_Colours {
    public static void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;

        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==0)
                zero++;
            else if(nums[i]==1)
                one++;
            else
                two++;
        }
        int k=0;
        for (int i = 0; i <zero ; i++) {
            nums[k]=0;
            k++;
        }
        for (int i =0; i <one; i++) {
            nums[k]=1;
            k++;
        }
        for (int i = 0; i <two ; i++) {

            nums[k]=2;
            k++;
        }

    }
    public static void swap(int[]nums,int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
    public static void main(String[] args){
        int[]nums=new int[]{2,0,2,1,1,0};
        sortColors(nums);
        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]+" ");
        }

    }
}
