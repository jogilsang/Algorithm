package default_sort;

public class TestInPrePostOrder {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
        Node(){

        }
    }

    static class Tree {
        public Node root;

        public void setRoot(Node node) {
            this.root = node;
        }
        public Node getRoot(){
            return root;
        }
        public Node makeNode(Node left, int data, Node right) {
            Node node = new Node(data);
            node.left = left;
            node.right = right;
            return node;
        }

        // left , root, right
        public void inorder(Node node) {
            if(node != null) {
                inorder(node.left);
                System.out.println(node.data);
                inorder(node.right);
            }
        }

        // root , left , right
        public void preorder(Node node) {
            if(node != null) {
                System.out.println(node.data);
                preorder(node.left);
                preorder(node.right);
            }
        }

        // left, right, root
        public void postorder(Node node) {
            if(node != null) {
                postorder(node.left);
                postorder(node.right);
                System.out.println(node.data);
            }
        }
    }

    public static void main(String[] args) {

        Tree t = new Tree();
        Node n4 = t.makeNode(null, 4,null);
        Node n5 = t.makeNode(null, 5,null);
        Node n2 = t.makeNode(n4, 2,n5);
        Node n3 = t.makeNode(null, 3,null);
        Node n1 = t.makeNode(n2, 1 , n3);
        t.setRoot(n1);

        System.out.println("InOrder");
        t.inorder(t.root);

        System.out.println("PreOrder");
        t.preorder(t.root);

        System.out.println("PostOrder");
        t.postorder(t.root);

    }

}





















