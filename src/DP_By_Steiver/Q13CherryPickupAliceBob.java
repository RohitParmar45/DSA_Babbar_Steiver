package DP_By_Steiver;

public class Q13CherryPickupAliceBob {
    public static void main(String[] args) {

    }
    public static int maximumChocolates(int r, int c, int[][] grid) {

        return helper(0,0,c-1,grid,r,c);

    }
    /** Recursion
     * TC - O( 3^n*m) *  O( 3^n*m)  // total choices for  alice and bob
     * SC - O (N*M)
     * */
    private static int helper(int i, int j1, int j2, int[][] grid, int r, int c) {
        // Base cases
        if (j1 < 0 || j1 >= c || j2 < 0 || j2 >= c) {
            return Integer.MIN_VALUE;
        }
        if (i == r - 1) {
            if (j1 == j2) {
                return grid[i][j1];
            } else {
                return grid[i][j1] + grid[i][j2];
            }
        }

        // All 9 combinations
        int max = Integer.MIN_VALUE;
        for (int p = -1; p <= +1; p++) {
            int val = 0;
            for (int q = -1; q <= +1; q++) {
                if (j1 == j2) {
                    val = grid[i][j1];
                } else {
                    val = grid[i][j1] + grid[i][j2];
                }
                max = Math.max(max, val + helper(i + 1, j1 + p, j2 + q, grid, r, c));
            }
        }

        return max;
    }

    /** MEMOIZATION
     * TC - O( N*M*M) * 9   // for N rows and for every row we have M column for alice and M for bob, 9 STATES WE CANT IGNORE
     * SC - O(N*M) +O (N*M*M)
     * */
    private static int helper(int i , int j1, int j2, int[][]grid , int r, int c,int[][][] dp){

        //base cases
        if(j1 <0 || j1 >= c || j2 < 0 || j2 >=c)
            return Integer.MIN_VALUE;

        if(dp[i][j1][j2] != 0) return dp[i][j1][j2];
        if(i == r-1){
            if(j1 == j2 )return grid[i][j1];
            else return grid[i][j1] + grid[i][j2];
        }

        //all 9 combo
        int max = Integer.MIN_VALUE;
        for(int p = -1 ; p <=+1 ; p++){
            int val = 0 ;
            for(int q = -1 ; q <= +1 ; q++){

                if(j1==j2) val = grid[i][j1];
                else val = grid[i][j1]+grid[i][j2];
                max = Math.max(max, val+ helper(i+1, j1+p, j2+q, grid, r, c,dp));
            }

        }

        return dp[i][j1][j2] =  max;
    }
}
