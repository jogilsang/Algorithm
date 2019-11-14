class Solution {
	public boolean solution(String password) {
		boolean answer = true;

		int capitalCount = 0, smallCount = 0, digitCount = 0;
		for(int i = 0; i < password.length(); i++) {
			if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')
				capitalCount++;
			else if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z')
				smallCount++;
			else if(password.charAt(i) >= '0' && password.charAt(i) <= '9')
				digitCount++;
		}

		if(capitalCount >= 1 && smallCount >= 2 && digitCount >= 2)
			answer = true;
		else
			answer = false;

		return answer;
	}
}