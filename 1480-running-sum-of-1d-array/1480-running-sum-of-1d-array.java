class Solution {
    public int[] runningSum(int[] nums) {
     
        // case
        // 1. nums.size == 0
        if(nums.length < 1) return nums;
        
        // solution
        // 배열의 현재 item은 이전 item과 현재 item의 합이다.
        
        for(int i = 1 ; i < nums.length ; i++){
            nums[i] = nums[i-1] + nums[i];
        }
        
        return nums;
        
    }
}