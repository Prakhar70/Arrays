package FAQs_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n-1;) {
            int num1=nums[i];
            int si = i+1;
            int ei = n-1;
            int target = -num1;
            while(si<ei){
                int num2=nums[si];
                int num3=nums[ei];
                if(num2+num3 == target){
                    List<Integer> tempAns = new ArrayList<>();
                    tempAns.add(num1);
                    tempAns.add(num2);
                    tempAns.add(num3);
                    ans.add(tempAns);
                    while(si<n-1 && nums[si]==nums[si+1]){
                        si++;
                    }
                    si++;
                    while(ei>0 && nums[ei]==nums[ei-1]){
                        ei--;
                    }
                    ei--;
                }else if(num2+num3<target){
                    // while(si<n-1 && nums[si]==nums[si+1]){
                    //     si++;
                    // }
                    si++;
                }else{
                    // while(ei>0 && nums[ei]==nums[ei-1]){
                    //     ei--;
                    // }
                    ei--;
                }
            }
            while(i<n-1 && nums[i]==nums[i+1]){
                i++;
            }
            i++;
        }
        return ans;
    }
}
