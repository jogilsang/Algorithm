class Solution {
    public int solution(int[] floors) {
        int dist = 0;
        int length = floors.length;
        for(int i = 1; i < length; ++i){
            if(floors[i] > floors[i-1])
                dist += floors[i] - floors[i-1];
            else
                dist += floors[i-1] - floors[i];
        }
        return dist;
    }
}