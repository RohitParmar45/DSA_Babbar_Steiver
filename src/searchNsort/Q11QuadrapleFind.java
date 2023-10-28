package searchNsort;

import java.util.ArrayList;
import java.util.Arrays;

public class Q11QuadrapleFind {
    public static void main(String[] args) {
        int[]arr= {0,0,2,1,1};
        for(ArrayList<Integer> arr2 : fourSum(arr,3)){
            System.out.println(Arrays.toString(arr2.toArray()));
        }
    }

    static public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i = 0 ; i < n-3 ; i++){

            for(int j = i+1 ; j < n-2 ; j++){

                int tarSum = k-(arr[i]+arr[j]);
                int s = j+1 ;
                int e = n-1;

                while(s<e){

                    int curSum = arr[s]+arr[e];
                    if(curSum == tarSum ){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[s]);
                        temp.add(arr[e]);
                        temp.add(arr[j]);
                        res.add(temp);
                        s++;
                        e--;
                    }
                    else if (curSum<tarSum) s++;
                    else e--;
                }

            }

        }

        return res;

    }
}
