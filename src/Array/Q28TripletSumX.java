package Array;

import java.util.Arrays;

public class Q28TripletSumX {
    public static void main(String[] args) {
        int[] arr= {1, 4, 45, 6 ,10, 8};
        System.out.println(find3Numbers(arr,arr.length,51 ));
    }
    public static boolean find3Numbers(int arr[], int n, int x) {

        Arrays.sort(arr);

        if(n==0) return false;

        for(int i = 0 ; i < n ; i++){

            int element = arr[i];
            int k = i+1;
            int l = n-1;

            while(l>k){
                if(element + arr[l]+arr[k] == x)return true;
                else if(element + arr[l]+arr[k] > x) l--;
                else  k++;
            }

        }
        return false;

    }
}
