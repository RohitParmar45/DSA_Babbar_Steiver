package DP_By_Steiver;

public class Q1Fibonacci {

    /**
     * TC - O(N)
     * SC - O(N) + 0(N) // HERE ONE O(N) - STACK USED FOR RECURSION AND ONE FOR TRAVERSEL FOR n*/
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return  fibonacci(n-1) + fibonacci(n-2);
    }
    /**
     * TC - O(N)
     * SC - O(N) */
    public static int fibonacci(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n] = fibonacci(n-1, dp) + fibonacci(n-2, dp);
        return dp[n];
    }

    /**
     * TC - O(N)
     * SC - O(1) */
    public static int fibonacciOptimise(int n) {
        if(n <= 1)return n;

        int prev1 = 0 ;
        int prev2 = 1 ;

        for(int i = 2 ; i<=n ; i++){
            int curi = prev1 + prev2;
            prev1 = prev2;
            prev2 = curi;
        }
        return prev2;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n+1];
        System.out.println("The " + n + "th Fibonacci number is " + fibonacci(n, dp));

        System.out.println(fibonacciOptimise(10));
    }
}
