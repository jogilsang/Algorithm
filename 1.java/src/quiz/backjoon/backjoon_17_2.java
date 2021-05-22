package quiz.backjoon;

import java.util.Scanner;

public class backjoon_17_2 {

    static class Stack {

        class Node {
            int data;
            Node next;

            Node() {

            }

            Node(int data) {

                this.data = data;
            }
        }

        public Node top;

        public void push(int data) {
            Node item = new Node(data);
            item.next = top;
            top = item;
        }

        public int pop() {

            if(top == null) {
                return -1;
            }

            int data = top.data;
            top = top.next;

            return data;

        }



    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 합계
        int sum = 0;

        // 스택
        Stack stack = new Stack();

        // n 크기만큼 값을받음
        for (int i = 0 ; i < n ; i++) {
            int input = sc.nextInt();
            switch (input) {
                // 0이면, pop 명령어
                // sum은 stack이 push하면서 쌓인 합이므로, 뻄
                case 0 :
                    int output = stack.pop();
                    sum -= output;
                    break;

                // 0이 아닌 모든숫자
                // sum은 stack이 적재되면서 저장되는 합
                default:
                    stack.push(input);
                    sum += input;
                    break;
            }
        }
        // stack의 누적합 출력
        System.out.println(sum);
    }
}
