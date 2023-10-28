package Array;

import java.util.Arrays;

public class Q1ReverseAnArray {
   public static void main(String[] args) {

      int [] arr = {2,3,4,6,8};
      int [] newArr = new int[arr.length];
      int j = 0;
      for(int i = arr.length-1; i>=0; i--){
         newArr[j] = arr[i];
         j++;
      }
      System.out.println(Arrays.toString(newArr));

   }
}
