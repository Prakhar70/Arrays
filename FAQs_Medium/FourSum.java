package FAQs_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n= nums.length;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;){
            for(int j=i+1;j<n;){
                int si = j+1;
                int ei = n-1;
                while(si<ei){
                    if(nums[i]+nums[j]+nums[si]+nums[ei]==target){
                        List<Integer> tempAns = new ArrayList<>();
                        tempAns.add(nums[i]);
                        tempAns.add(nums[j]);
                        tempAns.add(nums[si]);
                        tempAns.add(nums[ei]);
                        list.add(tempAns);

                        while(si<n-1 && nums[si]==nums[si+1]){
                            si++;
                        }
                        si++;
                        while(ei>0 && nums[ei]==nums[ei-1]){
                            ei--;
                        }
                        ei--;
                    }
                    else if(nums[i]+nums[j]+nums[si]+nums[ei]<target){
                        si++;
                    }else{
                        ei--;
                    }
                }

                while(j<n-1 && nums[j]==nums[j+1]){
                    j++;
                }
                j++;
            }

            while(i<n-1 && nums[i]==nums[i+1]){
                i++;
            }
            i++;
        }
        return list;
    }
}
