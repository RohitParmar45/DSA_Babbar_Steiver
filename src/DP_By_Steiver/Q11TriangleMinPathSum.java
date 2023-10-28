package DP_By_Steiver;

public class Q11TriangleMinPathSum {
    public static void main(String[] args) {
        //https://www.codingninjas.com/codestudio/problems/triangle_1229398

        int [][] triangle= {
                {1},
                {2,3},
                {4,5,6},
                {7,8,9,10}
        };
        int[][] triangle2 = {
                {2},
                {3, 4},
                {6, 5, 7},
                {4, 1, 8, 3}};
        int[][] triangle3 = {
                {5},
                {-1, 3},
                {22, 1, -9}};
        System.out.println(minimumPathSum(triangle,triangle.length));//14
        System.out.println(minimumPathSum(triangle2,triangle2.length));//11
        System.out.println(minimumPathSum(triangle3,triangle3.length));//-1

    }
    private static int minimumPathSum(int[][] triangle, int n) {
//         return helper(triangle,0,0,n);
//         return helper2(triangle,0,0,n,new int[n][n]);
         return helper3(triangle,n);

    }
    private static int helper(int[][] triangle,int i , int j , int n) {

        if (i==n-1)return triangle[i][j];

        int bottom = Integer.MAX_VALUE;
        int diagonal = Integer.MAX_VALUE;

        if(i<n-1){
            bottom = triangle[i][j] + helper(triangle,i+1,j, n);
            diagonal = triangle[i][j] + helper(triangle,i+1,j+1, n);
        }

        return Math.min(bottom,diagonal);
    }
    private static int helper2(int[][] triangle,int i , int j , int n,int[][]dp) {

        if (i==n-1)return triangle[i][j];
        if (dp[i][j]!=0)return dp[i][j];
        int bottom = Integer.MAX_VALUE;
        int diagonal = Integer.MAX_VALUE;

        if(i<n-1){
            bottom = triangle[i][j] + helper2(triangle,i+1,j, n,dp);
            diagonal = triangle[i][j] + helper2(triangle,i+1,j+1, n,dp);
        }

        return dp[i][j] = Math.min(bottom,diagonal);
    }
    private static int helper3(int[][] triangle ,int n) {
        if(n==1)return triangle[0][0];

        int [][]dp = new int[n][n];

        System.arraycopy(triangle[n - 1], 0, dp[n - 1], 0, n);

        for (int i = n-2 ; i>=0 ; i--){

            for (int j = 0 ; j < triangle[i].length ; j++){
              int down = triangle[i][j]+dp[i+1][j];
              int diagonal = triangle[i][j]+dp[i+1][j+1];
                 dp[i][j] = Math.min(diagonal,down);
            }
        }
        return dp[0][0];
    }


}
