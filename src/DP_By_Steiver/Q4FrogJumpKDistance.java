package DP_By_Steiver;

public class Q4FrogJumpKDistance {
    public static void main(String[] args) {
        int [] heights = {10,20,30,10};
        System.out.println(frogJump(heights.length,heights));;
    }
    private static int frogJump(int n, int[] heights) {

        int arr[] = new int[n];
//       return helper(heights.length-1,heights, 2,Integer.MAX_VALUE);
       return helper2(heights.length-1,heights, 3,Integer.MAX_VALUE,arr);

    }

    /**RECURSION*/
    /** TC - 0(N) + OVERLAP THE PRESOLVED FUN()
     * SC - 0(n)+0(n) --  array and stack for recursion used
     */
    private static int helper(int n, int[] heights, int k, int min){
        if(n==0){
            return 0 ;
        }
        for (int i = 1; i <= k; i++) {

            if(n-i>=0){
            int jump = helper(n-i,heights,k,min) + Math.abs(heights[n]-heights[n-i]);
             min = Math.abs(Math.min(jump,min));
            }
        }
        return  min;
}
    /**MEMOIZATION*/
    /** TC - 0(N)
     * SC - 0(n)+0(n) --  array and stack for recursion used
     */
    private static int helper2(int n, int[] heights, int k, int min, int[]dp){
        if(n==0){
            return 0 ;
        }
        if (dp[n]!=0)return dp[n];

        for (int i = 1; i <= k; i++) {

            if(n-i>=0){
                int jump = helper2(n-i,heights,k,min,dp) + Math.abs(heights[n]-heights[n-i]);
                min = Math.abs(Math.min(jump,min));
                dp[n] = min;
            }
        }
        return  dp[n];
    }
}
