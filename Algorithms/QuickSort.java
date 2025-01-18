package Algorithms;

class QuickSort {
    public int[] quickSort(int[] nums) {
        int n = nums.length;
        quickSort(nums, 0, n - 1);
        return nums;
    }

    private void quickSort(int[] nums, int si, int ei) {
        if(si>=ei){
            return;
        }
        int pivot = nums[ei];
        int pivotIdx = partition(nums, si, ei, pivot);
        quickSort(nums, si, pivotIdx-1);
        quickSort(nums, pivotIdx+1, ei);
    }
    private int partition(int[] nums, int si , int ei, int pivot){
        int j=si;
        for(int i = si;i<=ei;i++){
            if(nums[i]<=pivot){
                swap(nums, i, j);
                j++;
            }
        }
        return j-1;
    }
    private void swap(int[] nums, int idx1, int idx2){
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}