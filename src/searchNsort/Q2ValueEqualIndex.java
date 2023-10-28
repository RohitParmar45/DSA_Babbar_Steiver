package searchNsort;

import java.util.ArrayList;

public class Q2ValueEqualIndex {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(i+1 == arr[i]){
                res.add(i+1);
            }
        }
        return res;
    }
}
