class Solution {
    public int solution(int korean, int english) {
        int answer = 0;
        
        int math = 210 - korean + english;
        
        if(math > 100)
            answer = -1;
        else
            answer = math;
        
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int korean = 70;
        int english = 60;
        int ret = sol.solution(korean, english);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}