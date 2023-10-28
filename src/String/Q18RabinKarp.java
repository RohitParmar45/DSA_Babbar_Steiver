package String;

public class Q18RabinKarp {
    public static void main(String[] args) {

      String  txt ="THIS IS A TEST TEXT";
      String  pat ="TEST";

        String txt2 =  "AABAACAADAABAABA";
        String pat2 =  "AABA";

        bruteForce(txt2,pat2);
        rabinkarp(txt2,pat2);
    }
    //time complexity - O(n*m) n-txt m-pat
  private static void bruteForce(String txt, String pat){
      int i = 0;
      int j = pat.length();
      int count = 0;

      while (j<=txt.length()){
          String temp = txt.substring(i,j);
          if (pat.equals(temp)){
              System.out.print(i + " ");
              count+=1;
          }
          i++;
          j++;
      }
      System.out.println("Total - " + count);

  }

  private static void rabinkarp(String txt , String pat){


        int patCount =0, txtCount = 0;
        for(int i = 0 ; i<pat.length(); i++) patCount += pat.charAt(i);
        for(int k = 0 ; k<pat.length(); k++) txtCount += txt.charAt(k);

      int i = 0;
      int j = pat.length();

      while (j<=txt.length()){
          if (txtCount==patCount) {
              if (pat.equals(txt.substring(i, j))) System.out.print("index "+ i + " ");
          }
          if (j<txt.length()){
              int exclude =txt.charAt(i);
              int include = txt.charAt(j);
              txtCount= txtCount-exclude+include;
          }
          i++;
          j++;
      }
  }
}

