class Solution {
    public int solution(int[][] ladders, int win) {
        int answer = 0;
        
        int[] player = { 1, 2, 3, 4, 5, 6 };
        
        for(int i = 0; i < ladders.length; i++) {
            int temp = player[ladders[i][0]-1];
            player[ladders[i][0]-1] = player[ladders[i][1]-1];
            player[ladders[i][1]-1] = temp;
        }
        
        answer = player[win-1];
        
        return answer;
    }
}