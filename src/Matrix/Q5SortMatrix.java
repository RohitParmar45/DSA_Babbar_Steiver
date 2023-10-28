package Matrix;

import java.util.Arrays;

public class Q5SortMatrix {
    public static void main(String[] args) {

    }
    int[][] sortedMatrix(int N, int Mat[][]) {

        int[]arr = new int[N*N];
        int count= 0;

        for(int i = 0 ; i <N; i++){
            for(int e : Mat[i]){
                arr[count] = e;
                count++;
            }
        }

        Arrays.sort(arr);

        count = 0;

        for(int i = 0 ; i< N ; i++){

            for(int j =0; j < N ; j++ ){
                Mat[i][j] = arr[count];
                count++;
            }
        }

        return Mat;

    }
}
