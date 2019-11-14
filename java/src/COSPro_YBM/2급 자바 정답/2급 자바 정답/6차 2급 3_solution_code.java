class Solution {
	public int[] solution(int[] people) {
		int[] answer = new int[4];

		for(int i = 0; i < people.length; i++)
			if(people[i] < 95)
				answer[0]++;
			else if(people[i] >= 95 && people[i] < 100)
				answer[1]++;
			else if(people[i] >= 100 && people[i] < 105)
				answer[2]++;
			else if(people[i] >= 105)
				answer[3]++;

		return answer;
	}
}