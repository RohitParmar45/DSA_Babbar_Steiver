package searchNsort;

public class Q7MissingNReapeating {
    public static void main(String[] args) {

    }
    int[] findTwoElement(int arr[], int n) {

        long s = 0 ;
        long sn = ( n*(n+1) ) /2;;
        long s2 = 0;
        long sn2 = (n*(n+1)*(2*n+1))/6;

        for(int i = 0 ; i < n ; i++){
            s  += (long) arr[i];
            s2 += (long) arr[i]* (long) arr[i];
        }
        long eq1 =  s-sn;  //x-y
        long eq2 = s2-sn2;

        eq2 = eq2/eq1; //x+y

        int x = (int)(eq1+eq2)/2;
        int y = (int) (x-eq1);

        int [] res = {Math.abs(x),Math.abs(y)};
        return res;

    }}
