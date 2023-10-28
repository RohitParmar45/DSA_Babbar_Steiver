package Array;

import java.util.Arrays;

public class Q3KthMin {

    public static void main(String[] args) {
        int arr[] = {7, 10 ,4 ,3 ,20, 15}; // 3 4 7 10
         int k= 3; //k
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
        }
    }
