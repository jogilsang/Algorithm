class Solution {
	public int func_a(int number1, int number2) {
		int ret = 0;

		if(number1 > number2)
			ret = number1 - number2;
		else
			ret = number2 - number1;

		return ret;
	}

	public int func_b(int number) {
		int ret = 0;

		while(number != 0) {
			number = number / 10;
			ret++;
		}

		return ret;
	}

	public int func_c(int number, int digit) {
		int ret = 0;

		for(int i = 0; i < digit; i++) {
			int temp = number % 10;
			number = number / 10;
			ret = ret * 10 + temp;
		}

		return ret;
	}

	public int solution(int number) {
		int answer = 0;
		int digit = func_b(number);
		int convert_number = func_c(number, digit);
		answer = func_a(number, convert_number);
		return answer;
	}
}