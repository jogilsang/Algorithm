class Solution {
    public int solution(int weight, int[] boxes) {
        int answer = 0;

        for(int i = 0; i < boxes.length; i++) 
        	if(boxes[i] < weight * 9 / 10 || boxes[i] > weight * 11 / 10)
        		answer++;
        	
        return answer;
    }
}