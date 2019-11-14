class Solution {
    public int solution(int[] scores, int cutline) {
        int answer = 0;
        for(int i = 0; i < scores.length; ++i)
            if(scores[i] >= cutline)
            answer += 1;
        return answer;
    }
}