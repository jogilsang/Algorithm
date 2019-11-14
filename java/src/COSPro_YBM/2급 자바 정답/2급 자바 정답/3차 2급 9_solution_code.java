class Solution {
    public int solution(int day, int[] numbers) {
        int count = 0;
        for(int i = 0; i < numbers.length; i++) 
        	if(numbers[i]%2 == day%2)
    			count++;
        return count;
    }
}