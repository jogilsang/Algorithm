class Solution {
    public int solution(int[] stuffs) {
        int answer = 0;

        int smallCounter = 0;
        int generalCounter = 0;

        for(int i = 0; i < stuffs.length; i++) {
            if(stuffs[i] > 3)
                generalCounter += stuffs[i];
            else
                smallCounter += stuffs[i];
        }

        if(smallCounter < generalCounter)
            answer = smallCounter;
        else
            answer = generalCounter;
        
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니, 위의 코드만 수정하세요.
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	int[] stuffs = {5, 3, 4, 2, 3, 2};
    	int ret = sol.solution(stuffs);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}