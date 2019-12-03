package default_sort;

public class TestBinarySearchTree {

    static class Tree {

        class Node {

            int data;

            public Node left;
            public Node right;

            Node(int data) {
                this.data = data;
            }
        }

        Node root;

        public void makeTree(int[] arr) {
            int left = 0;
            int right = arr.length -1;
            root = makeTree(arr ,left, right);
        }

        public Node makeTree(int[] arr, int left, int right) {
            if(left > right) return null;
            int mid = (left +right) / 2;
            Node node = new Node(arr[mid]);
            node.left = makeTree(arr, left, mid -1 );
            node.right = makeTree(arr, mid+1, right);
            return node;
        }
        public void searchBTree(Node n, int key) {

            if(key < n.data) {
                searchBTree(n.left, key);
            }
            else if( key > n.data) {
                searchBTree(n.right, key);
            }
            else {
                System.out.println("find");
            }
        }
    }

    public static void main(String[] args) {

        int[] a = new int[10];
        for(int i = 0 ; i < a.length ; i++) {
            a[i] = i;
        }

        Tree t = new Tree();
        t.makeTree(a);
        t.searchBTree(t.root , 2);

    }

}
