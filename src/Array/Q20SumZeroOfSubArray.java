package Array;

import java.util.HashMap;

public class Q20SumZeroOfSubArray {
    public static void main(String[] args) {
        System.out.println(findsum(new int[]{4 ,2, -3 ,1, 6},6));
    }
    static boolean findsum(int arr[],int n)
    {
        if(arr == null)  return false;

        HashMap<Integer, Integer> hm = new HashMap<>();

        int sum = arr[0] ;
        hm.put(sum,1);

        for(int i = 1 ; i<n ; i++ ){
            if(arr[i] == 0)return true;
            sum += arr[i];
            if(sum == 0)return true;
            if(hm.getOrDefault(sum,0) > 0) return true;
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return false;
    }


}
