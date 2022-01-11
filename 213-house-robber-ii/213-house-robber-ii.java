// Constraints:
// 1 <= nums.length <= 100
// 0 <= nums[i] <= 1000

// solution
// 1. index 0을 뺀 배열 1개
// 2. index last을 뺸 배열 1개
// 3. 그 두개의 MAX값의 MAX를 찾기

class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 0) {
            return 0;
        }
        else if(nums.length == 1){
            return nums[0];
        }
        
        // 마지막 집을 방문한다면
        int[] sumLastIn = new int[nums.length];
        sumLastIn[0] = 0;
        sumLastIn[1] = nums[1];
        for(int i = 2 ; i < nums.length  ; i++){
          sumLastIn[i] = Math.max(sumLastIn[i-1], sumLastIn[i-2]+ nums[i]);
        }
        
        // 처음 집을 방문한다면
        int[] sumFirstIn = new int[nums.length];
        sumFirstIn[0] = nums[0];
        sumFirstIn[1] = Math.max(nums[0], nums[1]);
        for(int i = 2 ; i < nums.length-1  ; i++){
          sumFirstIn[i] = Math.max(sumFirstIn[i-1], sumFirstIn[i-2]+ nums[i]);
        }
        
        int last = nums.length - 1;
        
        return Math.max(sumLastIn[last],sumFirstIn[last-1]);
        
    }
}






















