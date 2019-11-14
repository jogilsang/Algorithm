public class Solution {
	public int solution(int[] socks) {
		int answer = 0;

		int[] count = new int[10];
		for(int i = 0; i < socks.length; i++)
			count[socks[i]]++;

		for(int i = 0; i < 10; i++)
			answer += (count[i] / 2);

		return answer;
	}
}