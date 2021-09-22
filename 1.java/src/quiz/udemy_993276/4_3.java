
// 두 문자열이 애너그램 관계인지 판별하기
// 한 문자열의 글자의 순서만 바꿔서 다른 문자열이 된다면 이 둘은 애너그램 관계이다
// "car"와 "arc"는 순서만 다르므로 애너그램 관계이다.
import java.util.HashMap;

public class Anagram {
    // my_answer
    public static boolean isAnagram(String s1, String s2) {
        // 1. s1,s2 사이즈를 비교한다. 서로 다르면 return false
        if(s1.length() != s2.length()) {
            return false;
        }
        int size = s1.length();

        // 2. 사이즈가 같은경우, charArr로 변경한다음 정렬을한다
        char[] ca1 = s1.toCharArray();
        char[] ca2 = s2.toCharArray();
        Arrays.sort(ca1);
        Arrays.sort(ca2);

        // 3. 서로 비교해서 다른게 나오면 return false
        for(int i=0 ; i < size ;i++) {
            if(!ca1[i].equals(ca2[i]) {
                return false;
            }
        }
        
        // 4. 전부 같은경우 return true
        return true;
    }

       // my_answer_2
       public static boolean isAnagram(String s1, String s2) {
        // 1. s1,s2 사이즈를 비교한다. 서로 다르면 return false
        if(s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<Character,Integer>();

        for(char c : s1.toCharArray()) {
            if(hm.containsKey(c))
                hm.put(c, hm.get(c)+1);
            else    
                hm.put(c,1);
        }
        // 1 2 3 4 5 6 7
        // 1 2 3 4 6 6 8
        for(char c:s2.toCharArray()) {
            if(!hm.containsKey(c))
                return false;
            if(hm.get(c) == 0)
                return false;
            hm.put(c, hm.get(c)-1);
        }        
        // 4. 전부 같은경우 return true
        return true;
    }
}