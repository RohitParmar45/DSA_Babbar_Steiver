package Array;

public class Q23maxSubarray {
    public static void main(String[] args) {
        int []arr = {2,3,-1,0,4,2};
        int []arr2 = {-1,-3,-4};
        int []arr3 = {-1,-3,-4,0,8,7};
        int []arr4 = {-1,-2,0,-3,1};
        int []arr5 = {-8 ,5, 3, 1 ,6};
        int []arr6 = {0 ,0 ,-5 ,0, 0};
        int []arr7 = {1,2,-3,7,-1,-3};;
//        System.out.println(maxProduct(arr,arr.length));
 //       System.out.println(maxProduct(arr2,arr2.length));
//        System.out.println(maxProduct(arr3,arr3.length));
//        System.out.println(maxProduct(arr4,arr4.length));
//        System.out.println(maxProduct(arr6,arr6.length));
         System.out.println(maxProduct(arr7,arr7.length));
    }
   static long maxProduct(int[] arr, int n) {
        if(n==1)return arr[0];

       long max = Integer.MIN_VALUE;
        long cur = 1;

       for (int i = 0; i < n; i++) {
               cur = cur * arr[i];
                max = Math.max(max,cur);
               if (cur==0) cur = 1;
       }
      cur = 1;
       for (int j = n-1; j >= 0; j--) {
           cur = cur * arr[j];
           max = Math.max(max,cur);
           if (cur==0) cur = 1;
       }
       return max;
   }
}
