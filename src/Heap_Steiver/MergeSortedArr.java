package Heap_Steiver;

import java.util.*;

class Solution {
    public static int largestRectangleArea(int[] heights) {
        int max = heights[0];
        int i = 0 ;

        while(i<heights.length){
            int h = heights[i];
            while(h>0){
                int l = checkLeft(heights, i-1);
                int r = checkRight(heights, i+1);
                int area = (r-l+1)*h;
                if(area > max){
                    max = area;
                }
                else h--;
            }
            i++;
        }
        return max;
    }
    public static int checkLeft(int[] heights , int ind){
        if(ind < 0)return 0;
        int h = heights[ind+1];
        for(int i = ind ; i >= 0 ; i--){
            if(h>heights[i])return i+1;
        }
        return 0;
    }
    public static int checkRight(int[] heights , int ind){
        if(ind == heights.length)return heights.length-1;
        int h = heights[ind-1];

        for(int i = ind ; i < heights.length ; i++){
            if(h>heights[i])return i-1;
        }
        return heights.length-1;
    }
    public static void main(String[] args) {
        int[]heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
        Queue<Integer> q = new LinkedList<>();
        q.poll();
        q.peek();

    }


}

