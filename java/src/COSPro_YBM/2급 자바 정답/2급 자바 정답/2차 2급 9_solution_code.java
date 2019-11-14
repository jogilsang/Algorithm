class Solution {
    public int solution(int[] votes, int N, int K) {
        int[] counter = new int[N + 1];
        for(int i = 0; i < votes.length; ++i)
            counter[votes[i]] += 1;
        int answer = 0;
        for(int i = 0; i <= N; ++i)
            if(counter[i] == K)
                answer += 1;
        return answer;
    }
}