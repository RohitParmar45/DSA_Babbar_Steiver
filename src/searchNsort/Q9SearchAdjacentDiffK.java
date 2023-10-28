package searchNsort;

public class Q9SearchAdjacentDiffK {
    public static void main(String[] args) {

        int arr[] = {20,30,10,30,50,60,40};

        System.out.println(search(arr, arr.length, 60, 20));

    }
    static int search(int arr[], int n, int x, int k)
    {
        int i = 0 ;

        while(i<n){
            int cur = arr[i];

            if(cur==x)return i;

            int factor = Math.abs(x-cur)/k ;

           if(factor>1)i+=factor;
           else i++;
        }
        return -1;
    }
}
