package FAQs_Medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.keySet().contains(target-nums[i])){
                ans[0]=map.get(target-nums[i]);
                ans[1]=i;
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
    public int[] twoSum_(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        int[][] arr2d= new int[n][2];
        for(int i=0;i<n;i++){
            arr2d[i][0]=nums[i];
            arr2d[i][1]=i;
        }
        Arrays.sort(arr2d,(a,b)->a[0]-b[0]);
        int i=0,j=n-1;
        while(i<j){
            if(arr2d[i][0]+arr2d[j][0]==target){
                ans[0]=arr2d[i][1];
                ans[1]=arr2d[j][1];
                return ans;
            }else if(arr2d[i][0]+arr2d[j][0]<target){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
    
}
