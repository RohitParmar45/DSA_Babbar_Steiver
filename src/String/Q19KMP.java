package String;

import java.util.HashMap;

public class Q19KMP {
    public static void main(String[] args) {
       String s = "abab";
       String s2 = "aaaa";
        System.out.println(lps(s));
    }
   private static int lps(String s) {
        return bruteForce(s);
    }
    private static int bruteForce(String s){
        int n = s.length();
        int[]pie = new int[n];

        int i = 1;

        while(i<n){
            if(s.charAt(0)==s.charAt(i))pie[i]=1;
            i++;
        }

        i = 1;
        while(i<n){

            for(int p = 0 ; p<n ; p++){
                if(pie[p]==i){
                     if (p!= n-1 && s.charAt(p+1)==s.charAt(i)){
                        pie[p+1]=i+1;
                    }
                }
            }
            i++;
        }

        return pie[n-1];

    }}

