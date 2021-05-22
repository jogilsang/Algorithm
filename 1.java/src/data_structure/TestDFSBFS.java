package default_sort;

import sun.misc.Queue;

import java.util.LinkedList;

public class TestDFSBFS {

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
            LinkedList<Node> adjacent;
            boolean marked;

            Node(int data) {
                this.data = data;
                this.marked = false;
                adjacent = new LinkedList<Node>();
            }
        }

        Node[] nodes;

        Graph(int size) {
            nodes = new Node[size];
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
            Node n1 = nodes[i1];
            Node n2 = nodes[i2];
            if (!n1.adjacent.contains(n2)) {
                n1.adjacent.add(n2);
            }

            if (!n2.adjacent.contains(n1)) {
                n2.adjacent.add(n1);
            }
        }

        void dfsR() {
            dfsR(0);
        }

        void dfsR(int index) {
            Node r = nodes[index];
            dfsR(r);
        }

        void dfsR(Node r) {
            if (r == null) return;
            r.marked = true;
            visit(r);
            for (Node n : r.adjacent) {
                if (n.marked == false) {
                    dfsR(n);
                }
            }
        }

        // 넒이우선탐색
        void bfs() {
            bfs(0);
        }
        void bfs(int index) {
            Node root = nodes[index];
            Queue<Node> queue = new Queue<Node>();
            queue.enqueue(root);
            root.marked = true;
            while(!queue.isEmpty()) {
                try {
                    Node r = queue.dequeue();
                    for(Node n : r.adjacent) {
                        if(n.marked == false) {
                            n.marked = true;
                            queue.enqueue(n);
                        }
                    }
                    visit(r);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void initMarks(){
            for(int i = 0 ; i < nodes.length ; i++) {
                nodes[i].marked = false;
            }
        }

        boolean search(int i1, int i2) {
            return search(nodes[i1], nodes[i2]);
        }
        boolean search(Node start, Node end) {
            initMarks();
            LinkedList<Node> q = new LinkedList<Node>();
            q.add(start);
            while(!q.isEmpty()) {
                Node root = q.removeFirst();
                if(root == end) {
                    return true;
                }
                for(Node n : root.adjacent) {
                    if(n.marked == false) {
                        n.marked = true;
                        q.add(n);
                    }
                }

            }
            return false;
        }
    }


    public static void main(String[] args) {

        Graph g = new Graph(9);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(3,5);
        g.addEdge(5,6);
        g.addEdge(5,7);
        g.addEdge(6,8);
        g.dfsR();
    }

}
