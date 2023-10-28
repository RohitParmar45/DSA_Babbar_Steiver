package BinarySearchBySteiver;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleEleInSortedArr {
    public static int singleNonDuplicate(int[] nums) {
        if(nums.length==1 || nums[0] != nums[1])  return nums[0];
        if (nums[nums.length-1] != nums[nums.length-2]) return nums[nums.length-1];

        int l = 0;
        int h = nums.length-1;

        while(h>=l){
            int m = (h+l)/2;

            if(m%2==0 && nums[m] == nums[m+1] ){
                //first pass
                l = m+1;
            }
            else if(m%2==0 && nums[m] == nums[m-1]){
                //second pass
                h = m-1;
            }
            else if( m> 0 && m%2!=0 && nums[m] == nums[m-1]){
                //first pass
                l = m+1;
            }else if( m%2!=0 && nums[m] == nums[m+1]){
                //sec pass
                h = m-1;
            }
            else{
                return nums[m];
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(arr));
        
    }
}
