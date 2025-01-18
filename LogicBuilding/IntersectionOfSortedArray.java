package LogicBuilding;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfSortedArray {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        List<Integer> list= new ArrayList<>();
        int i =0,j=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                list.add(nums1[i]);
                i++;j++;
            }
        }
        int k=0;
        int[] ans = new int[list.size()];
        for(int ele:list){
            ans[k++]=ele;
        }

        return ans;
    }
}
