package default_sort;

import java.util.LinkedList;

public class Test {

    //    0
    //   /
    //  1 -- 3    7
    //  |  / | \ /
    //  | /  |  5
    //  2 -- 4   \
    //            6 - 8

    static class Graphe {
        class Node {
            int data;
            boolean marked;
            LinkedList<Node> adjacent;

            Node(int data) {
                this.data = data;
                this.marked = false;
                adjacent = new LinkedList<Node>();
            }
        }

        Node[] nodes;

        Graphe(int size) {
            for (int i = 0; i < size; i++) {
                nodes[i] = new Node(i);
            }
        }

        public void addEddgs(int i1, int i2) {
            Node n1 = nodes[i1];
            Node n2 = nodes[i2];

            if (!n1.adjacent.contains(n2)) {
                n1.adjacent.add(n2);
            }

            if (!n2.adjacent.contains(n1)) {
                n2.adjacent.add(n1);
            }

        }

        public void initMarks() {
            for (int i = 0; i < nodes.length; i++) {
                nodes[i].marked = false;
            }
        }

        boolean search(int i1, int i2) {
            return search(nodes[i1], nodes[i2]);
        }

        boolean search(Node start, Node end) {
            // 마크를 초기화합니다
            initMarks();
            // Q를 선언합니다.
            LinkedList<Node> q = new LinkedList<Node>();
            // Q에 root를 enqueue 합니다.
            q.add(start);
            // Q가 빌때까지 dequeue합니다.
            while(!q.isEmpty()) {
                // q에서 하나 뻅니다.
                Node root = q.removeFirst();
            // 종료조건을 확인합니다
                if(root == end) {
                    return true;
                }
                for(Node n : root.adjacent) {
                    if(n.marked == false) {
                        n.marked = true;
                        q.add(n);
                    }
                }

            // q의 인접 노드들을 확인합니다.
            // 방문하지 않았다면 체크합니다.
            // q에 집어넣습니다.
        }
            return false;
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

























