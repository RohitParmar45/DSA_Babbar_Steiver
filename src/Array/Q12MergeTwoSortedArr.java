package Array;

import java.util.Arrays;

public class Q12MergeTwoSortedArr {
    public static void main(String[] args) {
        int[] arr1 = {2,8,15,17};
        int[] arr2 = {9,16,20};
        mergeArrays(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    private static void mergeArrays(int[] arr1, int[] arr2) {
        int i = 0 ;
        while (i < arr1.length){

            if (arr1[i] > arr2[0]){
                swap(arr1, arr2 , i);
                Arrays.sort(arr2);
            }
            i++;

        }
    }
    public static void swap(int [] arr1, int []arr2, int i){
        int temp = arr1[i];
        arr1[i] = arr2[0];
        arr2[0] = temp;
    }

    /**approach 2 : gap method */

}
