class Solution {
    public int solution(int[] timeTable) {
        int answer = 0;

        int firstClass = 0;
        int lastClass = 0;

        for(int i = 0; i < timeTable.length; i++) {
            if(timeTable[i] == 1) {
                firstClass = i;
                break;
            }
        }

        for(int i = timeTable.length-1; i >= 0; i--) {
            if(timeTable[i] == 1) {
                lastClass = i;
                break;
            }
        }

        for(int i = firstClass; i < lastClass; i++)
            if(timeTable[i] == 0)
                answer++;

        return answer;
    }
}