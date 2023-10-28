package DP_By_Steiver;

public class Q17CountSubSequencesSumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
         int tar2 = 3;
        int[] arr2 =  { 1, 2};
        int tar3 = 4;
        int[] arr3 =  {12, 1, 3};
        int tar4 = 41;
        int[] arr4 =  { 2, 34};
//        System.out.println(findWays(arr, 3));
//        System.out.println(findWays(arr2, tar2));
        System.out.println(findWays(arr3,tar3));
//        System.out.println(findWays(arr4, tar4));
    }

    public static int findWays(int num[], int tar) {
        int n = num.length;
        return helper(num, tar, n - 1);
    }

    private static int helper(int num[], int tar, int i) {

        if (tar == 0)  return 1;
        if (i == 0) {
            if (tar == num[i]) return 1;
            else return 0;
        }




        int include = 0;
        if (tar >= num[i]) {
            include = helper(num, tar - num[i], i - 1);
        }

        int exclude = helper(num, tar, i - 1);

        return include + exclude;

    }
}