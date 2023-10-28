package RecursionBySteiver;

import java.util.ArrayList;
import java.util.List;

public class PallindromePartition {
    static public List<List<String>> partition(String s) {
        List < List<String>> res = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        helper(0,s,res, ds);
        return res;
    }

   static public void helper(int ind , String s,List<List<String> >res , List<String> ds){

        if(ind==s.length()){
            res.add(new ArrayList<>(ds));
            return;
        }

        for(int i = ind ; i < s.length() ; i++){

            if(pallindrome(s,ind, i)){
                ds.add(s.substring(ind, i+1));
                helper(i+1,s, res, ds);
                ds.remove(ds.size()-1);
            }

        }

    }

   static public boolean pallindrome(String s, int i , int j){

        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";

        for (List<String>l:partition(s)) {
            System.out.println(l.toString());
        }
    }
}
