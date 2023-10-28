package Array;

import java.util.Arrays;

public class Q16BuySellStock {

    public static void main(String[] args) {
        int arr[] = {4,2,1,5,6,5};
    //    System.out.println(Arrays.toString(maxProfit(arr)));
    }
    public static int maxProfit(int[] prices) {
            int min = prices[0];
            int diff = 0 ;
            for(int i = 0 ; i < prices.length ; i++){
                if(diff < prices[i]-min){ diff = prices[i]-min;
                }
                if(prices[i]<min){
                    min = prices[i];
                }
            } return diff;
        }


}
