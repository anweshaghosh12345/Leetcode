package array;
import java.util.ArrayList;

public class SpiralMatrix {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        int left=0,top=0;
        int right=mat[0].length-1;
        int bott=mat.length-1;
        ArrayList<Integer>res=new ArrayList<>();
        while (top<=bott && left<=right){
            for (int i = left; i <=right ; i++) {
                res.add(mat[top][i]);
            }
            top++;
            for (int i = top; i <=bott ; i++) {
                res.add(mat[i][right]);
            }
            right--;
            if(top<=bott){
                for (int i = right; i >=left ;-- i) {
                    res.add(mat[bott][i]);
                }
                bott--;
            }
            if(left<=right){
                for (int i = bott; i >=top ; --i) {
                    res.add(mat[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}
