package String;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Q29SecFreqString {
    public static void main(String[] args) {
//        String str [] = {"geeks" , "for" , "geeks" , "abc", "geeks" , "for"};
//        String str [] = {"geeks", "abc"};
        String str [] = {"geeks","geeks","abc", "abc"};
        System.out.println(secFrequent(str,str.length));
    }

   private static String secFrequent(String arr[], int N)
    {
        HashMap<String , Integer> map = new HashMap<>();

        for(int i = 0 ; i <arr.length ; i++)
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);


        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        String maxStr = "";
        String secMaxStr = "";

        for(Map.Entry entry : map.entrySet()){
            int val = (int)entry.getValue();
            String key= entry.getKey().toString();
            if (max < val){
                secMax = max;
                max = val;
                secMaxStr = maxStr;
                maxStr = key;
            }else if (secMax < val && max > val){
                secMax = val;
                secMaxStr = key;
            }
        }
        return secMaxStr;
    }
}
