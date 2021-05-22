package quiz.backjoon;

import java.util.Scanner;

public class backjoon_17_1 {

    static class Stack {

        class Node {
            private int data;
            private Node next;

            Node(int data) {
                this.data = data;
            }
        }

        private Node top;

        private void push(int data) {
            Node item = new Node(data);
            item.next = top;
            top = item;
        }

        private int pop() {
            if (top == null) {
                return -1;
            }

            int data = top.data;
            top = top.next;
            return data;
        }

        private int size() {
            if (top == null) {
                return 0;
            } else {
                int count = 1;
                Node temp = top;
                while (temp.next != null) {
                    count++;
                    temp = temp.next;
                }
                return count;
            }
        }

        private int empty() {
            if (top == null) {
                return 1;
            } else {
                return 0;
            }
        }

        private int top() {
            if (top == null) {

                return -1;
            }

            return top.data;
        }

    }

    public static void main(String[] args) {

        Stack stack = new Stack();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] commands = new String[n];

        for (int i = 0; i < n; i++) {
            stackCommand(sc.nextLine(), stack);
        }

    }

    public static void stackCommand(String str, Stack stack) {

        int temp = 0;

                switch (str) {
            case "pop":
                System.out.println(stack.pop());
                break;
            case "empty":
                System.out.println(stack.empty());
                break;
            case "size":
                System.out.println(stack.size());
                break;
            case "top":
                System.out.println(stack.top());
                break;
            default:
                String new_command = str.split(" ")[1];
                int data = Integer.valueOf(new_command);
                stack.push(data);

                break;
        }
    }


}
