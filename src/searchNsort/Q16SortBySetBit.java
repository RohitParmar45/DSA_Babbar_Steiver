package searchNsort;

import java.util.*;

public class Q16SortBySetBit {

    public static void main(String[] args) {
        Integer arr[] = {10,2,5,1,12,0};
        sortBySetBitCount(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void sortBySetBitCount(Integer arr[], int n)
    {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0 ; i< n ; i++){
            int bin = numToBit(arr[i]);
            map.put(countBit(bin),bin);
        }

        // Sort the map by keys in descending order
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(Collections.reverseOrder());
        sortedMap.putAll(map);

        int i=0;
        for(int val : map.values()){
           arr[i] = bitToNum(map.get(val));
           i++;
        }

    }

    static Integer numToBit(int num){
        int fac = 10;
        int res = num%2;
        num = num/2;

        while(num!=0){
            res = (num%2)*fac+res;
            num = num/2;
            fac*=10;
        }

        return res;

    }

    static Integer countBit(int num){

       String ss =  String.valueOf(num);
       int n = ss.length();
       int res = 0;

       for(int i = 0 ; i<n ; i++){
           if(ss.charAt(i)=='1')res++;
       }
       return  res;
    }

   private  static Integer bitToNum (Integer num){

        String s = String.valueOf(num);
         int res = 0 ;
         int fac = 1;
        for (int i = s.length()-1 ; i >=0 ; i--){
            res+= s.charAt(i)*fac;
            fac*=2;
        }
        return res;
   }
}
