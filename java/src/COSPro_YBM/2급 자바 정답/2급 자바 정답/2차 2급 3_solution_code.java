class Solution {
    public int solution(int N, int M) {
        int total = 0;
        for(int i = N; i <= M; ++i){
            if(i % 2 == 0)
                total += i*i;
        }
        return total;
    }
}