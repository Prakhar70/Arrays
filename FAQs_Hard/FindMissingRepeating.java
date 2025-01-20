package FAQs_Hard;

public class FindMissingRepeating {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length;
        int sumOfN = n*(n+1)/2;
        int sumofN2 = n*(n+1)*((2*n)+1)/6;
        int sumOfArr = 0;
        int sumOfArr2 = 0;
        for(int ele:nums){
            sumOfArr+=ele;
            sumOfArr2+=(ele*ele);
        }
        int S = sumOfN - sumOfArr;
        int S2 = sumofN2 - sumOfArr2;
        int xPlusY = S2 / S;
        int[] ans= new int[2];
        ans[0]=(xPlusY + S)/2;
        ans[1]=ans[0]-S;
        return ans;

    }
}
