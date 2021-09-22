
// 숫자로 구성된 문자열을 정수로 변환하기

public class StringToInt {
	
    // 내 풀이
    public static int convert(String s) {
		// ToDo
		int value = Integer.parseInt(s);
		return value;
	}

    // 정답
    public static int convert_2(String s) {
		// ToDo
		char[] ca = s.toCharArray();
        int num = 0;

        // 123
        // 1*10+2 = 12
        // 12*10+3 = 123
        for (char c:ca) {
            num *= 10;
            num += c - '0';
        }

		return value;
	}
}