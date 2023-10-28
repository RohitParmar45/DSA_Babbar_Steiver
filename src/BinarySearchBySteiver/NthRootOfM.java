package BinarySearchBySteiver;

import java.util.HashMap;

public class NthRootOfM {
    public static int NthRoot(int n, int m) {

        HashMap<Integer,Integer> map = new HashMap<>();

        //factorial
        int i = 2;
        while(i<m/2+1 || m != 0 && m != 1 ){
            if(m%i == 0){
                m = m/i ;
                map.put(i,map.getOrDefault(i, 0)+1);
            }
            else i++;
        }
        int pow=1;
        boolean flag = true;
        for (int k : map.keySet()) {
            if(pow == map.getOrDefault(k, 0) || flag){
                pow = map.getOrDefault(k, 0);
                flag =false;
            }else return -1;
        }

        if(pow%n != 0)return -1;
        pow = pow/n;

        int num = 1;
        for( i = 0 ; i < pow ; i++){

            for (int k : map.keySet()) {
                num *= k;
            }
        }

        return num;

    }

    public static void main(String[] args) {
        System.out.println(NthRoot(3,27));

    }
}

