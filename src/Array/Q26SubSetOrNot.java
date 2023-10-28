package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Q26SubSetOrNot {
    public static void main(String[] args) {

    }
    public String isSubset( long a1[], long a2[], long n, long m)
    {    if(m==0){
        return "Yes";    }
        HashMap<Long, Long> hm = new HashMap<>();

        for(int i = 0 ; i<n ; i++){
            hm.put(a1[i], hm.getOrDefault(a1[i], 0L)+1L);
        }
        for(int i = 0 ; i < m ; i++){
            if(hm.getOrDefault(a2[i],0L) == 0L)
            return "No";
            hm.put(a2[i],hm.get(a2[i])-1L);
           }
        return "Yes";
    }

}
