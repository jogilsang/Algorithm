

/**
 * binary tree의 balance가 맞는지 판별하기
 *  Balance가 맞는 상태는 모든 노드의 자식들의 높이 차이가 2이상 나지 않는 것이다 (1 허용, 2 불허)
 * 찌그러진 트리가 안됨
 */

public class udemy_10_2 {
    public static void main(String[] args) {
        System.out.println("");
    }

    // 높이를 구하는 함수
    public static int isBalancedHelper(Node n) {

        // 종료조건
        if(n==null) {
            return 0;
        }
        // 왼쪽 서브트리
        int l = isBalancedHelper(n.left);
        if( l == -1) {
            return -1;
        }
        int r = isBalancedHelper(n.right);
        if( r == -1) {
            return -1;
        }

        // 차이 - 절대값
        int diff = Math.abs(r-l);
        if(diff > 1) {
            return -1;
        }
        // 현재 노드도 포함되어야하므로 +1
        return Math.max(l,r) + 1;
    }

    public static boolean isBalanced(Node root) {
        // ToDo
        // 왼쪽 자식
        // 오른쪽 자식
        // 차이
        return isBalancedHelper(root) != -1;
    }
}


