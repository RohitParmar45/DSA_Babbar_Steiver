package Array;

public class Q33MinSwap {
    public static void main(String[] args) {
     int [] arr = {2 ,1, 5, 6, 3};
     int [] arr2 = {2, 7, 9, 5, 8, 7, 4};
     int []arr3 = {10, 12 ,20, 20 ,5 ,19 ,19, 12, 1 ,20, 1};


        System.out.println(minSwap(arr,arr.length,3)); //ans -1
        System.out.println(minSwap(arr2,arr2.length,6)); //ans - 2
        System.out.println(minSwap(arr3,arr3.length,1)); //ans - 1
    }
    public static int minSwap (int arr[], int n, int k) {

        if(n==0)return 0; //test case
        int gv = 0;

        for(int e : arr) if(e<=k)gv++;

        int i = 0 , j = gv-1 , min = Integer.MAX_VALUE;

        int bv = 0;
        for(int l = 0 ; l<gv; l++) if(arr[l]>k)bv++;
        if(bv == 0)return 0 ; //test case;

        min = bv;
        while(j<n-1){

            if( arr[j+1]>k){ //bad element entering
                if(arr[i] <= k) bv++;  //good leaving
            }
            else{                   //good entering
                if(arr[i] > k) bv--; //bad leaving
            }

            min = Integer.min(bv,min);
            i++;
            j++;
        }

        return min;

    }
}
