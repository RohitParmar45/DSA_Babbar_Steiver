package Matrix;

import java.util.HashMap;
import java.util.Map;

public class Q10CommonElementOfRow {
    public static void main(String[] args) {
       int mat[][] = {{1, 1, 1, 4, 8},
                {8, 7, 8, 1, 1},
                {8, 7, 1, 3, 1},
                {8, 1, 1, 7, 9},
        };
       commonElement(mat,mat.length,mat[0].length);
    }
    private static void commonElement(int[][] mat, int r , int c){

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i = 0 ; i<c; i++) map.put(mat[0][i],1);


        for(int i = 1 ; i<r ; i++ ){

            for(int j = 0 ; j<c; j++){
                int cur = mat[i][j];
                if(map.containsKey(cur) && map.get(cur)==i) map.put(cur,map.get(cur)+1);

            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == r) {
                System.out.print(entry.getKey() +" ");
            }
        }
    }
}
