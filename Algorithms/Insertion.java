package Algorithms;

public class Insertion {
    public int[] insertionSort(int[] nums) {
        //TC: O(N^2)
        //SC: O(1)
        int n = nums.length;
        for(int i=0;i<n;i++){
            int ele =nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>ele){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=ele;
        }
        return nums;
    }
}
