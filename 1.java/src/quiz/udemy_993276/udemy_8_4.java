
/**
 *
 * 
 *
 * Stack에 저장된 값들중 최소값을 반환하는 min() 함수를 O(1)에 구현한다.
 * push(), pop()도 구현한다.
 * 
 */

 import java.util.Stack;

 public class udemy_8_4 {
     private Stack<Integer> stack;
     private Stack<Integer> minStack;

    public udemy_8_4() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int newVal) {
        if(minStack.empty() || neVal <= minStack.peek()) {
            minStack.push(newVal);
        }
        stack.push(newVal);
    }

    public int pop() {
        int val = stack.pop();
        if(!minStack.empty() && val == minStack.peek()){
            minStack.pop();
        }
        
        return stack.pop();
    }

    public int min() {
        if(minStack.empty()){
            return Integer.MAX_VALUE;
        }
        return minStack.peek();
    }
 }
