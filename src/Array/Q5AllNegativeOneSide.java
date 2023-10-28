package Array;

//Move all negative numbers to beginning and positive to end with constant extra space

import java.util.Arrays;

public class Q5AllNegativeOneSide {
    public static void main(String[] args) {
        int [] arr = {-22,40,-23,4,6,-12,3};
        int j = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] < 0){
              swap( arr,i,j);
                j++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
   public static void  swap(int [] arr,int pos1,int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] =temp;
    }

}
