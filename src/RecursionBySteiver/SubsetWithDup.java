package RecursionBySteiver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsetWithDup {

     void findSubsets(int ind, int[]nums,List<Integer>ds, List<List<Integer>>ansList){
         ansList.add(new ArrayList<>(ds));
         for (int i = ind; i < nums.length; i++) {
             if (i!=ind && nums[i] == nums[i-1])continue;
             ds.add(nums[i]);
             findSubsets(i+1,nums,ds,ansList);
             ds.remove(ds.size()-1);
         }
     }
     public List<List<Integer>>subsetsWithDup(int[]nums){
         Arrays.sort(nums);
         List<List<Integer>> ansList = new ArrayList<>();
         findSubsets(0,nums,new ArrayList<>(),ansList);
         return ansList;
     }
    public static void main(String[] args) {
        int[]arr= {1,2,2};
        for (List<Integer> list :new SubsetWithDup().subsetsWithDup(arr)) {
            System.out.println(list.toString());
        }
    }
}
