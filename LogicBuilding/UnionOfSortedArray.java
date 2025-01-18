package LogicBuilding;

import java.util.ArrayList;
import java.util.List;

public class UnionOfSortedArray {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length; 
        List<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m){
            if(nums1[i] < nums2[j]){
                list.add(nums1[i]);
                while(i<n-1 && nums1[i]==nums1[i+1]){
                    i++;
                }
                i++;
            }
            else if(nums1[i] > nums2[j]){
                list.add(nums2[j]);
                while(j<m-1 && nums2[j]==nums2[j+1]){
                    j++;
                }
                j++;
            }
            else{
                list.add(nums1[i]);
                while(i<n-1 && nums1[i]==nums1[i+1]){
                    i++;
                }
                i++;
                while(j<m-1 && nums2[j]==nums2[j+1]){
                    j++;
                }
                j++;

            }
        }
        while(i<n){
            list.add(nums1[i]);
            while(i<n-1 && nums1[i]==nums1[i+1]){
                i++;
            }
            i++;
        }
        while(j<m){
            list.add(nums2[j]);
            while(j<m-1 && nums2[j]==nums2[j+1]){
                j++;
            }
            j++;
        }
        int len = list.size();
        int k = 0;
        int [] ans = new int [len];
        for(int ele:list){
            ans[k++]=ele;
        }
        return ans;

    
    }
}
