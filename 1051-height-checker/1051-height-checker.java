import java.util.*;

class Solution {
    public int heightChecker(int[] heights) {
        // case
        // [1,2,3,4,5] => 0 (모두 매치되는경우)
        // [5,4,3,2,1] => 5 (모두 매치안되는경우)
        // 0 <= answer <= heights.length
        
        // solution
        // 1. 배열을 복사한다
        // 2. 최초배열과 비교해서 값이 다르면 answer++
        
        int answer = 0;
        int[] copyed = Arrays.copyOfRange(heights, 0 , heights.length);
        Arrays.sort(copyed);
        
        for(int i = 0 ; i < heights.length ; i++){
            if(heights[i] != copyed[i]) answer++;
        }
        
        return answer;
    }
}