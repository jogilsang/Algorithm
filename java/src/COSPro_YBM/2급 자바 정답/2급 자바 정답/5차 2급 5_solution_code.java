class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        for(int i = 1; i <= b; i++) {
            if((a * i) % b == 0) {
                answer = a * i;
                break;
            }
        }
        
        return answer;
    }
}