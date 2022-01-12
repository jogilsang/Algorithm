// Constraints:

// 1 <= nums.length <= 2 * 10^4 = 
// 1 <= nums[i] <= 10^4=10000


class Solution {
    public int deleteAndEarn(int[] nums) {
        
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        
        int[] dp = new int[10001];
        int[] sum = new int[10001];
        
        for(int num : nums){
            dp[num]++;    
        }
        sum[0]=dp[0];
        sum[1]=dp[1];
        
        for(int i=2 ; i < dp.length ; i++){
            sum[i] = Math.max(sum[i-2] + dp[i]*i, sum[i-1]);
        }
        
        int last = dp.length-1;
        return sum[last];
        
    }
}









