package arrays;

public class LongestDiagonal {
    public static int longestLength(int[][] matrix){

        int maxleng=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==1)
                maxleng=Math.max(maxleng,diagonalCheck(matrix,i,j,1,1));
                maxleng=Math.max(maxleng,diagonalCheck(matrix,i,j,1,-1));
                maxleng=Math.max(maxleng,diagonalCheck(matrix,i,j,-1,1));
                maxleng=Math.max(maxleng,diagonalCheck(matrix,i,j,-1,-1));

            }
        }
        return maxleng;
    }
    public static int diagonalCheck(int[][] matrix,int row,int col,int rowDir,int colDir){
        int lenght=0;
        int rows=matrix.length;
        int cols=matrix[0].length;
        int expected=1;
        while (row>=0 && col>=0 && row<rows && col<cols){

            if(matrix[row][col]==expected){
                lenght++;
                if(expected==1)
                    expected=2;
                else if(expected==2)
                    expected=0;
                else expected=2;
            }else
                break;

            row+=rowDir;
            col+=colDir;
        }

        return  lenght;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 1, 2, 2, 0},
                {0, 2, 0, 2, 0},
                {0, 0, 0, 0, 0},
                {0, 2, 2, 2, 2},
                {2, 1, 2, 2, 1},
                {0, 2, 0, 0, 2}
        };
        int result = longestLength(matrix);
        System.out.println("Longest diagonal pattern length: " + result);
    }
}
