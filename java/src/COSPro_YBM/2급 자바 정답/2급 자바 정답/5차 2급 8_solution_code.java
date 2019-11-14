class Solution {
    public int solution(int usage) {
        int answer = 0;
        
        if(usage > 30)
            answer = 20 * 430 + 10 * 570 + (usage - 30) * 840;
        else if(usage > 20)
            answer = 20 * 430 + (usage - 20) * 570;
        else
            answer = usage * 430;
        
        return answer;
    }
}