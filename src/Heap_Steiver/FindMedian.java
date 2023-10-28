package Heap_Steiver;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedian {
        private static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        public static int findMedian(int[] arr, int n) {
            for(int i = 0 ; i<arr.length ; i++){
                insert(arr[i]);
            }

            if(arr.length %2 == 0){
                return (int) Math.floor(( maxHeap.peek()+minHeap.peek())/2  );
            }
            else {
                return maxHeap.peek();
            }
        }

        public static void insert(int num){
            if(maxHeap.isEmpty() || maxHeap.peek() >= num){
                maxHeap.add(num);
            }else {
                minHeap.add(num);
            }
            if(minHeap.size()>maxHeap.size()){
                maxHeap.add(minHeap.poll());
            }
            else if(maxHeap.size() > minHeap.size()+1){
                minHeap.add(maxHeap.poll());
            }
        }

    public static void main(String[] args) {
        int[] arr = {5,3,8,2,1};
        System.out.println(findMedian(arr,arr.length));
    }

    }

