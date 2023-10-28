package Array;

import java.util.Arrays;

public class Q19AlternatingNegativePos {
    public static void main(String[] args) {
        int[] arr = {-3,-4,5,1};
        rearrange(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void rearrange(int [] arr, int n){

        int i = 0, j = 0 , count = 0 ;

        while(i < n && j < n){

            if (i < n && arr[i] < 0){
                if (j< n && arr[j]>=0){
                    if(i-j > 1 || j-i > -1){
                        int oldJ=  arr[j];
                        int temp = arr[count+1];
                        arr[count] = arr[i];
                        arr[count+1] = oldJ;
                        if (i>j){
                            shift(arr,temp, count+2,i);
                        }else{
                            shift(arr,temp,count+2,j);
                        }
                        count +=2;
                        j+=2;
                    }else{
                        int oldJ=  arr[j];
                        arr[count] = arr[i];
                        arr[count+1] = oldJ;
                        count +=2;
                        j+=2;
                    }
                }else{
                    j++;
                }
            }
            else{
                i++;
            }
        }

    }
    private static void shift(int[] arr,int temp,  int s, int e) {

        for (int i = s; i <= e; i++) {
            int temp2 = arr[i] ;
            arr[i] = temp ;
            temp = temp2;
        }

    }
}
