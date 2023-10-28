package Matrix;

public class Q3MedianOfSortedMatrix {
    public static void main(String[] args) {
        int i = 5;
        int [][] matrix = {{1, 3, 5},
                           {2, 6, 9},
                           {3, 6, 9}};
        System.out.println(median(matrix,matrix.length,matrix[0].length));
    }
   static int median(int matrix[][], int R, int C) {

        int n = R*C;
        int medianIndex= n/2;

        int s = 1 ;
        int e = 2000;

        while(s<=e){

            int assumedMid = (s+e)/2;

            int lessElements = lesserElements(matrix,assumedMid);

            if(lessElements <= medianIndex) s = assumedMid+1;
            if(lessElements > medianIndex)e = assumedMid-1;

        }

        return s;

    }

    static int  lesserElements(int [][]matrix, int assumedMid){
        int noOfSmallerElements = 0;
        for(int i = 0 ; i < matrix.length ; i++){

            int   sIndex = 0;
            int eIndex = matrix[i].length-1;

            while(sIndex <=eIndex){

                int midIndex = (sIndex+eIndex)/2;

                if(matrix[i][midIndex]<=assumedMid) sIndex = midIndex+1;
                else eIndex=midIndex-1;

            }

            noOfSmallerElements += sIndex;
        }
        return noOfSmallerElements;

    }

}
