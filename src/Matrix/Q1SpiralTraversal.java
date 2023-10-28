package Matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1SpiralTraversal {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int matrix2[][] = {{1, 2, 3},
                          {5, 6, 7},
                          {9, 10, 11},
                          {13, 14, 15}
        };
        System.out.println(Arrays.toString(spirallyTraverse(matrix, matrix.length, matrix[0].length).toArray()));
        System.out.println(Arrays.toString(spirallyTraverse(matrix2, matrix2.length, matrix2[0].length).toArray()));
    }
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0 ;
        int j = 0;
        int b1 = 0;
        int b2 = c-1;
        int b3 = r-1;
        int b4 = 0;
        int count = 0;
        while(count < r*c){

            if(j<=b2){
            while(j<=b2){
                arr.add(matrix[i][j]);
                count++;
                j++;
            }}else return arr;
            j--;
            i++;
            b1++;
            if (i<=b3){
            while(i<=b3){
                arr.add(matrix[i][j]);
                count++;
                i++;
            }}else return arr;
            i--;
            j--;
            b2--;
            if (j>=b4){
            while(j>=b4){
                arr.add(matrix[i][j]);
                count++;
                j--;
            }}else return arr;
            j++;
            i--;
            b3--;

            if (i>=b1){
            while(i>=b1){
                arr.add(matrix[i][j]);
                count++;
                i--;
            }}else return arr;
            i++;
            j++;
            b4++;
        }

        return arr;

    }
}
