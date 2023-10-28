package Array;

import java.util.Arrays;

public class Q32ThreeWayPartitioning {
    public static void main(String[] args) {

        int [] arr = {88,14,34,78};
        threeWayPartition(arr,16,77);
        System.out.println(Arrays.toString(arr));
    }
    public static void threeWayPartition(int arr[], int a, int b) {
        if (arr.length == 0 || arr.length == 1) return;

        int i = 0; //i<a
        int j = 0; //j>a
        int finA = 0; //when all less than a element arrange then the last index (j) is equals finA;

        while (i < arr.length) {

            if (arr[i] >= a) {
                i++;
            } else {
                swap(arr, i, j);
                i++;
                j++;
            }
        }
        finA = j;
        i = j = arr.length - 1; // i > b       j<b

        while (finA < arr.length - 1 && finA <= i) {
            if (arr[i] <= b) {
                i--;
            } else {
                swap(arr, i, j);
                i--;
                j--;
            }
        }
    }
        public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
