package Algorithms;

class Solution {
    //TC: O(N)
    //SC: O(1)
    public int[] selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }
            //swap ith with the minElement
            swap(nums, minIdx, i);
        }
        return nums;
    }
    private void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}