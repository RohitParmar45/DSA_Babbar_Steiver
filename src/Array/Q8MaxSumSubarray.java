package Array;

public class Q8MaxSumSubarray {
    public static void main(String[] args) {
        int[] arr = {10,2-11,12,3};

        int cur = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            cur = cur + arr[i];

            if (cur < 0){
                cur = 0;
            }
            if (cur > max){
                max = cur;
            }
        }

        System.out.println("max " + max);
    }
}
