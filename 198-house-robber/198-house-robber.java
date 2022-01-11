class Solution {
    public int rob(int[] nums) {
        int[] totalRob = new int[nums.length];
        
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
        
        // index가 홀수인경우, max(item[n-1],item[n-3])+item[n]
        // index가 짝수인경우, max(item[n-2],item[n-3])+item[n]
        for(int i = 3 ; i < nums.length  ; i++){
          totalRob[i] = Math.max(totalRob[i-2], totalRob[i-3]) + nums[i];
        }
        
        int last = nums.length - 1;
        return Math.max(totalRob[last], totalRob[last-1]);
    }
}