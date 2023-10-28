package Matrix;

import java.util.Arrays;

import static Matrix.Q8Rotate90Anticlock.rotateby90;

public class Q8_2Rotate90Clockwise {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        rotateby90(matrix,matrix.length);
        for(int[]arr : matrix){
            System.out.println(Arrays.toString(arr));
        }
        rotateby90(matrix,matrix.length);
    }

     static void rotateby90(int matrix[][], int n)
    {
        //transpose of matrix (means: row-colomb colomb-row)
        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j < n ; j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;

            }
        }

        //swaping fist with last col, second with sec last  col.....
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<n/2;j++){

                int temp = matrix[i][j];
                matrix[i][j]= matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;

            }
        }
    }
}


