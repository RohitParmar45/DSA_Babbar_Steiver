package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q6Union {
    public static void main(String[] args) {
        int [] arr1= {1,2,3};
        int [] arr2= {3,4};
        int [] arr3= {9,5,1};

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        } for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        } for (int i = 0; i < arr3.length; i++) {
            set.add(arr3[i]);
        }
        System.out.println(Arrays.toString(set.toArray()));
    }
}
