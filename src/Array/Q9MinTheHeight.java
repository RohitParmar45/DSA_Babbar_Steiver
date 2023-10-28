package Array;

import java.util.Arrays;

public class Q9MinTheHeight {
    public static void main(String[] args) {
       int [] arr = {1,5,8,10};
        System.out.println(getMinDiff(arr, arr.length,2));
    }
   static int getMinDiff(int[] arr, int n, int k) {
        if(n==1)return 0;

        Arrays.sort(arr);
        int diff = arr[n-1] - arr[0];
        int min , max;

        for(int i = 1 ; i< n; i++){

            if(arr[i]-k < 0) continue;
            max = Math.max(arr[i-1]+k , arr[n-1]-k );
            min = Math.min(arr[0]+k , arr[i]-k);

            diff = Math.min(diff,max-min);

        }

        return diff;

    }
}
