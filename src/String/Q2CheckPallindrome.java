package String;

public class Q2CheckPallindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("raaR"));
    }
    public static int isPalindrome(String s) {
        if(s==null || s.length()==1)return 1;
        int str = 0;
        int end = s.length()-1;

        while(str<end){
            if(s.charAt(str) != s.charAt(end)) return 0;
            str++;
            end--;
        }
        return 1;
    }
//TC - O(N)
//SC- O(1)
}

