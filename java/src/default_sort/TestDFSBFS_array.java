package default_sort;

import java.util.LinkedList;

public class TestDFSBFS_array {

//    0
//   /
//  1 -- 3    7
//  |  / | \ /
//  | /  |  5
//  2 -- 4   \
//            6 - 8

    // 그래프
    static class Graph {
        class Node {
            int data;
            boolean marked;

            Node(int data) {
                this.data = data;
                this.marked = false;
            }
        }

        int[][] adjacent;
        Node[] nodes;

        Graph(int size) {
            nodes = new Node[size];
            adjacent = new int[size][size];

            for (int i = 0; i < size; i++) {
                nodes[i] = new Node(i);
            }
        }

        // 방문시 화면보이기
        void visit(Node n) {
            System.out.println(n.data + " ");
        }

        // 두 노드의 관계를 저장
        void addEdge(int i1, int i2) {

            // 양방향
            adjacent[i1][i2] = 1;
            adjacent[i2][i1] = 1;

        }

        void addEdgeSingle(int i1, int i2) {

            // 양방향
            adjacent[i1][i2] = 1;

        }

        public void initMarks() {
            for (int i = 0; i < nodes.length; i++) {
                nodes[i].marked = false;
            }
        }

        // 넒이우선탐색
        void bfsArr() {
            bfsArr(0);
        }

        void bfsArr(int index) {
            Node root = nodes[index];
            LinkedList<Node> q = new LinkedList<Node>();
            q.add(root);

            while (!q.isEmpty()) {
                Node r = q.removeFirst();
                for (int i : adjacent[index]) {
                    if (nodes[i].marked == false) {
                        nodes[i].marked = true;
                        q.add(nodes[i]);
                    }
                }
                r.marked = true;
            }
        }
    }


    public static void main(String[] args) {

        Graph g = new Graph(9);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(5, 6);
        g.addEdge(5, 7);
        g.addEdge(6, 8);
    }

}
