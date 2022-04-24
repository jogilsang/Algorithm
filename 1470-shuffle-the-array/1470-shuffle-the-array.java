class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int length = 2*n;
        int[] answer = new int[length];
        
        for(int i = 0 ; i < n ; i++) {
            int x = i*2;
            int y = i*2+1;
            
            answer[x] = nums[i];
            answer[y] = nums[i + n];
        }
        
        return answer;
    }
}