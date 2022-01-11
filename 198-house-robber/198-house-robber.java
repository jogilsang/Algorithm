class Solution {
    public int rob(int[] nums) {
        int[] totalRob = new int[nums.length];
        
        // solution
        // 1. totalRob[0]~totalRob[2] = 경우의수가 1개
        // 2. totalRob[3] ~ totalRob[last] = 경우의수가 2개
        // 3. 점화식
        
        // testcase
        // [0]
        // [1]
        // [1,1]
        // [1,2,3]
        // [1,2,3,4,5]
        
        if(nums.length == 1) {
            return nums[0];
        }
        else if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        else if(nums.length == 3){
            return Math.max(nums[0] + nums[2],nums[1]);
        }
        
        totalRob[0] = nums[0];
        totalRob[1] = nums[1];
        totalRob[2] = nums[0] + nums[2];
        
        for(int i = 3 ; i < nums.length  ; i++){
          totalRob[i] = Math.max(totalRob[i-2], totalRob[i-3]) + nums[i];
        }
        
        int last = nums.length - 1;
        return Math.max(totalRob[last], totalRob[last-1]);
    }
}