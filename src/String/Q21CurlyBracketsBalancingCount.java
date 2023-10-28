package String;

import java.util.Stack;

public class Q21CurlyBracketsBalancingCount {
    public static void main(String[] args) {
       String S = "}{";
        System.out.println(countRev(S));
    }
   private static int countRev (String s)
    {

        if(s.length()%2!=0)return -1;

        Stack<Character> st = new Stack<Character>();

        int c1 = 0; // for }
        int c2 = 0; //for {

        for(int i = 0 ; i<s.length(); i++){

            char ch = s.charAt(i);

            if(ch=='{'){
                st.push('{');
                c2++;
            }
            else if(ch=='}' && !st.isEmpty()){
                st.pop();
                c2--;
            }
            else c1++;
        }

        if(c1%2!=0) c1 = c1/2+1;
        else c1 = c1/2;

        if(c2%2!=0) c2 = c2/2+1;
        else c2 = c2/2;

        return c1+c2;

    }

    }


