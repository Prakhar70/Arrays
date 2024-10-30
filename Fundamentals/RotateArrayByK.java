package Fundamentals;

public class RotateArrayByK {
    public void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, n-1);
        reverseArray(nums, 0, n-1);
    }

    private void reverseArray(int[] nums, int lo, int hi) {
        while (lo < hi) {
            int temp = nums[lo];
            nums[lo] = nums[hi];
            nums[hi] = temp;
            lo++;
            hi--;
        }
    }
}
