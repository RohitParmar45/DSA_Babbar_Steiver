package Array;

import java.util.HashMap;
import java.util.HashSet;

public class Q24LongestContinousSubarray {

    public static void main(String[] args) {
        int [] arr = {5,1,2,8,9,3};
        int [] arr2 = {5,1,2,8,9,};
        System.out.println(findLongestConseqSubseq(arr,arr.length));
        System.out.println(findLongestConseqSubseq(arr2,arr2.length));
    }
//
//    static int findLongestConseqSubseq(int arr[], int N)
//    {
//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        for(int e : arr){
//            map.put(e,map.getOrDefault(e,0)+1);
//        }
//
//        int max = 1;
//        int i = 0;
//
//        while(i<N){
//            int e = arr[i];
//            int cur = presents(e,map);
//            max = Integer.max(cur, max);
//            i++;
//        }
//       return max;
//    }
//    static int presents(int e,HashMap<Integer,Integer> map){
//        int E = e;
//        int len = 1;
//        while(map.containsKey(e-1)){
//            e = e-1;
//            len++;
//        }
//        e =E;
//        while(map.containsKey(e+1)){
//            e =e+1;
//            len++;
//        }
//        return len;
//    }
   static int findLongestConseqSubseq(int arr[], int N){
        if (N==0) return 0;
        if (N==1)return arr[0];

      int len =0;

       HashSet<Integer>set = new HashSet<>();
       for (int e:  arr) set.add(e);

      for (int i = 0 ; i < N ; i++){

           if (!set.contains(arr[i]-1)){
               int j = arr[i];
               while (set.contains(j)){
                   j++;
               }
               if (len<j-arr[i])len = j-arr[i];
           }
       }
       return len;
  }

}

