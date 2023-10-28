package searchNsort;

public class Q4RotateSortedArrSearch {

    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr,5));
    }

       static public int search(int[] nums, int target) {
            return binSearch(nums, target,0,nums.length-1);
        }

        private static int binSearch(int []arr, int target, int s, int e){

            if(s > e) return -1;

            int m = (s+e)/2;

            if(arr[m]==target){
                return m;
            }
            else if(arr[m]>target && target<arr[s]){
              binSearch(arr, target, m+1, e);
            }
            else if(arr[m]>target && target>arr[s]){
             binSearch(arr , target, s, m-1);
            }
            else{
               binSearch(arr , target,m+1, e);
            }

        return m;
        }

}
