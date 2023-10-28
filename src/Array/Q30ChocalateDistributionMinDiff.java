package Array;

import java.util.ArrayList;
import java.util.Collections;

public class Q30ChocalateDistributionMinDiff {
    public static void main(String[] args) {

    }
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        if(a.size() == 0 || a.size()==1)return 0L;
        int i = 0;
        int j= m-1 ;
        long min = Integer.MAX_VALUE;
        Collections.sort(a);

        while(j < n){
            long curDiff = a.get(j)-a.get(i);
            if(min>curDiff){
                min =curDiff;
            }
            i++;
            j++;
        }
        return min ;
    }
}
