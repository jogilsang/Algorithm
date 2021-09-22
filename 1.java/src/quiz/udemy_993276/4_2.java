
// 주어진 문자열에서 모든 문자가 유일한지 판단하기

import java.util.HashSet;

public class UniqChar {
    public static boolean isUniqChar(String s) {
        char[] ca = s.toCharArray();
        // 1. 입력값을 charArray로 변경
        for (int i =0 ; i < ca.size-1 ; i++) {
            char pivot = ca[i];
            for (int j = i+1 ; i < ca.size ; i++) {
                char value = ca[j];
                if(pivot.equals(value)) {
                    return false;
                }
            }
        }
        // 2. for문을 통해 전체비교
        // 3. 중간에 유일하지않은경우 false리턴
        
		return true;
	}

    public static boolean isUniqChar_2(String s) {

        HashSet<Character> set = new HashSet<Character>();
        for (char c:s.toCharArray()) {
            if(set.contains(c))
                return false;
            set.add(c);
        }
        
		return true;
	}
}