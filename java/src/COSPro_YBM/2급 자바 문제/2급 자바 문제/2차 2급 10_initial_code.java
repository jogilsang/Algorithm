class Solution {
    public int solution(int[] purchase) {
        int total = 0;
        for(int i = 0; i < purchase.length; ++i){
            if(purchase[i] >= 1000000)
                total += 50000;
            else if(purchase[i] >= 600000)
                total += 30000;
            else if(purchase[i] >= 400000)
                total += 20000;
            else
                total += 10000;
        }
        return total;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] purchase = {150000, 210000, 399990, 990000, 1000000};
        int ret = sol.solution(purchase);


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}