package String;

import java.util.HashMap;
import java.util.Map;

public class Q3PrintDuplicate {

    public static void main(String[] args) {
        String s = "Rohit Rohit p    ";
        duplicate(s);
    }

    // Using HashMap TC - O(N) SC - O(N)
    // Using Sorting TC - O(NLOGN) SC - O(N)  /SPACE COMPL. o(n) as string is immutable
    public static void  duplicate(String s ){
        int n = s.length(); //including spaces
        HashMap<Character,Integer>map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue() >1){
                System.out.println("Character " + entry + " repeated " + entry.getValue() + " times");
            }
        }

    }
}

