class Solution {
    public String solution(String[] words) {
        String answer = "";
        for(int i = 0; i < words.length; ++i)
            if(words[i].length() >= 5)
                answer += words[i];
        if(answer.length() < 1)
            answer = "empty";
        return answer;
    }
}