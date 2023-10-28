package Array;

import java.util.HashMap;

public class Q17 {
    public static void main(String[] args) {
    int arr[] = {1,1,1,1};
    int arr2[] = {1,5,7,1};
        System.out.println(getPairsCount(arr, 4,2));
    }
    static int countSum(int []arr , int sum){
        int count = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], hashMap.get(arr[i])+1);
            }else{
                hashMap.put(arr[i],1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(sum - arr[i])){
                count += hashMap.get(sum-arr[i]);
            }
        }
    return 1;}
//    static int getPairsCount(int[] arr, int n, int k) {
//        // code here
//        HashMap<Integer,Integer> map =new  HashMap<>();
//
//        int ans = 0;
//        for(int i : arr){
//            ans = ans + map.getOrDefault(k - i,0);
//            map.put(i,map.getOrDefault(i,0)+1);
//        }
//        return ans;
//    }
    static int getPairsCount(int[] arr, int n, int k) {

        HashMap<Integer,Integer> map =new  HashMap<>();
        int ans = 0;
        for(int i : arr){

            if (map.containsKey(k-i)) ans = ans+ map.get(k-i);
            if (map.containsKey(i)) map.put(i,map.get(i)+1);
            else  map.put(i,1);

        }
        return ans;
    }

}
