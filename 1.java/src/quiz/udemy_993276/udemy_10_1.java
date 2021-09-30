/**
 * 
 * 이진트리에서 최대값 찾기
    이진트리인지 이진탐색트리인지
    왼쪽으로 내려가던, 오른쪽으로 내려가던 동일함
    leaf노드만 값을 가진게아님

    현재 노드의 값과 왼쪽 노드 서브트리의 최대값
    오른쪽 노드 서브트리의 최대값
 * 
 */

public class BinaryTreeHandler {

    public static int getMax(Node root) {

        if(root == null) {
            return Integer.MIN_VALUE;
        }
        int leftMax = getMax(root.left);
        int rightMax = getMax(root.right);

        int childMax = Math.max(leftMax, rightMax);
        return Math.max(childMax, root.data);
    
    }

}