package String;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q10AllSubsequences {

    public static void main(String[] args) {
        String s = "abc";
        allSubsequence(s);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
          String ss =   iterator.next();
            System.out.println(ss);
        }
    }

    static ArrayList<String> list = new ArrayList<>();

   private static int allSubsequence (String s){

        if(s.length() == 0){
            list.add("");
            return 1;
        }

        int lengthOfList = allSubsequence(s.substring(1));

        for(int i= 0 ; i< lengthOfList; i++){
            list.add(s.charAt(0)+list.get(i));
        }
        return list.size();
    }

}
