package Array;

import java.util.Arrays;

public class Q35Median {
    public static void main(String[] args) {

    }
    public int find_median(int[] v)
    {
        if(v.length == 0) return 0;
        if(v.length == 1) return v[0];

        Arrays.sort(v);
        int length = v.length;
        int med = length/2;

        if(length%2==0){
            med = med-1;
            return (v[med]+v[med+1])/2;
        }
        else return v[med];


    }
}
