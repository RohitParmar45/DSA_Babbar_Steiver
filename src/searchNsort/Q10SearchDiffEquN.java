package searchNsort;

import java.util.Arrays;

public class Q10SearchDiffEquN {
    public boolean findPair(int arr[], int size, int n)
    {

        Arrays.sort(arr);

        int i = 0, j = 1;

        while(i< size && j < size){

            if(i!=j && arr[j]-arr[i] == n) return true;
            if(arr[j] -arr[i] < n ) j++;
            else i++;

        }

        return false;
    }
}
