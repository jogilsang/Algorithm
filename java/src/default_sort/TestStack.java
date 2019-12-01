package default_sort;


import java.util.NoSuchElementException;

public class TestStack {

    public static void main(String[] args) {


    }

    class Stack<T> {

        class Node<T> {

            private T data;
            private Node<T> next;

            public Node(T data) {
                this.data = data;
            }
        }

        private Node<T> top;

        public boolean isEmpty() {
            return top == null;
        }

        public T peek() {
            if (top == null) {
                throw new NoSuchElementException();
            }

            return top.data;
        }

        public T pop() {
            if (top == null) {
                throw new NoSuchElementException();
            }

            T data = top.data;
            top = top.next;

            return data;
        }

        public void push(T data) {
            Node<T> item = new Node<T>(data);
            item.next = top;
            top = item;
        }

    }

}



















