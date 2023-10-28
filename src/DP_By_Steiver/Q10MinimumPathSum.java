package DP_By_Steiver;

public class Q10MinimumPathSum {

    public static void main(String[] args) {
     int [][] grid = {
             {1,2,1},
             {5,1,7},
             {3,5,10}
     };
        System.out.println(minimumPathSum(grid,grid.length,grid[0].length));
    }
    private static int minimumPathSum(int[][]grid, int n, int m){
//        return helper(grid,n,m,0,0);
//        return helper2(grid,n,m,0,0, new int[n][m]);
//         return helper3(grid);
          return helper4(grid,n,m);
    }
    /**Recursion
     * TC - 2^M*N  : BECAUSE AT EVERY POINT WE HAVE TWO CHOICES
     *SC - O(M+N) : PATH-LENGTH-STACK_SPACE
     *  */
    private static int helper(int[][]grid , int n , int m , int i , int j){

        if(i==n-1 && j==m-1){
            return grid[i][j];
        }
        int right = Integer.MAX_VALUE , bottom = Integer.MAX_VALUE;
        if (i<n-1){
            bottom =   grid[i][j]+ helper(grid, n , m , i+1,j);
        }
        if (j<m-1){
            right = grid[i][j] + helper(grid, n , m , i,j+1);
        }
        return Math.min(bottom,right);
    }

    /**Memoization
     * TC - O(M*N ): BECAUSE AT EVERY POINT WE HAVE TWO CHOICES
     *SC - O(M*N)+ O(M*N) : STACK SPACE + ARRAY DP
     * */
    private static int helper2(int[][]grid , int n , int m , int i , int j,int[][]dp){

        if(i==n-1 && j==m-1){
            return grid[i][j];
        }
        if (dp[i][j]!=0)return dp[i][j];

        int right = Integer.MAX_VALUE , bottom = Integer.MAX_VALUE;

        if (i<n-1){
            bottom =   grid[i][j]+ helper2(grid, n , m , i+1,j,dp);
        }
        if (j<m-1){
            right = grid[i][j] + helper2(grid, n , m , i,j+1,dp);
        }
       return dp[i][j]= Math.min(bottom,right);
    }

    /**TABULAR
     * TC - O(M*N): BECAUSE AT EVERY POINT WE HAVE TWO CHOICES
     *SC -  O(M*N) :  ARRAY DP
     * */

    private static int helper3(int[][]grid){
        int n = grid.length;
        int m = grid[0].length;

        if (n==1 && m==1)return grid[0][0];

        int [][] dp = new int[n][m];
        dp[n-1][m-1] = grid[n-1][m-1];

        for (int i = n-1; i >= 0 ; i--) {

            for (int j = m-1; j >= 0  ; j--) {

                if (i==n-1 && j==m-1) continue;
                int rightSum = Integer.MAX_VALUE;
                int bottomSum = Integer.MAX_VALUE;
                if (i<n-1){
                   bottomSum = grid[i][j]+dp[i+1][j] ;
                }
                if (j<m-1){
                    rightSum = grid[i][j]+ dp[i][j+1] ;
                }
                dp[i][j] = Math.min(rightSum,bottomSum);
            }

        }
        return dp[0][0];
    }
    /**space optimisation
     * TC - O(M*N): BECAUSE AT EVERY POINT WE HAVE TWO CHOICES
     *SC -  O(m) :  1D ARRAY DP
     * */
    private static int helper4(int[][]grid,int n,int m){

        if(n ==1 || m ==1)return 1;

        int [] ahead = new int[m];

        for( int i = n-1 ; i>= 0 ; i-- ){
            int cur[] = new int[m];
            for(int j = m-1 ; j>=0; j--){
                if(i==n-1 && j==m-1){
                    cur[j] = grid[i][j];
                    continue;
                }
                int down = Integer.MAX_VALUE , right = Integer.MAX_VALUE;
                if(i <n-1){
                    down = grid[i][j] + ahead[j];
                }
                if(j < m-1){
                    right = grid[i][j] + cur[j+1];
                }
                cur[j]=Math.min(down,right);
            }
            ahead = cur;

        }
        return ahead[0];
    }
}

