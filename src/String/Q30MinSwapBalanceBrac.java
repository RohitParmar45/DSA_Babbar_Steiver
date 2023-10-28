package String;

import java.util.Stack;

public class Q30MinSwapBalanceBrac {
    public static void main(String[] args) {
        String ss = "]]][[[";
        System.out.println(minimumNumberOfSwaps(ss));
    }

    static int minimumNumberOfSwaps(String s) {

        int open = 0, close = 0, unbalanced = 0, ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[') {
                open++;
                if (unbalanced > 0) {
                    ans += unbalanced;
                    unbalanced--;
                }
            } else {
                close++;
                unbalanced = close - open;
            }
        }

        return ans;

    }
}