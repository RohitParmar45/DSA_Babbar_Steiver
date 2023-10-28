package searchNsort;

import java.util.Arrays;

public class Q14MergeSortedArr {

    public static void main(String[] args) {
        int[] num1 = {1,5,6,0,0,0,0};
        int[] num2 = {2,4,9 ,10};
        merge(num1,3,num2,4);
        System.out.println(Arrays.toString(num1));
    }
    public  static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0 ;
        int j = 0;
        int m1 = nums1.length;
        int[] res = new int[m1];
        int k = 0;

        while(k<m1){

            if(i>=m){
                mergeAll(nums2,res,k,j);
                break;
            }else if(j>=n){
                mergeAll(nums1,res,k,i);
                break;
            }
            else if(nums1[i]>nums2[j]){
                res[k] = nums2[j];
                k++;
                j++;
            }
            else{
                res[k] = nums1[i];
                k++;
                i++;
            }

        }
        for(int i1 = 0 ; i1 < m1 ; i1++){
            nums1[i1]=res[i1];
        }

    }

    private static void mergeAll(int arr[] , int[] res, int resInd, int arrInd){
        for(int i = arrInd ;i< arr.length ; i++){
            res[resInd]=arr[i];
            resInd++;
        }
    }
}
