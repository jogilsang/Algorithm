package default_sort;


import java.util.NoSuchElementException;

public class TestQueue {

    public static void main(String[] args) {


    }


    class Queue<T> {

        class Node<T> {

            private T data;
            private Node<T> next;

            public Node(T data) {
                this.data = data;
            }

        }

        private Node<T> first;
        private Node<T> last;

        public T peek() {
            if (first == null) {
                throw new NoSuchElementException();
            }
            return first.data;
        }

        public boolean isEmpty() {
            return first == null;
        }

        public void add(T data) {
            Node<T> item = new Node<T>(data);

            if (last != null) {
                last.next = item;
            }
            last = item;
            if (first == null) {
                first = last;
            }
        }

        public T remove() {
            if (first == null) {
                throw new NoSuchElementException();
            }

            T data = first.data;
            first = first.next;

            if (first == null) {
                last = null;
            }
            return data;
        }

    }

}
