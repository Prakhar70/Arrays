package FAQs_Hard;

public class CountInversion {
    static int cnt = 0;

    public long numberOfInversions(int[] nums) {
        cnt = 0;
        int n = nums.length;

        int[] arr = mergeSort(nums, 0, n - 1);
        return cnt;
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
        int[] ans= new int[n+m];
        int i=0, j=0,k=0;
        while(i<n && j<m){
            if(left[i] < right[j]){
                ans[k++]=left[i++];
            }else if(left[i] > right[j]){
                cnt+=(n-i);
                ans[k++]=right[j++];
            }else{
                ans[k++]=left[i];
                i++;
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