package String;

import java.util.Arrays;

public class Q6SuffledSubstring {
    public static void main(String[] args) {
        String s1 = "XY";
        String s2 = "12";
        String res = "X1Y2";

        System.out.println(suffledSubstring(s1,s2,res)); //RETURN TRUE
    }
    private static boolean suffledSubstring(String s1, String s2, String res){

        int n = s1.length();
        int m = s2.length();
        int o = res.length();
        if (o!=n+m)return false;

        int i = 0 ; int j =0; int k = 0;

        while (k<o){

            if(i<n && s1.charAt(i)==res.charAt(k)) i++;
            else if(j <m && s2.charAt(j) == res.charAt(k))j++;
            else return false;

            k++;
        }
        return i >= n && j >= m;

    }
}
