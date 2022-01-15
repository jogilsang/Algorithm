class Solution {
    
public int maxSubArray(int[] nums) {
        int sum=nums[0], ret=nums[0];
        for(int i=1 ; i<nums.length ; i++) {
            sum = Math.max(sum+nums[i], nums[i]);
            ret = Math.max(sum, ret);
        }
        return ret;
    }
}
    
    // timelimit exceed
    //     public int maxSubArray(int[] nums) {

    //         int max = Integer.MIN_VALUE;
    //         for(int i = 0 ; i < nums.length ; i++){
    //             int sum = 0;
    //             for(int j = i ; j < nums.length ;  j++) {
    //                 sum += nums[j];
    //                 if(sum > max) max = sum;
    //             }
    //         }
    //         return max;
    //     }
    