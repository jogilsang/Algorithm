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
}