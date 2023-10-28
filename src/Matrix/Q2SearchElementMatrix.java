package Matrix;

public class Q2SearchElementMatrix {
    public static void main(String[] args) {
     int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}}; int  target = 13;
        System.out.println(searchMatrix(matrix,target));
    }
    public static  boolean searchMatrix(int[][] matrix, int target) {

        int r = matrix.length;
        int c = matrix[0].length;

        int s= 0;
        int e = r*c-1;


        while(e < r*c && s <=  e){

            int mid = (s+e)/2;
            int midE = midElement(matrix,c,mid);

            if(midE == target)return true;

            if(midE > target) e = mid-1;
            if(midE< target) s = mid+1;
        }
        return false;
    }

    static int midElement(int[][] matrix, int c, int mid){
        int i = mid/c;
        int j = mid%c;
        return matrix[i][j];
    }
}
