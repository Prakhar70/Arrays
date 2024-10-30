package Fundamentals;

public class LargestElement {
    public int largestElement(int[] nums) {
        int ans = Integer.MIN_VALUE;
        for (int ele : nums) {
            ans = Math.max(ele, ans);
        }
        return ans;
    }
}
