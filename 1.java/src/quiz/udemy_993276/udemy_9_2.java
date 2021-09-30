
/**
 *
 * 두개의 stack으로 큐 구현하기
 *
 */

import java.util.Stack;

public class ReverseQueue<T> {
    Stack<T> stack1;
    Stack<T> stack2;

    public MyQueue() {
        stack1 = new Stack<T>();
        stack2 = new Stack<T>();
    }

    // push
    public void offer(T element) {
        // ToDo
        stack1.push(element);
    }

    // pop
    public T poll() {
        // ToDo
        if(s2.isEmpty())
            while(!stack1.isEmpty())
                stack2.push(stack1.pop());
        return T;
    }

    public int size() {
        // ToDo
        return s1.size() + s2.size();
    }
}