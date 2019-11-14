class Solution {
	public int solution(int point) {
		int answer = 0;
		if(point >= 1000)
			answer = point - point%100;
		return answer;
	}
}