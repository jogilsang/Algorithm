class Solution {
    public int solution(int a, int b, int k) {
        int answer = 0;
        
        if(a < (3 * b)) answer = a / 3;
        else answer = b;
        
        int remainA = a - 3 * answer;
        int remainB = b - answer;

        int i = 0;
        k = k - (remainA + remainB);
        
        while(k > 0) {
            if(i % 4 == 0) answer--;
            i++;
            k--;
        }

        return answer;
    }
}