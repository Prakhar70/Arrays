package Algorithms;

public class Bubble {
    public int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            boolean hasSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j+1);
                    hasSwapped = true;
                }
            }
            if(!hasSwapped){
                break;
            }
        }
        return nums;
    }
    private void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    // TC : O(N)
    // SC : O(1)
}
