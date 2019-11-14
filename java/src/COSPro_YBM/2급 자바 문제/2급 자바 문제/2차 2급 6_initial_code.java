class Solution {
    public int solution(int[] floors) {
        int dist = 0;
        int length = floors.length;
        for(int i = @@@; @@@; ++i){
            if(@@@)
                dist += floors[i] - floors[i-1];
            else
                dist += floors[i-1] - floors[i];
        }
        return dist;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] floors = {1, 2, 5, 4, 2};
        int ret = sol.solution(floors);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}