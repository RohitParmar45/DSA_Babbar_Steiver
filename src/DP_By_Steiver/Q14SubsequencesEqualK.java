package DP_By_Steiver;

public class Q14SubsequencesEqualK {
    public static void main(String[] args) {
        int [] arr = {2,4,5,8};

        int [] arr2 = {4,3,2,1};
        int [] arr3 = {2, 5 ,1 ,6 ,7}; int tar3 = 4;
        int [] arr4 = {6 ,1, 2 ,1}; int tar4 = 4;
        int [] arr5 = { 1, 7 ,2, 9 ,10}; int tar5 = 6;


//        System.out.println(subsequences(arr, 20));
//        System.out.println(subsequences(arr2, 5));
//        System.out.println(subsequences(arr3, tar3));
        System.out.println(subsequences(arr4, tar4));
        System.out.println(subsequences(arr5, tar5));
    }
    private static boolean subsequences (int[] nums, int k){

//        return helper(nums,nums.length-1, k);
//
//        int ans=  helper2(nums,nums.length-1, k, new int[nums.length][k+1]);
//        return ans == 1;
       return helper3(nums,k);

    }

    /** Recursion
     * TC - 2^n (we have two choices at every step)
     * sc - n  (auxilary stack space)
     * */

    private static boolean helper(int[] nums, int i, int targetRemain) {
        if(i==0){
            return targetRemain == nums[i];
        }
        if (targetRemain - nums[i] == 0) return true;

        boolean include = false;
        if (nums[i]<=targetRemain){
             include = helper(nums,i-1,targetRemain-nums[i]);
        }
        boolean exclude = helper(nums , i-1, targetRemain);

        return include || exclude;
    }

    /** Memoization
     * TC - n*target
     * sc - n +  n*target : (auxilary stack space) + 2d dp array
     * */

    private static int helper2(int[] nums, int i, int targetRemain, int[][]dp) {
        if(i==0){
            if (targetRemain == nums[i])return 1;
            else return -1;
        }
        if (targetRemain - nums[i] == 0) return 1;
        if (dp[i][targetRemain]!=0)return dp[i][targetRemain];

        int include = -1;
        if (nums[i]<=targetRemain){
            include = helper2(nums,i-1,targetRemain-nums[i],dp);
        }
        int exclude = helper2(nums , i-1, targetRemain,dp);

        if (include ==1 || exclude == 1)return dp[i][targetRemain] =  1;
        else return  dp[i][targetRemain] = -1 ;
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
