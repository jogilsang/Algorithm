class Solution {
    public int solution(int[] calorie) {
        int answer = 0;
        
        int min = 1000;
        
        for(int e : calorie) {
            if(min < e)
                answer += (e - min);
            else
                min = e;
        }
        return answer;
    }
}