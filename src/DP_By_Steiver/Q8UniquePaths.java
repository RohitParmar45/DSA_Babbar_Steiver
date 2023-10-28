package DP_By_Steiver;

public class Q8UniquePaths {
    public static void main(String[] args) {
//       int arr[][] = new int [3][3];
       int arr[][] = new int [2][2];
        System.out.println(uniquePaths(arr, arr.length, arr[0].length));
    }
    private static int uniquePaths(int[][]arr, int n, int m){
//        return helper(arr,n,m,0,0);
//        return helper2(arr,n,m,0,0, new int[n][m]);
//         return helper3(n,m);
         return helper4(n,m);
    }

    /**Recursion
     * TC - 2^M*N  : BECAUSE AT EVERY POINT WE HAVE TWO CHOICES
     *SC - O(M+N) : PATH-LENGTH-STACK_SPACE
     *  */
    private static int helper(int[][] arr, int n , int m , int i , int j){

        if(i==n-1 && j==m-1)return 1;
        int left = 0;
        int right = 0;
        if (i<n-1){left = helper(arr,n,m,i+1,j);}
        if (j<m-1){right = helper(arr,n,m,i,j+1);}
        return left+right;
    }

    /**Memoization
     * TC - O(M*N ): BECAUSE AT EVERY POINT WE HAVE TWO CHOICES
     *SC - O(M*N)+ O(M*N) : STACK SPACE + ARRAY DP
     * */
    private static int helper2(int[][] arr, int n , int m , int i , int j, int[][] dp){

        if(i==n-1 && j==m-1)return 1;
        int left = 0;
        int right = 0;

        if (dp[i][j] != 0 )return dp[i][j];
        if (i<n-1){
            left = helper2(arr,n,m,i+1,j,dp);
        }
        if (j<m-1){
            right = helper2(arr,n,m,i,j+1,dp);
        }
         return dp[i][j] = left+right;
    }
    /**TABULAR
     * TC - O(M*N): BECAUSE AT EVERY POINT WE HAVE TWO CHOICES
     *SC -  O(M*N) :  ARRAY DP
     * */
    private static int helper3(int n,int m){

        if(n ==1 || m ==1)return 1;

        int [][] dp = new int[n][m];
        dp[n-1][m-1] = 1;

        for(int i = n-1; i>= 0 ; i--){

            for(int j = m-1 ; j>=0; j--){

               if(i==n-1 && j==m-1)continue;

               int left = 0 , right = 0;
                if(i+1 < n){
                   left = dp[i+1][j];
                }
                if(j+1 < m){
                  right = dp[i][j+1];
                }
                 dp[i][j]=left+right;
            }

        }
        return dp[0][0];
    }

    /**space optimisation
     * TC - O(M*N): BECAUSE AT EVERY POINT WE HAVE TWO CHOICES
     *SC -  O(m) :  1D ARRAY DP
     * */
    private static int helper4(int n,int m){

        if(n ==1 || m ==1)return 1;

        int [] ahead = new int[m];

        for( int i = n-1 ; i>= 0 ; i-- ){
             int cur[] = new int[m];
            for(int j = m-1 ; j>=0; j--){
                if(i==n-1 && j==m-1){
                    cur[m-1] = 1;
                    continue;
                }
                int down = 0 , right = 0;
                if(i+1 < n){
                    down = ahead[j];
                }
                if(j+1 < m){
                    right = cur[j+1];
                }
                cur[j]=down+right;
            }
             ahead = cur;

        }
        return ahead[0];
    }
}
