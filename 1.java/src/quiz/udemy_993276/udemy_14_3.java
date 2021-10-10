

/**
 * 
 * 정렬된 2차원 배열에서 검색하기
 *
 * 아래 방법 외, binary search를 하게된다면
 * logn을 n번하니까 nlogn
 *
 * 
 */

public class udemy_14_3 {
    public static void main(String[] args) {
        // * 에서 출발
        // 값이 크면 오른쪽
        // 값이 작으면 위쪽
        // 1 1 1 1 1
        // 1 1 1 1 1
        // 1 1 1 1 1
        // 1 1 1 1 1
        // * 1 1 1 1

    }
    public static Position search(int[][] m, int target) {
        // 시작위치 지정
        int row = m.length - 1;
        int col = 0;

        // row와 col모두 index가 0보다 크고 length보다는 작게
        while(row >= 0 && col < m[0].length) {
            // 타겟값을 찾는다면
            if(m[row][col] == target) {
                // 로우와 칼럼 인덱스 반환
                return new Position(row,col);
            } 
            // 값이 크면 오른쪽 (칼럼인덱스 증가)
            else if(m[row][col] < target) {
                col++;
            } 
            // 값이 작으면 위쪽 (로우인덱스 감소)
            else {
                row--;
            }
        }

        return null;
        // int면 -1을 반환할가요?
        // exception이나 null을 반환할가요?
    }

    public udemy_14_3() {


    }

}