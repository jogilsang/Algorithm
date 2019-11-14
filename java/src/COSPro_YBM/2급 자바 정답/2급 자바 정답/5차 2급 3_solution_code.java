class Solution {
    public int solution(int speed, int[] cars) {
        int answer = 0;
        
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] >= speed * 11 / 10 && cars[i] < speed * 12 / 10)
                answer += 3;
            else if(cars[i] >= speed * 12 / 10 && cars[i] < speed * 13 / 10)
                answer += 5;
            else if(cars[i] >= speed * 13 / 10)
                answer += 7;
        }
        
        return answer;
    }
}