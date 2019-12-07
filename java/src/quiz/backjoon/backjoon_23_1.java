package quiz.backjoon;

import java.util.LinkedList;
import java.util.Scanner;

public class backjoon_23_1 {

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

        public String visit(Node n) {
            return n.data + " ";
        }

        // 스택

        public String dfs(int v) {
            return dfs(nodes[v-1]);
        }


        public String dfs(Node n) {
            String answer = "";
            initMarks();   // 그래프 초기화
            LinkedList<Node> s = new LinkedList<Node>();  // 큐를 만든다.
            s.add(n);    // 큐에 하나 넣는다.

            // 큐 데이터가 다 없어질때까지
            while (!s.isEmpty()) {

                // 큐에서 하나 뺸다
                Node root = s.removeLast();
                root.marked = true;
                answer += visit(root);

                // 작은것부터 방문
                root.adjacent.sort(null);
                for (Node closed : root.adjacent) {
                    if (closed.marked == false) {
                        closed.marked = true;
                        answer += visit(closed);
                        s.add(closed);
                    }
                }
            }

            return answer;
        }

        // 큐
        public String bfs(int v) {

            Node n = nodes[v - 1];
            return bfs(n);
        }

        public String bfs(Node n) {
            String answer = "";
            initMarks();   // 그래프 초기화
            LinkedList<Node> q = new LinkedList<Node>();  // 큐를 만든다.
            q.add(n);    // 큐에 하나 넣는다.

            // 큐 데이터가 다 없어질때까지
            while (!q.isEmpty()) {

                // 큐에서 하나 뺸다
                Node root = q.removeFirst();
                root.marked = true;
                answer += visit(root);

                // 작은것부터 방문
                root.adjacent.sort(null);
                for (Node closed : root.adjacent) {
                    if (closed.marked == false) {
                        closed.marked = true;
                        answer += visit(closed);
                        q.add(closed);
                    }
                }
            }

            return answer;
        }

        public void initMarks() {
            for (int i = 0; i < nodes.length; i++) {
                nodes[i].marked = false;
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();

        if (!(n >= 1 && n <= 1000)) {
            System.out.println("out of range");
            return;
        }

        if (!(m >= 1 && m <= 10000)) {
            System.out.println("out of range");
            return;
        }
        if (!(v >= 1 && v <= 1000)) {
            System.out.println("out of range");
            return;
        }

        Graphe g = new Graphe(n);

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            g.addEdge(a, b);
        }

        System.out.println(g.dfs(v));
        System.out.println(g.bfs(v));

    }


}
