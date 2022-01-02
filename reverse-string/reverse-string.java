import java.util.Stack;

class Solution {
    public void reverseString(char[] s) {
        // pop : 제거
        // push : 추가
        // peek : 읽기
        // empty : 비었는지여부
        Stack<Character> stack = new Stack<>();
        for(char c : s) {
            stack.push(c);
        }
        int index = 0;
        while(!stack.empty()){
            s[index++]=stack.pop();
        }
    }
}