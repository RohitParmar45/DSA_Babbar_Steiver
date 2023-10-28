package Array;

public class Q34MedianTwoSortedArrayDiffSize {
    public static void main(String[] args) {
    int a[] = {1, 5 ,9};
    int b[] = {2, 3, 6, 7};//ans-5

     int a1[] = {4,6} ;
        int b1[] = {1,2,3,5};//ans 2

      int a3[] = {48425 ,53237 ,53652 ,83052, 96283} ;
      int b3[] = {3034};//ans- 53444.5
//        System.out.println(medianOfArrays(a.length,b.length,a,b));
//        System.out.println(medianOfArrays(a1.length,b1.length,a1,b1));
        System.out.println(medianOfArrays(a3.length,b3.length,a3,b3));
            }

    public static double medianOfArrays(int n, int m, int a[], int b[])
    {
        double p = 0.0;
        double q  = 0.0;
        int count = 0;
        boolean even = false;

        int med = (n+m)/2;
        if((n+m)%2==0) even = true;

        int i = 0;
        int j = 0;
        while(count <= med){

            if( j>=m || i<n && a[i]<=b[j]){
                q=p;
                p=a[i];
                i++;
                count++;
            }else{
                q=p;
                p=b[j];
                j++;
                count++;
            }

        }
        if(even)return (p+q)/2;
        return p;
    }
}
