class Solution {
    public int solution(int[] papers, int K) {
        int length = papers.length;
        for(int i = 0; i < papers.length; i++){
        	K -= papers[i];
        	if(K < 0)
        		return i;
        }
        return length;
    }
}