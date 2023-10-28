package Array;

public class Q31SubArrayGreaterThanX {
    public static void main(String[] args) {
          System.out.println(smallestSubWithSum(new int[]{1, 4, 45, 6, 0, 19},6,51));
          System.out.println(smallestSubWithSum(new int[]{1, 10, 5, 2, 7},5,9));
          System.out.println(smallestSubWithSum(new int[]{1,3,4,2,9},5,9));
    }
    public static int smallestSubWithSum(int a[], int n, int x) {
        int p = 0 , q = 0 ;
        int minLen = Integer.MAX_VALUE;
        int len = 0;
        int sum = 0 ;

        for( int i = 0 ; i < n ; i++){

            if(a[i]>x)return 1;
            sum = sum+a[i];
            len++;
            q++;
            if(sum > x){
                int temp = sum;
                while(sum > x && p<q){
                    sum = sum-a[p];
                    if (sum > x){
                        len--;
                        p++;
                        temp = sum;
                    }else{
                        sum = temp ;
                        break;
                    }
                }
                if(minLen > len) minLen = len;
            }
        }
        return minLen;

    }
}
