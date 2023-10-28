package DP_By_Steiver;

public class Q16DivideArrayMinimumSum {
    public static void main(String[] args) {
     int arr[] = {1,3,7,9};
     int arr2[] = {1,2,3,5};
     int arr3[] = {6,6,6};
     int arr4[] = {4 ,1, 20, 9 ,9};
        System.out.println(minSum(arr, arr.length));
        System.out.println(minSum(arr2, arr2.length));
        System.out.println(minSum(arr3, arr3.length));
        System.out.println(minSum(arr4, arr4.length));
    }
    private static int minSum(int[]arr,int n){

        int total = 0;
        for (int e: arr) {
            total+=e;
        }
//         return helper(arr,n-1,total,0 );
         return helper2(arr,n-1,total,0,new int[n][total+1] );
    }

    /**Recursion
     * TC - 0(2^n)
     * SC - 0(n)
     * */
    private static  int helper(int [] arr , int i,int arr2Sum,  int arr1Sum){
        if(i==0){
            return Math.abs(arr2Sum-arr1Sum);
        }

        int includes = helper(arr, i-1,arr2Sum-arr[i],arr1Sum+arr[i]);
        int excludes = helper(arr, i-1,arr2Sum,arr1Sum);

        return Math.min(includes,excludes);
    }

    /**Recursion
     * TC - 0(n*sum of all the element)
     * SC - 0(n) + 0(n*sum of all the element)
     *
     * */
    private static  int helper2(int [] arr , int i, int arr2Sum, int arr1Sum, int[][] dp){
        if(i==0){
            return Math.abs(arr2Sum-arr1Sum);
        }
        if (dp[i][arr2Sum] != 0) return  dp[i][arr2Sum];

        int includes = helper2(arr, i-1,arr2Sum-arr[i],arr1Sum+arr[i],dp);
        int excludes = helper2(arr, i-1,arr2Sum,arr1Sum,dp);

        return dp[i][arr2Sum] = Math.min(includes,excludes);
    }

    /** Tabulation
     * TC - n*target
     * sc -   n*target : 2d dp array
     * */

    private static boolean helper3(int[] nums, int k) {
        int n = nums.length;
        boolean [][]dp = new boolean[n][k+1];
        //base cases
        if (k==0)return true;
        for (int i = 0; i < n; i++) dp[i][0] = true; // at every target =0 cell return true;
        if(k>=nums[0]) dp[0][nums[0]] = true;

        for(int i = 1 ; i < n ; i++){
            for (int tar = 1; tar <= k; tar++) {

                boolean include = false;
                if (nums[i]<=tar){
                    include = dp[i-1][tar-nums[i]];
                }
                boolean exclude = dp[i-1][tar];

                dp[i][tar] = include || exclude;

            }
        }
        return dp[n-1][k];

    }
}
