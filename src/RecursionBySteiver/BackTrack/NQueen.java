package RecursionBySteiver.BackTrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        boolean [][] board = new boolean[n][n];
        helper(0,res, ds, board, n);

        return res;
    }

    public void helper(int row , List<List<String>> res , List<String>ds,boolean[][]mat, int n ) {

        if(row==n){
            display(mat);
            System.out.println();
            return;
        }
        for(int col = 0 ; col < n ; col++){

                if(matCheck(row,col,mat,n)){
                    mat[row][col]=true;
                    helper(row+1,res,ds,mat,n);
                    mat[row][col]=false;
                }
        }


}
    public boolean matCheck(int row ,int col, boolean[][]board, int n){

        //check vertical row...
        for (int i = 0; i < row; i++)
        {
            if (board[i][col]){ //if it is overall true means there is some queen already in the col so return false
                return false;
            }
        }
        //diagonal left
        int maxLeft = Math.min(row,col);
        for (int i = 1; i <= maxLeft ; i++) {
            if (board[row-i][col-i]){ //if it is overall true means there is some queen already in the left diagonal so return false
                return false;
            }
        }

        //diagonal Right
        int maxRight = Math.min(row,board.length-col-1);
        for (int i = 1; i <= maxRight ; i++) {
            if (board[row-i][col+i]){  //if it is overall true means there is some queen already in the right  diagonal so return false
                return false;
            }
        }
        return true; // this condition is only true when there is no queen that cancel our current queen that we wnana place

    }

    public void display(boolean[][] mat){
        for (boolean[] s : mat){
            System.out.print(Arrays.toString(s));
            System.out.println();
        }

    }

    public static void main(String[] args) {
        NQueen nQueen = new NQueen();
        nQueen.solveNQueens(4);
    }
}
