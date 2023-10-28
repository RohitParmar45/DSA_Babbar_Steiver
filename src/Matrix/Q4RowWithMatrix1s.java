package Matrix;

public class Q4RowWithMatrix1s {
    public static void main(String[] args) {
     int Arr[][] = {{0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}};
      int  Arr2[][] = {{0, 0}, {1, 1}};
        System.out.println(rowWithMax1s(Arr,Arr.length, Arr[0].length));
        System.out.println(rowWithMax1s(Arr2,Arr2.length, Arr2[0].length));
    }
   private static int rowWithMax1s(int arr[][], int n, int m) { //n rows m colomb
           boolean contain1 = false;
           int max = Integer.MIN_VALUE;
           int maxRow = -1;
           for(int i = 0; i<n; i++){
               int s = 0;
               int e = arr[i].length-1;
               while(s<=e){
                   int mid = (s+e)/2;
                   if(arr[i][mid]==1){
                       contain1= true;
                       e = mid-1;
                   }
                   else s = mid+1 ;
               }
               if (contain1 && m-s > max){
                   maxRow = i;
               }
               max = Math.max(max,m-s);
           }
//       System.out.println("max "+ max);
           return maxRow;
       }

    }


