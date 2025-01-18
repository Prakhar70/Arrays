package FAQs_Medium;

public class RearrangeMatrix {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int e=0,o=1;
        for(int ele:nums){
            if(ele>=0){
                //Is Positive
                ans[e]=ele;
                e+=2;
            }else{
                ans[o]=ele;
                o+=2;
            }
        }
        return ans;
    }
}
