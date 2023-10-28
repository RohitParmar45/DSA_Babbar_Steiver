package String;

public class Q5CheckRotationStrings {
    public static void main(String[] args) {
        String s1 = "Rama";
        String s2 = "maRn";
        System.out.println( checkRotion(s1,s2));
    }
    public static boolean checkRotion(String s1 , String s2){
        int n = s1.length();
        int m = s2.length();

        if (n != m) return false;

        String s3 = s1+s1;
        if(s3.contains(s2)){
            return true;
        }

        return  false;

    }
}
