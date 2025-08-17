package array;
import java.util.ArrayList;
import java.util.Stack;

public class Remove_Duplicates {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> ar=new ArrayList<>();
//        Stack<Integer>stack=new Stack<>();
        ar.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]!=arr[i]){
                ar.add(arr[i]);
            }
        }
        return ar;
    }
}

