package Array;

public class Q11FindDuplicateWithCases {
    public static void main(String[] args) {

        int [] nums ={1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    /**cycle detaction method / slow and fast pointer method / tortoise method */

    public static int findDuplicate(int[] nums) {
        if (nums.length ==1){
            return -1;
        }
     int slow = nums[0];
     int fast = nums[0];

     //first fast move 2 steps and slow moves 1 by 1
     do {
          fast = nums[nums[fast]];
          slow = nums[slow];
     }while (slow != fast);

     //now fast start from fist position and
        // now both slow and fast moves 1 by 1
     fast = nums[0];
     while (slow!=fast){
         fast = nums[fast];
         slow = nums[slow];
     }
     return slow;
    }

}
