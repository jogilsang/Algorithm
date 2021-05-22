package quiz.backjoon;

import java.util.LinkedList;
import java.util.Scanner;

public class backjoon_23_2 {

    static class Graphe {

        class Node {
            int data;
            LinkedList<Node> adjacent;
            boolean marked;

            Node(int data) {
                this.data = data;
                adjacent = new LinkedList<Node>();
                marked = false;
            }
        }

        Node[] nodes;

        Graphe(int size) {
            nodes = new Node[size];
            for (int i = 0; i < size; i++) {
                nodes[i] = new Node(i + 1);
            }
        }

        public void addEdge(int i1, int i2) {

            Node n1 = nodes[i1 - 1];
            Node n2 = nodes[i2 - 1];

            if (!n1.adjacent.contains(n2))
                n1.adjacent.add(n2);

            if (!n2.adjacent.contains(n1))
                n2.adjacent.add(n1);
        }

        public int getBfsConnectedNum(int i) {
            return getBfsConnectedNum(nodes[i-1]);
        }

        // 지정된 정점 기준으로 몇개의 간선이 연결되어있는지(출력의 개수)
        public int getBfsConnectedNum(Node n) {
            int count = -1;
            initMarks();
            LinkedList<Node> q = new LinkedList<Node>(); // 큐를 만든다.
            q.add(n); // 큐에 넣는다

            // 큐가 빌때까지
            while(!q.isEmpty()) {

                Node root = q.removeFirst();
                root.marked = true;
                count++;

                for(Node closed : root.adjacent) {
                    if(closed.marked == false) {
                        closed.marked = true;
                        q.add(closed);
                    }
                }
            }

            return count;

        }

        public void initMarks() {
            for (int i = 0; i < nodes.length; i++) {
                nodes[i].marked = false;
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 컴퓨터개수(정점)
        Graphe g = new Graphe(n);

        int m = sc.nextInt(); // 정점과 간선
        for(int i = 0 ; i < m ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            g.addEdge(a, b);
        }

        int num = g.getBfsConnectedNum(1);
        System.out.println(num);

    }
}
