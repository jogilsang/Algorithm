class Solution {
	public int solution(int price, String grade) {
		int answer = 0;
		
		if (grade.equals("S"))
			answer = (int)(price*0.95);
		if (grade.equals("G"))
			answer = (int)(price*0.9);
		if (grade.equals("V"))
			answer = (int)(price*0.85);
		
		return answer;
	}    
}
