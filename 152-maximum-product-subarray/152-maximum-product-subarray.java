// Constraints:
// 1 <= nums.length <= 2 * 10^4
// -10 <= nums[i] <= 10

// case
// [0]
// [2,3,3,3]
// [2,3,-2,4]
// [0,2]
// [-2,3,-4]

// https://www.programcreek.com/2014/03/leetcode-maximum-product-subarray-java/
class Solution {
public int maxProduct(int[] nums) {
    int[] max = new int[nums.length];
    int[] min = new int[nums.length];
 
    max[0] = min[0] = nums[0];
    int result = nums[0];
 
    for(int i=1; i<nums.length; i++){
        if(nums[i]>0){
            max[i]=Math.max(nums[i], max[i-1]*nums[i]);
            min[i]=Math.min(nums[i], min[i-1]*nums[i]);
        }else{
            max[i]=Math.max(nums[i], min[i-1]*nums[i]);
            min[i]=Math.min(nums[i], max[i-1]*nums[i]);
        }
 
        result = Math.max(result, max[i]);
    }
 
    return result;
}
}



//     Solution : 음수인경우 처리를 못하겠다
//     public int maxProduct(int[] nums) {
//         if(nums.length == 1) return nums[0];
        
//         int productMax = nums[0] ; int ret = Integer.MIN_VALUE;
        
//         for(int i = 1  ; i < nums.length ; i++) {
//             productMax = Math.max(nums[i] * productMax, nums[i]);
//             ret = Math.max(productMax,ret);
//         } 
        
//         return ret;
        
//     }










