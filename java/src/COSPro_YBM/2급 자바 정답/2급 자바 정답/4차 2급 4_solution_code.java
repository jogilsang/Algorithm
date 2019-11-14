class Solution {
	public int solution(int[] classes, int m) {
		int count = 0;
		for(int i = 0; i < classes.length; ++i) {
			while(classes[i] > 0) {
				classes[i] -= m;
				count++;
			}
		}
		return count;	
	}
}