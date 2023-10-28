package Array;

import java.util.Arrays;

public class Q15Permutation {
    public static void main(String[] args) {
        int[] nums = {9,16,15,10,10,8}; //[10,8,9,11,15,16]
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void nextPermutation(int[] nums) {
        /** first of all find the value of k*/
        int len = nums.length;
        int k = len-2;

        for(int i =len-1  ; i>0; i--){
            if (nums[i] <= nums[i-1])k--;
            else break;
        }
        if (k==-1){
            reverse(nums, 0, len-1);
            return;
        }
        /** find the element from last side that is greater than k*/
        for (int i = len-1; i >0; i--) {
            if (nums[i] > nums[k] ){
                swap(nums,i,k);
                break;
            }
        }
        /**reverse the subArray that comes after k*/
        reverse(nums, k+1,len-1);
    }
    public static void reverse(int[]nums, int s , int e){
        while(e>s){
            swap(nums, s, e);
            e--;
            s++;
        }
    }
    public static void swap(int [] nums , int s, int e){
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] =temp;
    }
}
