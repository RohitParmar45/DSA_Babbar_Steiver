package DP_By_Steiver;

public class Q2CountStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    /**
     Time complexity:
     O(n) -> As we are visiting all values of n atleast 1 time.

     Space complexity:
     O(n) + O(n) - > (Recursive calls + Array of size n)
     * */


    private static int climbStairs(int n) {
        int [] arr= new int[n+1];
       return helper(n,arr);

    }
    private static int helper(int n, int []arr) {
        if(n == 0)return 1;
        if(n==1)return 1;
        if(arr[n]!=0)return arr[n];
        arr[n] = helper(n-1, arr)+helper(n-2,arr);
        return arr[n];
    }
}
