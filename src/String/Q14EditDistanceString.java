package String;

import java.util.Arrays;
import java.util.LinkedList;

public class Q14EditDistanceString {
    public static void main(String[] args) {

    }
    public int editDistance(String s, String t) {

        return helper(0,0,s,t);
    }
    private static int helper(int i, int j , String s , String t){

        if(i==s.length()){
            return t.length()-j;
        }
        if(j==t.length()){
            return s.length()-i;
        }

        int ans = 0;
        if(s.charAt(i)==t.charAt(j)){
            return helper(i+1,j+1,s,t);
        }
        else {

            int insert = 1 + helper(i,j+1, s, t);

            int remove = 1+ helper(i+1 , j , s , t);

            int replace = 1 + helper(i+1, j+1, s, t);

            ans = Math.min(insert, Math.min(remove, replace));

        }
        return ans;
    }
    //memoization
    private static int helper2(int i, int j , String s , String t, int[][]dp){

        if(i==s.length()){
            return t.length()-j;
        }
        if(j==t.length()){
            return s.length()-i;
        }

        if(dp[i][j]!=0)return dp[i][j];

        int ans = 0;
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j] = helper2(i+1,j+1,s,t,dp);
        }
        else {

            int insert = 1 + helper2(i,j+1, s, t,dp);

            int remove = 1+ helper2(i+1 , j , s , t,dp);

            int replace = 1 + helper2(i+1, j+1, s, t,dp);

            ans = Math.min(insert, Math.min(remove, replace));

        }
        return dp[i][j] = ans;


    }
}
