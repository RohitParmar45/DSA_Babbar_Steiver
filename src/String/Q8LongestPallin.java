package String;

public class Q8LongestPallin {
    public static void main(String[] args) {
//        String S = new String("aaaabbaa");
//        String S2 = ("aa");
//        String S3 = "11311";
//        String S4 = "123";
//        String S5 = "xbabz";
//        System.out.println(longestPalin(S));
//        System.out.println(longestPalin(S2));
//        System.out.println(longestPalin(S3));
//        System.out.println(longestPalin(S4));
//        System.out.println(longestPalin(S5));


         new Q8LongestPallin().longestPalin("dsfds");

         new Q8LongestPallin();
                 //method - special type = constructor
                 //method


    }
     String longestPalin(String str){
        int n = str.length();
        int max = 1;
        int finalS = 0;


        for(int i = 0; i< n; i++){

            /** for Odd expecting pallindrome substring*/
            int s = i-1 ;
            int e = i;

            while(s>=0 && e<n && str.charAt(s)==str.charAt(e)){

                if(e-s+1 > max){
                    max = e-s+1;
                    finalS= s;
                }
                s--;
                e++;
            }

            /** for Even expecting pallindrome substring*/

            s = i-1 ;
            e = i+1;

            while(s>=0 && e<n && str.charAt(s)==str.charAt(e)){
                if(e-s+1 > max){
                    max = e-s+1;
                    finalS= s;
                }
                s--;
                e++;
            }
        }
        return str.substring(finalS,finalS+max);
    }
}
