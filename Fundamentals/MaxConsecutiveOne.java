package Fundamentals;

public class MaxConsecutiveOne {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int maxLen = 0;
        for(int ele:nums){
            if(ele==1){
                cnt++;
            }else{
                maxLen = Math.max(maxLen, cnt);
                cnt = 0;
            }
        }
        maxLen = Math.max(maxLen, cnt);
        return maxLen;
    }
}
