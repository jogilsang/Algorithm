class Solution {
    public int solution(int day, int[] numbers) {
        int count = 0;
        for(int i = 0; i < numbers.length; i++) 
        	if(numbers[i]%2 != day%2)
    			count++;
        return count;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int day = 17;
        int[] numbers = {3285, 1724, 4438, 2988, 3131, 2998};
        int ret = sol.solution(day, numbers);
    
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}