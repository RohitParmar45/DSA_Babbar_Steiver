package String;

import java.util.ArrayList;
import java.util.Arrays;

public class Q7CountNSay {
    public static void main(String[] args) {

        System.out.println(countNSay(1));
        System.out.println(countNSay(2));
        System.out.println(countNSay(3));
        System.out.println(countNSay(4));
        System.out.println(countNSay(5));
    }
    public static String countNSay(int n){

        if(n == 1)return "1";

        String s = countNSay(n-1);
        int i = 1, count = 1;
        int num = s.charAt(0)-'0';
        StringBuilder sb = new StringBuilder();

        while(i < s.length()){

            if(s.charAt(i)-'0'==num)count++;
            else{
                sb.append(count).append(num);
                num = s.charAt(i)-'0';
                count=1;
            }
            i++;
        }
        sb.append(count).append(num);
     return sb.toString()  ;
    }


}
