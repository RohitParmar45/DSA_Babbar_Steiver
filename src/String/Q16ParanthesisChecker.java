package String;

import java.util.LinkedList;
import java.util.Stack;

public class Q16ParanthesisChecker {
    public static void main(String[] args) {
        String s = "(((((";
        String s2 = "]]]]]";
        String s3 = "()(){[[]]}";
//        System.out.println(ispar(s));
        System.out.println(ispar(s3));

    }
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        if(x.length()<=1)return false;

        Stack<Character> stack = new Stack<Character>();

        int n = x.length();

        for(int i = 0 ; i< n ; i++){

            char ch = x.charAt(i);

            if(ch == '('|| ch == '{' || ch == '['){
                stack.push(ch);
            }else if(!stack.isEmpty() && (ch == ')' || ch == '}' || ch == ']')){
                if(ch == ')' && stack.peek() == '('){
                    stack.pop();
                }else
                if(ch == '}' && stack.peek() == '{'){
                    stack.pop();
                }else
                if(ch == ']' && stack.peek() == '['){
                    stack.pop();
                }else return false;
            }
            else return false;
        }
        return stack.isEmpty();
    }
}
