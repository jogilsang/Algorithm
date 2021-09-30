

public class Node {
    int data;
    Node left;
    Node right;

    public Node() {}
    public Node(int n) {
        data = n;
    }

    public Node(int n, Node l, Node r) {
        data = n;
        left = l;
        right = r;
    }
}