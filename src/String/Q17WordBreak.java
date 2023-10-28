package String;

import java.util.ArrayList;

public class Q17WordBreak {
    public static void main(String[] args) {
      String s = "iamsamsung";

      ArrayList<String> B = new ArrayList<>();
      B.add("iam");
      B.add("na");
      B.add("samsung");

      ArrayList<String> B2 = new ArrayList<>();
      B2.add("cat");
      B2.add("and");
      B2.add("dog");
      B2.add("n");
      B2.add("an");
        String s2 = "catanddog";
//        System.out.println(wordBreak(s,B));
        System.out.println(wordBreak(s2,B2));

    }
//    private static int wordBreak(String A, ArrayList<String> B )
//    {
//        int contain = 0;
//        int i = 0;
//        String substring = A.substring(0,1);
//        int j = 0;
//        while (j<A.length()){
//            //single word substring
//            if (B.contains(substring)){
//                contain = 1;
//                j++;
//                if (j<A.length())substring = A.substring(j,j+1);
//                i=0;
//            }
//            else if(i==j){
//                j++;
//                i=0;
//                if (j<A.length())substring = A.substring(j,j+1);
//                contain = 0;
//            }
//            //multiword substring
//            else{
//                contain = 0;
//                substring = A.substring(i,j+1);
//                i++;
//            }
//        }
//        return contain;
//    }

    public static int wordBreak(String A, ArrayList<String> B )
    {
        if(A.length()==0)
            return 1;

        for(int i=0; i<A.length(); i++)
        {
            String word=A.substring(0,i+1);
            if(B.contains(word))
            {
                int ans = wordBreak(A.substring(i+1),B);
                if(ans==1)
                    return 1;
            }
        }


        return 0;

    }
    public static int wordBreak2(String A, ArrayList<String> B)
    {
        if(A.length()==0)
            return 1;

        for(int i=0; i<A.length(); i++)
        {
            String word=A.substring(0,i+1);
            if(B.contains(word))
            {
                int ans = wordBreak(A.substring(i+1),B);
                if(ans==1)
                    return 1;
            }
        }


        return 0;

    }

}
