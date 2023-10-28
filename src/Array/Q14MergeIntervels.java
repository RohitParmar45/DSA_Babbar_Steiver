package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q14MergeIntervels {
    public static void main(String[] args) {
        int [][] arr = {{1,3},{2,6},{8,10},{15,18}};
        int [][] arr2 = {{1,3},{2,6},{8,10},{9,11}};
        int [][] arr3 = {{1,4},{4,5}};
        int [][] output = merge(arr);
        for (int i = 0; i < output.length; i++) {
            System.out.println(Arrays.toString(new String[]{Arrays.toString(output[i])}));
        }

    }
//    public static int[][] merge(int[][] intervals) {
//
//        int[][]output = new int[intervals.length][];
//        int ind = 0;
//        int s = intervals[0][0];
//        int e = intervals[0][intervals[0].length-1];
//
//        for(int i = 0 ; i<intervals.length; i++) {
//
//            if (i== intervals.length-1){
//                output[ind] = new int[]{s,e};
//                break;
//            }
//
//            int len1 =intervals[i].length;
//            int len2 =intervals[i+1].length;
//            int first1 = intervals[i][0];
//            int last1 = intervals[i][len1-1];
//            int first2 = intervals[i+1][0];
//            int last2 = intervals[i+1][len2-1];
//
//            if(last1 >= first2){
//              s = first1;
//              if (last2>e){
//                  e = last2;
//              }
//            }else {
//                output[ind] = new int[]{s,e};
//                ind++;
//                s=first2;
//                e = last2;
//            }
//
//        }
//        int[][]finalR = new int[ind+1][];
//        for (int i = 0; i <= ind; i++) {
//            finalR[i] = output[i];
//        }
//        return finalR;
//
//    }

    public static int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if (intervals.length == 0 || intervals== null) return new int[0][];
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int[] i : intervals){

            if (i[0]<=end){
                end  = Math.max(end,i[1]);
            }else {
                res.add(new int[]{start,end});
                start= i[0];
                end= i[1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }

}
