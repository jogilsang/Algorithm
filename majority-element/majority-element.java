class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxKey = Integer.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;
        
        for(Integer key : map.keySet()) {
            int value = map.get(key).intValue();
            if(maxValue < value) {
                maxValue = value;
                maxKey = key.intValue();
            }
        }
        return maxKey;
    }
}