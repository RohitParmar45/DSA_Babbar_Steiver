package String;

import java.util.HashSet;

public class Q33SmallestDistintWindow {
    public static void main(String[] args) {
//        System.out.println(findSubString("AABBBCBBAC"));
//        System.out.println(findSubString("aaab"));
        System.out.println(findSubString("GEEKSGEEKSFOR"));
    }
    public  static int findSubString( String str) {
        HashSet<Character> set = new HashSet<>();

        for(int i =0 ; i < str.length() ; i++){
            set.add(str.charAt(i));
        }
        //start is temperory , startInd is actual
        int start = 0, startInd = 0 , setSize = set.size(),
                count = 0 , cur_len = 0, min_len = Integer.MAX_VALUE;
        int [] visited = new int[256] ;

        for(int i = 0 ; i < str.length(); i++){
            visited[str.charAt(i)]++;

            if(visited[str.charAt(i)]==1)count++;
            //shrink possible
            if(count == setSize){
                while(visited[str.charAt(start)] > 1){
                    visited[str.charAt(start)]--;
                    start++;
                }
                cur_len = i-start+1;
                if(cur_len < min_len){
                    min_len =  cur_len;
                    startInd = start;
                }
            }
        }

        return min_len ;

    }
}
