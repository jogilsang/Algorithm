// Constraints:

// 1 <= nums.length <= 10^4
// 0 <= nums[i] <= 10^5

class Solution {
    public boolean canJump(int[] nums) {
        
        boolean[] dp = new boolean[10001];
        dp[0] = true;
        
        for (int i = 0 ; i < nums.length ; i++) {
            int maxStep = nums[i];
            if(dp[i]) {
                int j = i+1;
                while(maxStep != 0){
                    if(j != nums.length) {
                        dp[j]=true;
                    }
                    else {
                        break;
                    }
                    j++;
                    maxStep--;
                }
            }else {
                return false;
            }
        }
        return true;
        
    }
}






















