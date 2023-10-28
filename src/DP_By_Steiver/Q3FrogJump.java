package DP_By_Steiver;

public class Q3FrogJump {
    public static void main(String[] args) {
       int height[] = {10,20,30,10};
        System.out.println(frogJump(height.length,height));
    }

    private static int frogJump(int n, int heights[]) {

        int arr[] = new int[n];
//        return helper(n-1, heights, arr);
          return tabular(n, heights);
    }

    /**MEMOIZATION*/
    /** TC - 0(N)
     * SC - 0(n)+0(n) --  array and stack for recursion used
     */
    private static int helper(int n,int heights[] ,int[] arr){
        if(n==0){
            return 0 ;
        }
        if(arr[n]!=0)return arr[n];

        int left = helper(n-1,heights,arr) + Math.abs(heights[n]-heights[n-1]);
        int  right = Integer.MAX_VALUE;
        if(n>1)
            right = helper(n-2,heights,arr) + Math.abs(heights[n]-heights[n-2]);


        arr[n] = Math.min(left, right);
        return arr[n];
    }

    /**TABULAR  --- Space Optimisation */
    /** TC - 0(N)
     * SC - 0(1) -- no array or no stack used
     */
    private static int tabular(int n , int heights[]){

        if(n==0)return 0;
        if(n==1) return Math.abs(heights[1]-heights[0]);


         int prev1 = 0;
         int prev2 = Math.abs(heights[1]-heights[0]);


        for(int i = 2 ; i < n ; i++){

            int left = prev2 + Math.abs(heights[i]-heights[i-1]);
            int right = prev1 + Math.abs(heights[i]-heights[i-2]);
            prev1 = prev2;
            prev2 = Math.min(left,right);
        }

        return prev2;
    }

}

