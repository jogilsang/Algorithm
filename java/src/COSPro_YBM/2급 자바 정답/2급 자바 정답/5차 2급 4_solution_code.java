class Solution {
    public int solution(int taekwondo, int running, int[] shooting) {
        int answer = 0;

        if(taekwondo >= 25)
        	answer += 250;
        else
        	answer += taekwondo * 8;

        answer += 250 + (60 - running) * 5;

        int count = 0;
        for(int i = 0; i < shooting.length; i++) {
        	answer += shooting[i];
        	if(shooting[i] == 10)
        		count++;
        }
        if(count >= 7)
        	answer += 100;

        return answer;
    }
}