package String;

import java.util.Locale;

public class Q20MobileNumericKeypad {
    public static void main(String[] args) {
        //IMAGE ADDRESS - https://media.geeksforgeeks.org/wp-content/cdn-uploads/Mobile-keypad.png
        //https://www.geeksforgeeks.org/convert-sentence-equivalent-mobile-numeric-keypad-sequence/
        String ss = "gfg";
        String ss2 = "GEEKSFORGEEKS";
       mobNumKeyPad(ss2);
    }
    private static void mobNumKeyPad(String ss){

        String s = ss.toUpperCase();

        for (int i = 0 ;i < s.length(); i++){

            char ch = s.charAt(i);

            //base Cases
            if (ch=='*'){
                System.out.print("*");
            }
           else if (ch=='0') System.out.print("0");
            else if (ch=='#') System.out.print("#");
            else if (ch > 'V'){
                for (int j = 'W' ; j <= ch; j++){
                    System.out.print("9");
                }
            }
            else if (ch > 'O' && ch < 'T'){
                for (int j = 'P' ; j <= ch; j++){
                    System.out.print("7");
                }
            }
            else{
                int cellNo = (ch-'A')/3 + 2;
                int charNum = (ch-'A')%3 +1;
                for (int p = 1 ; p<= charNum; p++ ){
                    System.out.print(cellNo);
                }
            }
        }
    }
}
