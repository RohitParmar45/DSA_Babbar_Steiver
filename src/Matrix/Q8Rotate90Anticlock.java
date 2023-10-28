package Matrix;

import java.util.Arrays;

public class Q8Rotate90Anticlock {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
               rotateby90(matrix,matrix.length);
          for(int[]arr : matrix){
              System.out.println(Arrays.toString(arr));
          }
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

        //swaping fist with last , second with sec last.....
        for(int i = 0; i<n/2 ; i++){
            for(int j = 0; j<n;j++){

                int temp = matrix[i][j];
                matrix[i][j]= matrix[n-1-i][j];
                matrix[n-1-i][j] = temp;

            }
        }
    }
}
