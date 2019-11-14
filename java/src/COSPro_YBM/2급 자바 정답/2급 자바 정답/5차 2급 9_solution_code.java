class Solution {
    public int[] solution(int[] score) {
        int[] answer = new int[score.length];
        
        for(int i = 0; i < score.length; i++) {
            answer[i] = 1;
            for(int j = 0; j < score.length; j++) {
                if(score[i] < score[j])
                    answer[i]++;
            }
        }

        return answer;
    }
}