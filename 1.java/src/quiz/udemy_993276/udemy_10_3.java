

/**
 *
 * 오름차순 정렬된 배열을 Binary Search Tree로 변환하기
 * 생성된 트리의 높이는 최소한으로 한다.
 * [1,2,3]이 입력으로 들어오면 root는 2값을 가지고 왼쪽 자식은 1, 오른쪽 자식은 3을 가지는 값을 가진다
 *
 */

public class udemy_10_3 {
    public static void main(String[] args) {

    }

    public static Node build_2(int[] a) {
        return buildRec(a,0,a.length-1);
    }

    private static Node buildRec(int[] a,int l, int h) {
        // low가 high보다 클수없음
        if(l>h) {
            return null;
        }
        // 중간값
        int m = (l+h)/2;

        Node left = buildRec(a, l, m-1);
        Node right = buildRec(a, m+1, h);

        return new Node(a[m], left, right);
    }

    public static Node build_1(int[] a) {
        // ToDo
        // 1. root의 index는 중간
        Node root = new Node(a[a.length/2]);
        // for문을 2번돌려서 root의 왼쪽,오른쪽을 채운다
        // 왼쪽
        // 0 ~ length/2 -1
        for (int i = 0; i < a.length/2 - 1; i++) {

        }

        // 오른쪽
        // length/2 + 1 ~ length
        for (int j = a.length/2 + 1; j < a.length; j++) {

        }
    }
}


