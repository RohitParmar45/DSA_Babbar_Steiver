package searchNsort;

import java.util.Arrays;
import java.util.HashMap;

public class Q15CountEq0 {
    public static void main(String[] args) {

    }
    public static long findSubarray(long[] arr ,int n)
    {
        HashMap<Long,Long> map = new HashMap<>();
        map.put(0L,1L);
        long sum = 0L;
        long count = 0L;

        for(int i = 0 ; i < arr.length ; i++){

            sum += arr[i];

            if(map.containsKey(sum)){
                long keyVal = map.get(sum);
                count += keyVal;
                map.put(sum, keyVal+1);
            }else map.put(sum, 1L);


        }

        return count;

    }
}
