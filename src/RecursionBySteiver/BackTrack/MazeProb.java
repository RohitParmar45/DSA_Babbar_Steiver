package RecursionBySteiver.BackTrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MazeProb {
    public static ArrayList<String> findPath(int[][] m, int n) {

        ArrayList<String> res = new ArrayList<>() ;

        helper(0,0,m,n,res,"");
        return res;

    }
    public static void helper(int row , int col , int[][]m, int n, ArrayList<String>res ,String s){
        if(row==n-1 && col == n-1){
            res.add(s);
        }
        //up
        if(row>0 && col > 0 && m[row-1][col]==1){
            s += "U";
            m[row][col]= 0;
            helper(row-1,col,m,n,res,s);
            m[row][col]=1;
            s=s.substring(0,s.length()-1);
        }
        //down
        if(row<n-1 && col < n +1 && m[row+1][col]==1){
            s += "D";
            m[row][col]= 0;
            helper(row+1,col,m,n,res,s);
            m[row][col]=1;
            s=s.substring(0,s.length()-1);
        }
        //left
        if(col > 0 && m[row][col-1]==1){
            s += "L";
            m[row][col]= 0;
            helper(row,col-1,m,n,res,s);
            m[row][col]=1;
            s=s.substring(0,s.length()-1);
        }
        //right
        if(col<n-1 && m[row][col+1]==1){
            s += "R";
            m[row][col]= 0;
            helper(row,col+1, m,n,res,s);
            m[row][col]=1;
            s=s.substring(0,s.length()-1);
        }
    }

    public static void main(String[] args) {
      int  m[][] = {{0, 1, 1 ,1},
            {1, 1, 1, 0},
            {1, 0, 1,1},
            {0, 0, 1, 1}};

       for(String s :findPath(m,m.length) ){
           System.out.print(s + " ");
       }
        HashMap<Integer,Integer>map = new HashMap<>();

        for (int key : map.keySet()){

        }
    }
}
