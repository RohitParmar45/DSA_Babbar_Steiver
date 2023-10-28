package String;
import java.util.*;
import java.io.*;

public class Q11PermutationOfString {

    public static void main(String[] args) {
     String s = "abc" ;
     permutation(0,s);
    }

    private static  void permutation(int index, String s){

        if(index==s.length()-1){
            System.out.println(s);
            return;
        }

        for (int i = index; i < s.length(); i++) {
            //swap
            s = swap(s,i,index);
            //find
            permutation(index+1,s);
            //backtracking
            s= swap(s,i,index);
        }
    }

    private static String swap(String s, int i, int index) {
        char[] ch = s.toCharArray();
        char p = ch[i];
        ch[i] = ch[index];
        ch[index]=p;
        return String.valueOf(ch);

    }
}
