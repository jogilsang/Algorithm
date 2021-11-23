class Solution {
    public int searchInsert(int[] nums, int target) {
        // Given a sorted array of distinct integers and a target value,
        // return the index if the target is found. If not, return the 
        // index where it would be if it were inserted in order.

        // You must write an algorithm with O(log n) runtime complexity.
        // solution 1
        // 1. nums를 for문을 돌리면서 item을 비교
        // 2. if target = item
        //    -> return index
        //    if target > item
        //    index++
        //    if target < item
        //    -> return index
        //    종료 후에도 return이 안되면 return index--
        for(int i = 0 ; i < nums.length ; i++){
            int item = nums[i];
            if(target == item){
                return i;
            }
            else if(target > item) {
                continue;
            }
            else if(target <item) {
                return i;
            }
        }
        
        return nums.length;
        
    }
}