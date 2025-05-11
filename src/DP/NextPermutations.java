package DP;

public class NextPermutations {

    public static void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for (int i = n-2; i >=0 ; i--) {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(nums,0,n-1);
            return;
        }
        else{
            for (int i = n-1; i >=index;i--) {
                if(nums[i]>nums[index]){
                    swap(nums,i,index);
                    break;
                }
            }
            reverse(nums,index+1,n-1);
        }
    }
    public static void swap(int[]nums,int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }

    public static void reverse(int[]nums,int start,int end){
        while (start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] input = {3,2,1}; // Example array
        System.out.println("Permutations of the array:");
        boolean[] visited=new boolean[input.length];
        int[] res=new int[input.length];
        nextPermutation(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
        }


    }
}


//greedy
//public static void nextPermutation(int[] nums) {
//boolean[] visited=new boolean[nums.length];
//int[] ans=new int[nums.length];
//ArrayList<ArrayList<Integer>> res=new ArrayList<>();
//permutation(res,visited,0,nums,ans);
//        res.sort((list1, list2) -> {
//int n = Math.min(list1.size(), list2.size());
//            for (int i = 0; i < n; i++) {
//        if (!list1.get(i).equals(list2.get(i))) {
//        return Integer.compare(list1.get(i), list2.get(i));
//        }
//        }
//        return Integer.compare(list1.size(), list2.size());
//        });
//
//        System.out.println(res);
//
//
//
//        for (int i = 0; i < res.size(); i++) {
//
//        for (int j = 0; j < res.get(i).size(); j++) {
//
//        if (nums[j] < res.get(i).get(j)) {
//        for(int k=0;k< nums.length;k++){
//nums[k]=res.get(i).get(k);
//                            System.out.println(nums[k]);
//                        }
//                                return;
//                                }
//                                if(nums[j] > res.get(i).get(j))
//        break;
//        }
//        }
//        for (int i = 0; i < nums.length ; i++) {
//nums[i]=res.get(0).get(i);
//        }
//
//                }
//
//public static void permutation(ArrayList<ArrayList<Integer>> res, boolean[] visited, int indx, int[] input, int[] ans){
//    if(indx==input.length){
//        ArrayList<Integer> temp=new ArrayList<>();
//        for (int i = 0; i < ans.length; i++) {
//            temp.add(ans[i]);
//        }
//        res.add(new ArrayList<>(temp));
//        return;
//    }
//    for(int i=0;i<input.length;i++){
//        if(!visited[i]){
//            visited[i]=true;
//            ans[indx]=input[i];
//            permutation(res,visited,indx+1,input,ans);
//            visited[i]=false;
//        }
//    }
//}