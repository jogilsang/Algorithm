class Solution {
    public String solution(String characters){
		String result = "";
		result += characters.charAt(0);
		for (int i = 1; i < characters.length(); i++) {
			if (characters.charAt(i - 1) != characters.charAt(i))
				result += characters.charAt(i);
		}
		return result;
    }
}
