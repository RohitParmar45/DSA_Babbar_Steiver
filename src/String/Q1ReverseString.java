package String;

import java.util.Arrays;

public class Q1ReverseString {
    public static void main(String[] args) {
        char[] str = {'a' , 'b' , 'c'};
        reverseStringArr(str);
        System.out.println(Arrays.toString(str));

        String s = "Rohit";
        reverseString(s);
    }
    //TC - O(N)
    //SC - O(1)
    public static void reverseStringArr(char[] s) {
        if(s==null || s.length==1)return;

        int str = 0;
        int end = s.length-1;

        while(str<end){
            char temp = s[str];
            s[str] = s[end];
            s[end]= temp;
            str++;
            end--;
        }
    }

    //TC - O(N)
    //SC - O(N) BUT IT WILL NOT ALTER THE ORIGINAL STRING
    public static void reverseString(String s){
        StringBuilder sb = new StringBuilder();
        for (int i=s.length()-1; i >=0; i--){
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }

    //TC - O(N)
    //SC - O(1) BUT IT WILL ALTER THE ORIGINAL STRING
    public static void reverseString(char[] s) {
        if(s==null || s.length==1)return;

        int str = 0;
        int end = s.length-1;

        while(str<end){
            char temp = s[str];
            s[str] = s[end];
            s[end]= temp;
            str++;
            end--;
        }
    }
}
