package DP_By_Steiver;

import java.util.ArrayList;

public class Q5SumOfNonAdjecent {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(28);
        nums.add(29);
        nums.add(22);
        nums.add(30);
        System.out.println(maximumNonAdjacentSum(nums));
    }
    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
//        return	helper(nums, nums.size()-1);

//        int arr[] = new int[nums.size()];
//        return	helper2(nums, nums.size()-1,arr);

//        return helper3(nums,nums.size());

        return helper4(nums,nums.size());
    }

    /**Recursion*/
    private static int helper(ArrayList<Integer> nums , int n){
        if(n==0) return nums.get(n);
        if(n<0) return 0;

        int max = Math.max(helper(nums,n-1) , helper(nums,n-2)+nums.get(n));
        return max;

    }

    /**dp
     * tc - O(n)
     * sc - O(n)+ O(n) // for stack and for array dp
     *  */
    private static int helper2(ArrayList<Integer> nums , int n , int[] dp){
        if(n==0) return nums.get(n);
        if(n<0) return 0;
         if (dp[n] != 0) return dp[n];
        int max = Math.max(helper2(nums,n-1,dp) , helper2(nums,n-2,dp)+nums.get(n));
        return  dp[n] = max;
    }
    /**Tabulation
     * tc - O(n)
     * sc - O(n) // only array space , no stacks space
     * */
    private  static  int helper3(ArrayList<Integer> nums , int n){
        if(n == 1)return nums.get(0);
        int[]dp = new int[n];
        dp[0] = nums.get(0);

        for (int i = 1; i < n ; i++) {
            int taken = nums.get(i);
            if(i >= 2) taken += dp[i-2]; //i-2>=0 as we consider 0th value taken in count...
            int notTaken = dp[i-1];
            dp[i] = Math.max(taken, notTaken);

        }
        return dp[n-1];
    }
    /**space optimisation
     * tc - O(n)
     * sc - O(1)
     * */
    private  static  int helper4(ArrayList<Integer> nums , int n){
        if(n == 1)return nums.get(0);

        int prev = 0; // suppose index = negative so return zero
        int prev2 = nums.get(0); //suppose index = 0 initially

        for (int i = 1; i < n ; i++) {

            int taken = nums.get(i);
            if(i-2 >= 0) taken += prev;
            int notTaken = prev2;
            prev = prev2;
            prev2 = Math.max(taken, notTaken);
        }
        return prev2;
    }

}
