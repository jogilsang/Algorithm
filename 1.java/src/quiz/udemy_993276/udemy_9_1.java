
/**
 *
 * 스택으로 큐 순서 뒤집기
 *
 * 큐나 스택은 순서가 정해져있음
 * java의 스택과 큐를 인지하고있는지 여부
 */

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue<T> {
    public Queue reverse(Queue<T> q) {
        Stack<T> stack = new Stack<T>();

        while(!q.isEmpty()) {
            stack.push(q.poll());
        }
        while(!stack.isEmpty()){
            q.offer(stack.pop());
        }

        return q;
    }
}