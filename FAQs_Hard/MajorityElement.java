package FAQs_Hard;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt = 1;
        int ele = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==ele){
                cnt++;
            }else{
                cnt--;
                if(cnt==0){
                    ele = nums[i];
                    cnt = 1;
                }
            }
        }
        return ele;
    }
}
