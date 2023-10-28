package searchNsort;

import java.util.Arrays;

public class Q13FindTriplet {

        long countTriplets(long arr[], int n,int sum)
        {
            Arrays.sort(arr);
            return helper(arr, n , sum);
        }

        static long helper(long arr[],int n , int sum){

            long res = 0;

            for(int i = 0 ; i  < n-2 ; i++){

                int j = i+1;
                int k = n-1;

                while(j<k)
                {
                    long cur = arr[i]+arr[j]+arr[k];
                    if(cur<sum){
                        res+=k-j;  //eg 1 2 3 4 5if (1 2 5) then (1 2 4) and (1 2 3) also
                        j++;
                    }else k--;
                }
            }
            return res;
        }
    }

