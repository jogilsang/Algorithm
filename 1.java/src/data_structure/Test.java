package default_sort;

import java.util.LinkedList;

public class Test {


    public static void combi(int[] arr. boolean[] visited, int start, int n , int r)
    {
        if (r == 0) {
            print(arr,visited,n);
            return;
        }
        for(int i = start ; i < n;i++) {
            visited[i] = true;
            combi(arr,visited,i+1,n,r-1);
            visited[i] = false;
        }
    }

    class Queue<T> {
        class Node<T> {
            T data;
            Node<T> next;

            public Node(T data) {
                this.data =data;
            }
        }
        Node<T> first;
        Node<T> last;

        public void offer(T data) {

            Node<T> item = new Node<T>(data);
            if(last != null) {
                last.next = item;
            }
            last = item;

            if(first == null) {
                first = last;
            }
        }

    }
    class Stack<T> {
        class Node<T> {
            T data;
            Node node;
            public Node(T data) {
                this.data = datal;
            }
        }

        Node<T> top;
        public boolean isEmpty() {return top == null;}
        public T peek() {
            if(top == null) {
                throw new NosuchElementException;
            }
            return top.data;
        }

        public T pop() {
            if(top == null) {
                throw new NoSuchElementException();
            }

            T data = top.data;
            top = top.next;

            return data;
        }

        public void push(T data) {
            Node<T> node = new Node<T>(data);
            node.next = top;
            top = node;
        }
    }

    //    0
    //   /
    //  1 -- 3    7
    //  |  / | \ /
    //  | /  |  5
    //  2 -- 4   \
    //            6 - 8

    static class Graph {
        class Node {
            int data;
            LinkedList<Node> adjacent;
            boolean marked;

            Node(int data) {
                this.data = data;
                marked = false;
                adjacent = new LinkedList<Node>();
            }
        }

        Node[] nodes;

        Graph(int size) {
            nodes = new Node[size];
            for (int i = 0; i < ; i++) {
                nodes[i] = new Node(i);
            }
        }

        // 방문 시 화면보이기
        void visit(Node n) {
            System.out.println("n.data + " ");
        }

        // 두 노드의 관계를 저장
        void addEdge(int i1, int i2) {
            Node n1 = nodes[i1];
            Node n2 = nodes[i2];
            if(!n1.adjacent.contains(n2)){
                n1.adjacent.add(n2);
            }

            if(!n2.adjacent.contains(n1)){
                n2.adjacent.add(n1);
            }
        }

        void dfsR() {
            dfsR(0);
        }
        void dfsR(int index) {
            Node node = nodes[index];
            dfsR(node);
        }
        void dfsR(Node r) {
            if(r==null) return;
            r.marked = true;
            visit(r);
            for(Node n : r.adjacent) {
                if(n.marked == false) {
                    dfsR(n);
                }
            }
        }

        void bfs() {
            bfs(0);
        }

        void initMarks() {
            for (int i = 0; i < nodes.length ; i++) {
                nodes[i].marked = false;
            }
        }

        boolean search(int i1, int i2) {
            return search(nodes[i1], nodes[i2]);
        }

        boolean search(Node start, Node end) {
            // 마크를 초기화한다
            initMarks();
            // queue를 만든다
            LinkedList<Node> q = new LinkedList<Node>();
            // q에 시작노드를 넣는다.
            q.add(start);
            // q가 비지않을때까지 찾는다.
            while(!q.isEmpty()){
                Node root = q.removeFirst();
                if(root == end) {
                    return true;
                }
                for(Node n : root.adjacent) {
                    if(n.marked == false) {
                        n.marked == true;
                        q.add(n);
                    }
                }
            }
        }
    }

    public static void quickSort(int[] arr) {

        quickSort(arr, 0 , arr.length -1);
    }

    public static void quickSort(int[] arr, int start, int end) {
        int index = partition(arr, start, end);

        if(start < index - 1) {
            quickSort(arr, start, index -1);
        }

        if(index < end) {
            quickSort(arr,index,end);
        }
    }

    private static int partition(int[] arr, int start, int end) {

            int pivot = arr[(start+end)/2];
            while(start<=end) {
                while(arr[start] < pivot) start++;
                while (arr[end] > pivot) end--;
                if(start<=end) {
                    swap(arr, start,end);
                    start++;
                    end--;
                }
            }
            return start;
    }


    private static void swap(int[] arr, int i1 , int i2) {

        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    public static void main(String[] args) {


    }


}

























