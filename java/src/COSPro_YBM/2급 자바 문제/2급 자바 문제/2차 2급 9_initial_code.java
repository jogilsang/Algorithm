class Solution {
    public int solution(int[] votes, int N, int K) {
        int[] counter = new int[N + 1];
        for(int i = 0; i < votes.length; ++i)
            counter[votes[i]] += 1;
        int answer = -1;
        for(int i = 0; i <= N; ++i)
            if(counter[i] == K)
                answer += 1;
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] votes = {2, 5, 3, 4, 1, 5, 1, 5, 5, 3};
        int N = 5;
        int K = 2;
        int ret = sol.solution(votes, N, K);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}