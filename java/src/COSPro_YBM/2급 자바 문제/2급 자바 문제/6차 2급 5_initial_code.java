class Solution {
    public int solution(int money, int price, int n) {
        int answer = 0;

        int emptyBottle = answer = money / price;
        while(n <= emptyBottle) {
        	emptyBottle = emptyBottle - n;
        	answer++;
        	emptyBottle++;
        }
        
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	int money1 = 8;
    	int price1 = 2;
    	int n1 = 4;
    	int ret1 = sol.solution(money1, price1, n1);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    	int money2 = 6;
    	int price2 = 2;
    	int n2 = 2;
    	int ret2 = sol.solution(money2, price2, n2);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}