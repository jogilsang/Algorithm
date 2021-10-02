
import java.util.Stack;

// Stack 정렬하기
// https://www.youtube.com/watch?v=6-tsS9aBfzY&list=PLjSkJdbr_gFZL2BNnGLvTgMYXptKGIyum&index=7

public class TestStackSort {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(3);
        s1.push(5);
        s1.push(1);
        s1.push(6);
        sort(s1);
    }

    private static void sort(Stack<Integer> s1) {
        Stack<Integer> s2 = new Stack<Integer>();

        // s1에 있는걸 s2으로 옮기면 위에서부터 6,5,4,3,2,1 내림차순 정렬
        while(!s1.isEmpty()) {
            // 하나를 꺼낸다
            int temp = s1.pop();
            // 하나 꺼낸게 s2에 맨 위에 있는거보다는 커야한다.
            // 맨 위에있는거보다 커질때까지, s1으로 옮긴다.
            while(!s2.isEmpty() && temp < s2.peek()) {
                s1.push(s2.pop());
            }
            // 꺼낸걸 넣는다
            s2.push(temp);
        }
        // s2에 있는걸 s1으로 옮기면 위에서부터 1,2,3,4,5,6 오름차순 정렬
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
}