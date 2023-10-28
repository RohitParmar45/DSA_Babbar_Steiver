package String;

public class Q22CountNumOfStringIn2d {

    public static void main(String[] args) {

//https://www.geeksforgeeks.org/find-count-number-given-string-present-2d-character-array/

//        char[][] arr = {
//                {'D','D','D','G','D','D'},
//                {'B','B','D','E','B','S'},
//                {'B','S','K','E','B','K'},
//                {'D','D','D','D','D','E'},
//                {'D','D','D','D','D','E'},
//                {'D','D','D','D','D','G'}
//        };
        char[][] arr = {
                {'B','B','M','B','B','B'},
                {'C','B','A','B','B','B'},
                {'I','B','G','B','B','B'},
                {'G','B','I','B','B','B'},
                {'A','B','C','B','B','B'},
                {'M','C','I','G','A','M'}
        };
        String str= "MAGIC";

//        String str= "GEEKS";
//        String str= "DB";

        int n = arr.length;
        int m = str.length();
        int found = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
              found +=  internalSearch(i,j, arr, str,m,0);
            }
        }

        System.out.println(found);
        }

    private static  int internalSearch(int i , int j , char[][]arr, String str, int size, int count){
      int found = 0 ;

      if (i>=0 && j >=0 && i < 6 && j < 6 && arr[i][j]==str.charAt(count)){
          char temp = arr[i][j];
          arr[i][j] = '0';
          count++;
          if (count == size) found = 1;
      else {
           found += internalSearch(i,j-1, arr, str , size,count);
          found += internalSearch(i-1,j, arr, str, size ,count);
          found += internalSearch(i,j+1, arr, str, size,count);
           found += internalSearch(i+1,j, arr, str, size ,count);
      }
        arr[i][j] = temp; //backtracking
    }

        return found;
    }

}

