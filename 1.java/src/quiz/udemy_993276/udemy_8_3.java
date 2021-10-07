
/**
 *
 * Stack으로 회문(palindrome) 판별하기
 *
 * 회문이란 순서를 뒤집어도 내용이 같은 것을 의미한다.
 * "noon", "level", "civic" 등은 회문이다.
 * 
 */

 import java.util.Stack;

 public class udemy_8_3 {

    public static boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<Character>();

        int len = s.length();
        
        // "noon" - 4/2 -> 2
        // "level" - 5/2 -> 2
        for(int i = 0 ; i < len/2 ; i++) {
            stack.push(s.charAt(i));
        }
        // "noon" - (4+1)/2 -> 2
        // "level" - (5+6)/2 -> 3
        for(i=(len+1)/2 ; i<len ; i++){
            // 서로다르면
            if(s.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
 }
