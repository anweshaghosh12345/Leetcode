package array;

import java.util.Arrays;

public class RotateImage {
    public static void rotate(int[][] matrix) {

        for (int i = 0; i <matrix.length ; i++) {
            for (int j = i; j <matrix[0].length ; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for (int i = 0; i <matrix.length ; i++) {
            int start=0;
            int end=matrix[i].length-1;
            while (start<end){
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }
    }

    public static void main (String[]args){
    int[][] matrix = new int[][]{
                    {5, 1, 9, 11},
                    {2, 4, 8, 10},
                    {13, 3, 6, 7},
                    {15, 14, 12, 16}};
            rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
//            System.out.println(Arrays.deepToString(matrix));
        }

}
