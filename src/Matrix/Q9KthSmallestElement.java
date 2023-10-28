package Matrix;

public class Q9KthSmallestElement {
    public static void main(String[] args) {
      int  mat[][] =     {{16, 28, 60, 64},
            {22, 41, 63, 91},
            {27, 50, 87, 93},
            {36, 78, 87, 94 }};
        System.out.println(kthSmallest(mat,mat.length,3));
    }
 public static int kthSmallest(int[][]mat,int n,int k)
        {

            int s = mat[0][0];
            int e = mat[n-1][n-1];

            while(s<=e){

                int  mid = (s+e)/2;

                int lessElement = findLessElement(mat , mid,  k, n) ;

                if(lessElement<k)s= mid+1;
                else e = mid-1;


            }
            return s;
        }
        static int findLessElement(int [][] mat,int actualMid, int k, int n){

        int count = 0;

        for(int i = 0 ; i < n; i++){

            int s = 0 ;
            int e = n-1;

            while(s <= e){

                int  mid = (s+e)/2;

                if(mat[i][mid] <= actualMid ) s = mid+1;
                else e = mid-1;

            }
            count = s+count;

        }
        return count;

    }
    }
