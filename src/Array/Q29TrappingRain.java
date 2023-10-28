package Array;

public class Q29TrappingRain {
    public static void main(String[] args) {
     int []arr = {6,3,5,6,7,4,3,2,3,1}; //ans - 5
     int []arr2 ={3,0,0,2,0,4}; //ans - 10;
      int []arr3 =  {7,4,0,9}; //ans- 10
      int[]arr4 = {6,9,9}; //0
      int[]arr5 = {8, 8, 2, 4, 5, 5 ,1}; //4
        System.out.println(trappingWater(arr,arr.length));
        System.out.println(trappingWater(arr2,arr2.length));
        System.out.println(trappingWater(arr3,arr3.length));
        System.out.println(trappingWater(arr4,arr4.length));
        System.out.println(trappingWater(arr5,arr5.length));


    }
//    static long trappingWater(int a[], int n) {
//
//        int i = 0, j = 1;
//        long sum=0;
//        while(i < n){
//
//            if(j<n && a[i]<=a[j]){
//                int k = i;
//                while (k<j){
//                    sum+=a[i]-a[k];
//                    k++;
//                }
//                i=j;
//                j=i+1;
//            }else if (j>=n){
//                i++;
//                j=i+1;
//            }else j++;
//        }
//       return sum;
//    }
static long trappingWater(int a[], int n) {
       int max = 0;
       int[] left = new int[n];
       for (int i = 0; i <n ; i++) {
       if (a[i]>max) max = a[i];
          left[i] = max;
    }
     max = 0;
    int[] right = new int[n];
    for (int i = n-1; i >=0 ; i--) {
        if (a[i]>max) max = a[i];
        right[i] = max;
    }
    long total = 0;
    for (int i = 0; i < n; i++) {
        total += Math.min(left[i],right[i])-a[i];
    }
   return total;
}
}
