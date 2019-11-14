class Solution {
    public int func_a(int passed, int non_passed) {
        if (passed > 1 && non_passed == 0)
            return 1;
        return 0;
    }

    public int func_b(int[] scores) {
        int answer = 0;
        if(scores[0] < 40) {
            answer++;
        }
        if(scores[1] < 44) {
            answer++;
        }
        if(scores[2] < 35) {
            answer++;
        }
        return answer;
    }

    public int func_c(int[] scores) {
        int answer = 0;
        if(scores[0] >= 80) {
            answer++;
        }
        if(scores[1] >= 88) {
            answer++;
        }
        if(scores[2] >= 70) {
            answer++;
        }
        return answer;
    }

    public int solution(int[][] scores) {
        int answer = 0;
        for(int i = 0; i<scores.length; i++) {
            int passed = func_@@@(@@@);
            int nonPassed = func_@@@(@@@);
            answer += func_@@@(@@@, @@@);
        }
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] scores1 = {
            {30, 40, 100},
            {97, 88, 95}
        };
        int ret1 = sol.solution(scores1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int[][] scores2 = {
            {90, 88, 70},
            {85, 90, 90},
            {100, 100, 70},
            {30, 90, 80},
            {40, 10, 20},
            {83, 88, 80}
        };
        int ret2 = sol.solution(scores2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}