

/**
 * 주어진 Binary Tree가 Binary Search Tree인지 판별하기
 * 왼쪽 자식은 부모의 값에 비해 같거나 작다.
 * 오른쪽 자식은 부모의 값에 비해 크다.
 *
 * root를 고려해야함.
 */

public class udemy_10_4 {
    public static void main(String[] args) {

    }

    public static boolean isBST(Node root) {
        return isBSTRec(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    // 불변식을 적어준다
    // min < node.data <= max
    private static boolean isBSTRec(Node node, int min, int max) {
        // 노드가 하나밖에 없는경우, bst
        if(node == null) {
            return true;
        }
        if(node.data <= min || node.data > max){
            return false;
        }
        boolean leftBst = isBSTRec(node.left, min, node.data);
        boolean rightBst = isBSTRec(node.right, node.data, max);

        return leftBst && rightBst;
    }


    public static boolean isBST_2(Node root) {
        // 왼쪽 자식이 부모보다 크다면
        boolean isBSTLeft = isBST(root.left);
        if(isBSTLeft == false) {
            return false;
        }

        // 오른쪽 자식이 부모보다 작거나 같다면
        boolean isBSTRight = isBST(root.right);
        if(isBSTRight == false) {
            return false;
        }
        return true;
    }

}


