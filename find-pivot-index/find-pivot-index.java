class Solution {
    public int pivotIndex(int[] nums) {
        
        // max_count : 
        for(int i = 0 ; i < nums.length ; i++) {
            
            int leftSum = 0;
            int rightSum = 0;
            
            for(int left = 0 ; left < i ;  left++){
                if(i == 0) break;
                leftSum += nums[left];
            }
            
            for(int right = i+1 ; right < nums.length ;  right++){
                if(i == nums.length-1) break;
                rightSum += nums[right];
            }
            
            if(leftSum == rightSum) return i;
            
            // System.out.println("leftSum : " + leftSum);
            // System.out.println("rightSum : " + rightSum);

        }
        
        return -1;
        
    }
}