package FAQs_Medium;

public class Sort012 {
    public void sortZeroOneTwo(int[] nums) {
        int n = nums.length;
        int i = 0, j = n - 1;
        int k = 0;
        while (k <= j) {
            if (nums[k] == 0) {
                swap(nums, i, k);
                i++;
                k++;
            } else if (nums[k] == 1) {
                k++;
            } else {
                swap(nums, j, k);
                j--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
