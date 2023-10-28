package Array;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Q7RotateArray {
    public static void main(String[] args) {
        int []arr = {2,3,4,5,6};
        int k = 7;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            deque.add(arr[i]);
        }
        int rotation = k % arr.length; //if arr.length is 5 and k = 7 means rotation = 2
        for (int i = 0; i < rotation ; i++) {
         int last =    deque.pollLast();
         deque.addFirst(last);
        }
        System.out.println(Arrays.toString(deque.toArray()));
        int size = deque.size();
        for(int i = 0 ; i <size; i++){
            arr[i] = deque.pollFirst();
        }
        System.out.println(Arrays.toString(arr));
    }
}
