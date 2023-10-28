package String;

public class Q28MinFlipBinary {
    public int minFlips(String S) {

        if(S.length()==1)return 0;

        int min1 = 0 ;
        int min2 = 0 ;


        for(int i = 0 ; i < S.length() ; i++){

            //first possibility - 0 at first ind
            if(i%2==0 && S.charAt(i) != '0') min1++;
            else if(i%2!=0 && S.charAt(i) != '1') min1++;

            //second possibility - 1 at first ind
            if(i%2==0 && S.charAt(i) != '1') min2++;
            else if(i%2!=0 && S.charAt(i) != '0') min2++;
        }

        return Math.min(min1, min2);

    }
}
