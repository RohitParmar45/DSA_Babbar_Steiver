package Array;

import java.util.Arrays;

public class Q4Sort012 {
    public static void main(String[] args) {
        int [] arr = {0,1,1,0,2,1,0};
        int [] newArr = new int[arr.length];

        int z=0,t=0;
        int last = arr.length-1;
        for (int i = 0; i <= last; i++) {
            if (arr[i]==0){
                newArr[z]=0;
                z++;
            }else if (arr[i] == 2){
                newArr[last-t]=2;
                t++;
            }
        }
        for (int i = z; i <= last-t; i++) {
            newArr[i]=1;
        }

        System.out.println(Arrays.toString(newArr));

    }
}
