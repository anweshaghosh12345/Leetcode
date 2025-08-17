package array;

public class SearchInMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        for (i = 0; i <matrix.length ;i ++) {
            if(target>=matrix[i][0] && target<=matrix[i][matrix[0].length]){
                for (int j = 0; j <matrix[0].length ; j++) {
                    if(target==matrix[i][j])
                        return true;
                }
            }
        }
        return false;
    }
}
