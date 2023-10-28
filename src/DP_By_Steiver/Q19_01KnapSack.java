package DP_By_Steiver;

public class Q19_01KnapSack {
    public static void main(String[] args) {
//        https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1
    }
    static int knapSack(int W, int wt[], int val[], int n)
    {
        //  return helper(n-1, W, wt,val);
        //  return helper2(n-1, W, wt, val , new int[n][W+1]);
        return helper3( W, wt,val, n);
    }

    //Recursion

    // private static int helper(int i , int W,int wt[], int val[]){

    //     if(i==0){
    //         if(wt[0]<=W)return val[0];
    //         else return 0;
    //     }

    //     int notTake = 0 + helper(i-1, W, wt, val);

    //     int take = Integer.MIN_VALUE;

    //     if(wt[i]<=W){
    //         take = val[i] + helper(i-1, W-wt[i] , wt, val);
    //     }

    //     return Math.max(take, notTake);

    // }

    //Memoization

    //   private static int helper2(int i , int W,int wt[], int val[], int[][]dp){

    //     if(i==0){
    //         if(wt[0]<=W)return val[0];
    //         else return 0;
    //     }
    //     if(dp[i][W] != 0)return dp[i][W];

    //     int notTake = 0 + helper2(i-1, W, wt, val,dp);

    //     int take = Integer.MIN_VALUE;

    //     if(wt[i]<=W){
    //         take = val[i] + helper2(i-1, W-wt[i] , wt, val,dp);
    //     }

    //     return dp[i][W] = Math.max(take, notTake);

    // }

    // Tabulation
    private static int helper3(int W,int wt[], int val[],int n){

        int [][]dp = new int[n][W+1];

        for(int i = wt[0] ; i <= W ; i++ ){
            dp[0][i] = val[0];
        }

        for(int i = 1 ;i < n ; i++){
            for(int WInd = 0; WInd <= W ; WInd++){


                int notTake = dp[i-1][WInd];

                int take = Integer.MIN_VALUE;

                if(wt[i]<=WInd){
                    take = val[i] + dp[i-1][WInd-wt[i]];
                }

                dp[i][WInd] = Math.max(take, notTake);
            }
        }

        return dp[n-1][W];

    }
}
