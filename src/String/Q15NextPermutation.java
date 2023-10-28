package String;

import java.util.ArrayList;
import java.util.List;

public class Q15NextPermutation {
    public static void main(String[] args) {
        int []arr= {1, 2, 3, 6, 5, 4};//output - 1,2,4,3,5,6
        List<Integer> list = nextPermutation(arr.length,arr);
        for (int e : list)
            System.out.print(e + " ");
    }
    static List<Integer> nextPermutation(int n, int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        int k = n-2;

        for(int i = n-1 ; i > 0 ; i--){
            if(arr[i-1]>=arr[i])k--;
            else break;
        }

        if(k==-1){
            reverse(0, n-1 , arr);
            for(int e : arr){
                list.add(e);}
            return list;
        }

        for(int i = n-1 ; i>0; i--){
            if(arr[i]>arr[k]){
             swap(i,k,arr);
             break;}
        }

        reverse(k+1, n-1, arr);

        for(int e : arr){
            list.add(e);}
        return list;


    }


    static void swap(int i , int j , int[]arr){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void reverse (int i , int j , int[]arr){

        while(i<j){
            swap(i,j,arr);
            i++;
            j--;
        }
    }
}

