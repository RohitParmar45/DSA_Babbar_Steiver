package DP_By_Steiver;

import java.util.HashMap;

public class Q7NinjaTraining {
    public static void main(String[] args) {
     int [][] arr  = {{1,2,3},
                       {4,5,6}  };

     int [][] arr2  = {{1, 2, 5},
                       {3 ,1 ,1},
                        {3, 3 ,3}  };

      int [][] arr3 = {{1, 2, 5},
                       {3 ,1 ,1},
                        {3, 3 ,3}  };
        System.out.println(ninjaTraining(arr.length,arr));
        System.out.println(ninjaTraining(arr2.length,arr2));
    }

        public static int ninjaTraining(int n, int[][] points) {

//            return helper (points,  n-1, 3 );
//            return helper2 (points,  n-1, 3,new int[n][4] );

//             return helper3(points,n);
             return helper4(points,n);

        }
       private static int helper(int[][] arr, int index , int skip){

        if(index==0){
            int curMax = 0;
            for (int i = 0; i < 3; i++) {
                if (i!=skip){
                    curMax = Math.max(curMax,arr[index][i]);
                }
            }
            return curMax;
        }
           int max = 0;
           for (int i = 0; i < 3; i++) {
               if (i!=skip){
             int curMax =  helper(arr,index-1,i) + arr[index][i];
             max = Math.max(curMax,max);}
           }

       return max;
       }

       /**memoization*/
    private static int helper2(int[][] arr, int index , int skip, int [][]dp){

        if(index==0){
            int curMax = 0;
            for (int i = 0; i < 3; i++) {
                if (i!=skip){
                    curMax = Math.max(curMax,arr[index][i]);
                }
            }
            return curMax;
        }

        if (dp[index][skip] != 0)return dp[index][skip];
        int max = 0;
        for (int i = 0; i < 3; i++) {
            if (i!=skip){
                int curMax =  helper2(arr,index-1,i,dp) + arr[index][i];
                max = Math.max(curMax,max);

            }
        }
        return  dp[index][skip] = max;
    }

    /**tabulation*/
    private static int helper3(int[][] arr, int n){ //n means len-1;
        int max = 0;
        if (n == 0 ){
            for (int i = 0; i < 3; i++) {
               int curi = arr[0][i];
                max = Math.max(curi,max);
            }

        }

        int[][]prev = new int[n][4]; //4 because we have 4 choice 0,1,2,3
        prev[0][0] = Math.max(arr[0][1],arr[0][2]);
        prev[0][1] = Math.max(arr[0][0],arr[0][2]);
        prev[0][2] = Math.max(arr[0][1],arr[0][0]);
        prev[0][3] = Math.max(arr[0][1],Math.max(arr[0][0],arr[0][2]));

        for (int i = 1 ; i < n ; i++){

            for (int j = 0 ; j < n ; j++){
                int curi = arr[i][j] + prev[i-1][j];
                max = Math.max(curi, max);
                prev[i][j]= max;
            }
        }
        return max;
    }

    /**space Optimisation*/
    private static int helper4(int[][] arr, int n){ //n means len-1;
        int max = 0;
        if (n == 0 ){
            for (int i = 0; i < 3; i++) {
                int curi = arr[0][i];
                max = Math.max(curi,max);
            }

        }

        int[]prev = new int[4]; //4 because we have 4 choice 0,1,2,3
        prev[0] = Math.max(arr[0][1],arr[0][2]);
        prev[1] = Math.max(arr[0][0],arr[0][2]);
        prev[2] = Math.max(arr[0][1],arr[0][0]);
        prev[3] = Math.max(arr[0][1],Math.max(arr[0][0],arr[0][2]));

        for (int i = 1 ; i < n ; i++){

            int temp [] = new int[4];
            for (int j = 0 ; j < n ; j++){
                int curi = arr[i][j] + prev[j];
                max = Math.max(curi, max);
                temp[j]= max;
            }
            prev = temp;
        }
        return max;
    }

}
