package LogicBuilding;

public class MissingNum {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int missingNum = 0;
        for(int i=0;i<n;i++){
            missingNum=missingNum^i^nums[i];
        }
        return missingNum^n;
    }
}
