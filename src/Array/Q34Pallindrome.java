package Array;

public class Q34Pallindrome {
    public static void main(String[] args) {
        //negative num are not pallindrom
        int [] num = {1221,131,132231};
        System.out.println(palinArray(num));
    }
    public static int palinArray(int[] a){

        for (int num:a) {
           int result = pallindromeCheck(num);
           if (result == 0) return 0;
        }
        return 1;
    }
    static  int pallindromeCheck(int num){
        if (num<0)return 0;

        int rev = 0;
        int temp  = num ;

        while (temp > 0){
            int digit = temp%10 ;
            rev = rev*10 + digit;
            temp = temp/10;
        }
         if(rev == num)return 1;
         return 0;
    }
}
