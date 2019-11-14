public class Solution {
	public int solution(String[][] cards) {
		int answer = 0;

		int[] count = new int[3];
		for(int i = 0; i < cards.length; i++) {
			if(cards[i][0].equals("black"))
				count[0]++;
			else if(cards[i][0].equals("blue"))
				count[1]++;
			else if(cards[i][0].equals("red"))
				count[2]++;
			answer += Integer.parseInt(cards[i][1]);
		}

		if(count[0] == 3 || count[1] == 3 || count[2] == 3)
			answer *= 3;
		else if(count[0] == 2 || count[1] == 2 || count[2] == 2)
			answer *= 2;

		return answer;
	}
}