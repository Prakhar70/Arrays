package LogicBuilding;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (j == n - 1 || nums[j] != nums[j + 1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
