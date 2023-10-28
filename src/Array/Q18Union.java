package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18Union {
    public static void main(String[] args) {

//        int [] A = {1, 5, 10, 20, 30,40, 80};
//        int [] B = {6, 7, 20,30, 80, 100};
//        int [] C = {3, 4, 15, 20, 30, 70, 80, 120};

       int [] A = {20, 20, 20};
        int [] B = {20, 20,20};
        int []  C = {20, 20, 20};
        System.out.println(Arrays.toString(commonElements(A,B,C, A.length,B.length,C.length).toArray()));
    }

      static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
       int p1, p2 , p3;
       p1 = p2 = p3 = 0;
       int prev1, prev2 , prev3;
       prev1 = prev2 = prev3 = Integer.MIN_VALUE;

        ArrayList<Integer> result = new ArrayList<>();

        while (p1 < n1 && p2 < n2 && p3 < n3){
            while (p1 < n1 && A[p1] == prev1){
                prev1 = A[p1];
                p1++;
            }while (p2 < n2 && B[p2] == prev2){
                prev2 = B[p2];
                p2++;
            }while (p3 < n3 && C[p3] == prev3){
                prev3 = C[p3];
                p3++;
            }
            if (p1 < n1 && p2 < n2 && p3 <n3 && A[p1] == B[p2] && B[p2] == C[p3]){
                result.add(A[p1]);
                prev1 = A[p1];
                prev2 = A[p1];
                prev3 = A[p1];
                p1++; p2++; p3++;
            }else{
                if(p1 < n1 && p2 < n2 && p3 <n3 && A[p1]<B[p2] && A[p1] < C[p3])p1++;
                if(p1 < n1 && p2 < n2 && p3 <n3 && A[p1]>B[p2] && B[p2] < C[p3])p2++;
                if(p1 < n1 && p2 < n2 && p3 <n3 && A[p1]>C[p3] && B[p2] > C[p3])p3++;
            }
        }
        return result;
    }


    }


