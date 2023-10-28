package Array;

public class Q10ValueJumps {
    public static void main(String[] args) {
  //      int arr[] = {1, 4, 3, 2, 6, 7}  ;
       int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}  ;
     //  int arr[] = {2, 3, 1, 1, 2, 4, 2, 0 ,1, 1 } ;
     //  int arr[] = {2, 1, 0, 3 } ;
        System.out.println(minJumps(arr));

    }
    static int minJumps(int[] arr){
        if(arr.length == 1) return 0;
        if (arr[0]==0)return -1;
        int jump = 1;
        int step = arr[0];
        int maxR = arr[0]; //maxRange
        int len =arr.length;

        for (int i = 1; i < len ; i++) {

            if (i==len-1) return jump;

            maxR = Math.max(maxR,i+arr[i]);
            step--;
            if (step == 0){
                jump++;
                if (i>=maxR){
                    return -1;
                }
                step = maxR-i;

            }
        }

        return jump;


    }
}
