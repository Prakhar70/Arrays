package Algorithms;

public class Merge {
    //TC: O(nlogn)
    //SC: O(n)
    public int[] mergeSort(int[] nums) {
        int n = nums.length;
        return mergeSort(nums, 0, n - 1);
    }

    private int[] mergeSort(int[] nums, int i, int j) {
        if (i == j) {
            int[] base = new int[1];
            base[0] = nums[i];
            return base;
        }
        int mid = (i + j) / 2;
        int[] left = mergeSort(nums, i, mid);
        int[] right = mergeSort(nums, mid + 1, j);
        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int n = left.length;
        int m = right.length;
        int[] ans=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(left[i]<right[j]){
                ans[k++]=left[i++];
            }else{
                ans[k++]=right[j++];
            }
        }
        while(i<n){
            ans[k++]=left[i++];
        }
        while(j<m){
            ans[k++]=right[j++];
        }
        return ans;
    }

}
