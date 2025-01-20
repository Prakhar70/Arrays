package FAQs_Hard;

public class CountReversePairs {
    static int cnt = 0;

    public int reversePairs(int[] nums) {
        cnt = 0;
        int n = nums.length;

        mergeSort(nums, 0, n - 1);
        return cnt;
    }

    private int[] mergeSort(int[] nums, int si, int ei) {
        if (si == ei) {
            return new int[] { nums[si] };
        }
        int mid = (si + ei) / 2;
        int[] left = mergeSort(nums, si, mid);
        int[] right = mergeSort(nums, mid + 1, ei);
        cnt += countReversePair(left, right);
        return merge(left, right);
    }

    private int countReversePair(int[] left, int[] right) {
        int n = left.length;
        int m = right.length;
        int count=0;
        int i=0,j=0;
        while(i<n && j<m){
            if(left[i]>2*right[j]){
                count+=n-i;
                j++;

            }else{
                i++;
            }
        }
        return count;
    }

    private int[] merge(int[] left, int[] right) {
        int n = left.length;
        int m = right.length;
        int[] ans = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (left[i] <= right[j]) {
                ans[k++] = left[i++];
            } else if (left[i] > right[j]) {
                ans[k++] = right[j++];
            }
        }
        while (i < n) {
            ans[k++] = left[i++];
        }
        while (j < m) {
            ans[k++] = right[j++];
        }
        return ans;
    }

}
