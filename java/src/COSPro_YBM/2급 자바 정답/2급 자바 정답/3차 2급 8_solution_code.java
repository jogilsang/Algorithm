class Solution {
    public int solution(int[][] tv) {
        int answer = 0;
        
        int[] usedTv = new int[25];
        for(int i = 0; i < tv[i].size; i++) {
            for(int j = tv[i][0]; j < tv[i][1]; j++) {
                usedTv[j]++;
            }
        }
        
        for(int i = 0; i < 25; i++) {
            if(usedTv[i] >= 2) {
                answer++;
            }
        }
        
        return answer;
    }
}