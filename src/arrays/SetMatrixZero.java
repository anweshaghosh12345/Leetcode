package arrays;

public class SetMatrixZero {
    public static void setZeroes(int[][] matrix) {

        int rows=matrix.length;
        int column =matrix[0].length;
        int col0=1;
        for(int i=0;i<rows;i++){
            for(int j = 0; j< column; j++){
                if(matrix[i][j]==0) {
                    matrix[i][0]=0;
                    if(j!=0)
                        matrix[0][j]=0;
                    else
                        col0=0;
                }
            }
        }
        for(int i=1;i<rows;i++) {
            for (int j = 1; j < column; j++) {
            if(matrix[i][j]!=0){
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            }
            }
        }
        if(matrix[0][0]==0){
            for(int j=0;j<column;j++){
                matrix[0][j]=0;
            }
        }
        if(col0==0){
            for (int i = 0; i <rows ; i++) {
                matrix[i][0]=0;
            }
        }

    }
//    public static void main(String[] args) {
//        in
//
//        int n = matrix.size();
//        int m = matrix.get(0).size();
//
//        ArrayList<ArrayList<Integer>> ans = setZeroes(matrix);
//
//        System.out.println("The Final matrix is: ");
//        for (ArrayList<Integer> row : ans) {
//            for (Integer ele : row) {
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//        }
//    }
}
