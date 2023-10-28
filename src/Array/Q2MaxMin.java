package Array;

public class Q2MaxMin {
    public static void main(String[] args) {
        int[]arr = {2,4,5,1,9,3};

        int min = 2;
        int max = 5;
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("min - " + min + " max - " + max);
    }
}
