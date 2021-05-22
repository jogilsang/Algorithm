package quiz.backjoon;

import java.util.Scanner;

public class backjoon_18_1 {

    static class Queue {

        class Node{

            public int data;
            public Node next;

            Node(){

            }

            Node(int data) {
                this.data = data;
            }
        }

        private Node first;
        private Node last;
        private int size = 0;


        public void push(int data) {

            Node item = new Node(data);

            if(last != null) {
                last.next = item;
            }

            last = item;
            size++;

            if(first == null) {
                first = last;
            }

        }

        public int pop(){

            if(first == null) {
                return -1;
            }

            size--;

            int data = first.data;
            first =first.next;

            if(first == null) {
                last = null;
            }

            return data;

        }


        public int size(){
            return this.size;
        }

        public int empty(){
            return first == null ? 1 : 0;
        }

        public int front(){
            return first == null ? -1 : first.data;
        }

        public int back(){
            return last == null ? -1 : last.data ;
        }

    }


    public static void main(String[] args) {

        Queue queue = new Queue();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0 ; i < n ; i++) {
            String command = sc.nextLine();
            stackCommand(command, queue);
        }

    }

    public static void stackCommand(String str, Queue queue) {

        int temp = 0;

        switch (str) {
            case "pop":
                System.out.println(queue.pop());
                break;
            case "size":
                System.out.println(queue.size());
                break;
            case "empty":
                System.out.println(queue.empty());
                break;
            case "front":
                System.out.println(queue.front());
                break;
            case "back":
                System.out.println(queue.back());
                break;
            default:
                String new_command = str.split(" ")[1];
                int data = Integer.valueOf(new_command);
                queue.push(data);
                break;
        }
    }



}
