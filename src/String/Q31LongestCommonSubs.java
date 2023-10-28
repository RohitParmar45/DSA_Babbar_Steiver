package String;

public class Q31LongestCommonSubs {
    public static void main(String[] args) {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";
        System.out.println(lcs(s1.length(),s2.length(),s1,s2));
    }
    static int lcs(int x, int y, String s1, String s2)
    {
        int[][] dp = new int[x+1][y+1];

        return helper(x, y, s1, s2,dp )  ;

    }

    private static int helper(int i , int j , String s1 , String s2, int[][]dp){
        if(i==0 || j==0)return dp[i][j] = 0;

        if(dp[i][j]!=0)return dp[i][j];

        if(s1.charAt(i-1) == s2.charAt(j-1))
            return dp[i][j] = 1 + helper(i-1, j-1, s1,s2,dp);
        else{
            int include = helper(i, j-1, s1,s2,dp);
            int exclude = helper(i-1, j , s1 ,s2,dp);
            return dp[i][j] = Math.max(include, exclude);
        }
    }}