package String;

import java.util.Arrays;

public class Q27LongestCommonPrefix {
    public static void main(String[] args) {
//        String [] strs =  {"flower","flow","flight"};
//        String [] strs =  {"dog","racecar","car"};
        String [] strs = {"abcdef" , "abc" , "xyss"};
        System.out.println(longestCommonPrefix(strs));

        // abcd abxd abcx
    }
    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
      String first = strs[0];
      String second = strs[1];

        int index = 0;
        String result ="";
        while (index < first.length()){
            if (first.charAt(index) == second.charAt(index)) index++;
            else break;
        }
        return index==0?"":first.substring(0,index);
    }


}
