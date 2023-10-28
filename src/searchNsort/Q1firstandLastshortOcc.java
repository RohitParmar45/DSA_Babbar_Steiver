package searchNsort;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1firstandLastshortOcc {

    public static void main(String[] args) {
        long [] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        for(long i : find(arr,arr.length,5)) System.out.println(i + " ");
    }

  static private  ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> res = new ArrayList<>();

        if(x < arr[0] || x > arr[n-1]){
            res.add(-1L);
            res.add(-1L);
            return res;
        }

        binSearch(0, n-1, arr, x, res,n);
        return res;
    }


    static void binSearch(int s, int e ,long []arr, int x, ArrayList<Long> res,long n){

        if(s>e){
            return;
        }
        int m = (s+e)/2;

        if(arr[m]==x){
            firstOcc(m,arr,x,res);
            secOcc(m,arr,x,res,n);
        }
        else if(arr[m]>x) binSearch(s,m-1, arr, x,res,n);
        else binSearch(m+1,e, arr, x,res,n);
    }

    static void firstOcc(int m , long[] arr, int x, ArrayList<Long> res){
        long ind = m;
        m--;
        while(m>=0){

            if(arr[m]!=x)break;
            ind = m;
            m--;
        }
        res.add(ind);

    }
    static void secOcc(int m , long [] arr, int x,ArrayList<Long> res,long n){
        long ind = m;
        m++;
        while(m<n){

            if(arr[m]!=x)break;
            ind = m;
            m++;
        }
        res.add(ind);
    }

}
