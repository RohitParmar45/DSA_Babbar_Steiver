package DP_By_Steiver;

public class Q15DivideInto2ArrayEqualSum {
    public static void main(String[] args) {
        int [] arr = {2,3,3,3,4,5};
        int [] arr2 = {1,2,3,6};
//        System.out.println(divideInto2EqualSumArr(arr));
        System.out.println(divideInto2EqualSumArr(arr2));
    }
    private static boolean divideInto2EqualSumArr(int[] nums){
        int n = nums.length;
        int totalSum = 0;
        for (int element:nums) {
            totalSum +=element;
        }

        return helper(nums,n-1,totalSum/2);
    }
    private static boolean helper(int[] nums, int index,int curSum){
        if(index == 0)  return curSum == nums[index];

        if (curSum - nums[index] == 0) return true;

        boolean include = false;
        if (nums[index]<=curSum){
            include = helper(nums,index-1,curSum-nums[index]);
        }
        boolean exclude = helper(nums , index-1, curSum);

        return include || exclude;
    }
}
