// Constraints:

// 1 <= nums.length <= 10^4
// 0 <= nums[i] <= 10^5

class Solution {
    public boolean canJump(int[] nums) {
        
        // Solution
        // 1. nums의 num값만큼 true로 바꿔주기
        // 2. true면, 더 갈수있기때문에 더표시하기
        // 3. false면, 최대값까지 왔기때문에 break하기 
        boolean[] dp = new boolean[10001];
        dp[0] = true;
        
        for (int i = 0 ; i < nums.length ; i++) {
            int maxStep = nums[i];
            // 이동가능하기때문에, 이동해서 이동가능거리 boolean표기
            if(dp[i]) {
                int j = i+1;
                // 최대이동거리만큼 true로 표시하기
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
            } // 이동가능한 최대값을 이미 넘어섰음, false
            else {
                return false;
            }
        }
        // 배열의 끝에 도달했으므로, true
        return true;
        
    }
}






















