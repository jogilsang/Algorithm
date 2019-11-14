class Solution {
    public int solution(int[] scores) {
        int count = 0;
        for (int i = 0; i < scores.length; i++)
		    if (650 <= scores[i] && scores[i] < 800) 
			    count += 1;
        return count;
    }
}
