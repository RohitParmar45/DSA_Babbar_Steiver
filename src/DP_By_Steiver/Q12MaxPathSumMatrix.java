package DP_By_Steiver;

public class Q12MaxPathSumMatrix {
    public static void main(String[] args) {
     int [][] matrix = {
             {1,2,3},
             {4,5,6},
             {7,8,9}
     };
        System.out.println(getMaxPathSum(matrix));
    }

    public static int getMaxPathSum(int[][] matrix) {
        if(matrix.length==0)return 0;
        int n = matrix.length;
        int m = matrix[0].length;


//        int ans = Integer.MIN_VALUE;
//        for(int j = 0 ; j< m; j++){
//            ans= Math.max(ans, helper2(matrix, 0, j, n, m, new int[n][m]));
//        }
//        return ans;

        return helper3(matrix,n,m);
    }
    /**Recursion
     * TC - 3^M*N  : BECAUSE AT EVERY POINT WE HAVE TWO CHOICES
     *SC - O(M*N) : PATH-LENGTH-STACK_SPACE
     *  */
     private static int helper(int [][] matrix , int i , int j , int n , int m){

        if(i==n-1) return matrix[i][j];

        int bottom = Integer.MIN_VALUE;
        int leftDiag = Integer.MIN_VALUE;
        int rightDiag = Integer.MIN_VALUE;

        if(i < n-1){
         bottom = matrix[i][j] + helper(matrix,i+1,j,n,m);
          if(j>0){
          leftDiag = matrix[i][j] + helper(matrix, i+1,j-1, n,m);
     	 }
     	  if(j<m-1){
         rightDiag = matrix[i][j] + helper(matrix, i+1,j+1, n,m);
     	 }
        }

        return Math.max(bottom, Math.max(leftDiag,rightDiag));

     }
    /**Memoization
     * TC - O(M*N ):
     *SC - O(M*N)+ O(M*N) : STACK SPACE + ARRAY DP
     * */
    private static int helper2(int [][] matrix , int i , int j , int n , int m, int[][]dp){

        if(i==n-1) return matrix[i][j];

        if(dp[i][j]!=0)return dp[i][j];

        int bottom = Integer.MIN_VALUE;
        int leftDiag = Integer.MIN_VALUE;
        int rightDiag = Integer.MIN_VALUE;

        if(i < n-1){
            bottom = matrix[i][j] + helper2(matrix,i+1,j,n,m,dp);
            if(j>0){
                leftDiag = matrix[i][j] + helper2(matrix, i+1,j-1, n,m,dp);
            }
            if(j<m-1){
                rightDiag = matrix[i][j] + helper2(matrix, i+1,j+1, n,m,dp);
            }
        }

        return dp[i][j] = Math.max(bottom, Math.max(leftDiag,rightDiag));

    }

    //not giving correct answer
    private static int helper3(int[][] matrix , int n , int m){

        int [][] dp = new int[n][m];

        System.arraycopy(matrix[n - 1], 0, dp[n - 1], 0, m);

        for(int z = 0 ; z<m; z++){
            for (int i = n-2; i>=0; i-- ){

                for(int j = 0 ; j< m ; j++){

                    int bottom =Integer.MIN_VALUE;
                    int leftDia =Integer.MIN_VALUE;
                    int rightDia =Integer.MIN_VALUE;

                    if (i==n-2) {
                        if(j+1==z)rightDia = matrix[i][j]+ dp[i][z];
                        else if(j==z)bottom = matrix[i][j]+ dp[i][z];
                        else if(j-1==z) leftDia = matrix[i][j]+ dp[i][z];
                    }
                    else{
                    bottom = matrix[i][j]+dp[i+1][j];
                    if (j!=0)leftDia = matrix[i][j]+dp[i+1][j-1];
                    if (j!=m-1)  rightDia = matrix[i][j]+dp[i+1][j+1];
                }
                   dp[i][j] = Math.max(bottom,Math.max(leftDia,rightDia));
                }


            }
        }

        int ans = Integer.MIN_VALUE;

        for(int i = 0 ; i < m ; i++){
            ans = Math.max(ans, dp[0][i]);
        }
        return ans;
    }
}
