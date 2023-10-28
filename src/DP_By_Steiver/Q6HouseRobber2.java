package DP_By_Steiver;

public class Q6HouseRobber2 {
    public static void main(String[] args) {

        int[] money = {50,40,30,10};
        System.out.println(houseRobber(money));

    }
    public static long houseRobber(int[] valueInHouse) {

        int n = valueInHouse.length;
        /**recursion+memoization*/ // it can be more optimise
         if(n==1)return valueInHouse[0];
        long [] dp = new long[n];
        long ans1 =	helper2(valueInHouse, n-2, dp); //exclude lastOne
        long [] dp2 = new long[n];
        long ans2 = helper3(valueInHouse, n-1, dp2); //exclude 0th
        return Math.max(ans1,ans2);

        /***/

    }
    private static long helper2(int[] nums , int n , long[] dp){
        if(n==0) return nums[n];
        if(n<0) return 0;
        if (dp[n] != 0) return dp[n];
        long max = Math.max(helper2(nums,n-1,dp) , helper2(nums,n-2,dp)+nums[n]);
        return  dp[n] = max;
    }
    private static long helper3(int[] nums , int n , long[] dp){
        if(n==1) return nums[n];
        if(n<=0) return 0;
        if (dp[n] != 0) return dp[n];
        long max = Math.max(helper3(nums,n-1,dp) , helper3(nums,n-2,dp)+nums[n]);
        return  dp[n] = max;
    }

}
