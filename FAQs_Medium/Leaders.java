package FAQs_Medium;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders {
    public ArrayList<Integer> leaders(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=n-1;i>=0;i--){
            if(nums[i]>max){
                list.add(nums[i]);
                max=nums[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}
