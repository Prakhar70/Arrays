package LogicBuilding;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int nzz=-1;//non-zero zone;
        int curr=0;
        while(curr!=n){
            if(nums[curr]!=0){
                int temp = nums[nzz+1];
                nums[nzz+1]=nums[curr];
                nums[curr]=temp;
                nzz++;
            }
            curr++;
        }
    }
}
