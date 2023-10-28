package DP_By_Steiver;

public class Q9UniquePathsButHavingDeadCells {
    public static void main(String[] args) {
        int[][] arr ={
                {0,0,0},
                {0,0,-1},
                {0,0,0}
        };
//        int arr[][] = new int [2][2];
        System.out.println(uniquePaths(arr, arr.length, arr[0].length));
    }
    private static int uniquePaths(int[][]arr, int n, int m){
        return helper(arr,n,m,0,0);
//        return helper2(arr,n,m,0,0, new int[n][m]);
//         return helper3(n,m);
    }

    /**Recursion
     * TC - 2^M*N  : BECAUSE AT EVERY POINT WE HAVE TWO CHOICES
     *SC - O(M+N) : PATH-LENGTH-STACK_SPACE
     *  */
    private static int helper(int[][] arr, int n , int m , int i , int j){

        if(i==n-1 && j==m-1)return 1;
        if (i<= n-1 && j <=n-1 && arr[i][j]==-1)return 0;
        int left = 0;
        int right = 0;
        if (i<n-1){left = helper(arr,n,m,i+1,j);}
        if (j<m-1){right = helper(arr,n,m,i,j+1);}
        return left+right;
    }

}
