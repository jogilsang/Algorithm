class Solution {
	public int solution(int[] member_age, String transportation) {
	int answer = 0;

	int totalTransportationExpenses = 0;
	int adultExpense = 0;
	int childExpense = 0;

	if(transportation.equals("Bus")) {
		adultExpense = 40000;
		childExpense = 15000;
	} else if(transportation.equals("Ship")) {
		adultExpense = 30000;
		childExpense = 13000;
	} else if(transportation.equals("Airplane")) {
		adultExpense = 70000;
		childExpense = 45000;
	}

	if(member_age.length >= 10) {
		adultExpense = adultExpense / 10 * 9;
		childExpense = childExpense / 10 * 8;
	}

	for(int i = 0; i < member_age.length; ++i) {
		if(member_age[i] > 19)
			totalTransportationExpenses += adultExpense;
		else
			totalTransportationExpenses += childExpense;
	}
	
	answer = totalTransportationExpenses;
	return answer;
	}
}