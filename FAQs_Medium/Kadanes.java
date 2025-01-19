package FAQs_Medium;

public class Kadanes {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxTillNow = nums[0];
        int max = maxTillNow;
        for (int i = 1; i < n; i++) {
            maxTillNow = Math.max(maxTillNow + nums[i], nums[i]);
            max = Math.max(max, maxTillNow);
        }
        return max;
    }

}
