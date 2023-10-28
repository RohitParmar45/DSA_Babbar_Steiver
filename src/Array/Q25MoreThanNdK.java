package Array;

import java.util.*;

public class Q25MoreThanNdK {
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 2, 1, 2, 3, 3}; int k = 4, n = arr.length;;
        int arr2[] = {9, 8, 7, 9, 2, 9, 7};int k2 = 3, n2 = arr2.length;;

        System.out.println(Arrays.toString(moreThanNdK(arr,k,n)));
        System.out.println(Arrays.toString(moreThanNdK(arr2,100,n2)));
    }
    public  static Integer[] moreThanNdK(int[] arr, int k , int n){

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int e: arr) {
            map.put(e,map.getOrDefault(e,0)+1);
        }
        int num = n/k;
        List<Integer> list = new ArrayList<>();

        for (int o : map.keySet()) {
            if (map.get(o) > num) list.add(o);
        }
        return list.toArray(new Integer[list.size()]);
    }

}
