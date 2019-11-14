import java.util.*;

class Solution {
    public int solution(int n, int[] votes) {
        int[] arr = new int[n+1];
        for(int i=0; i<votes.length; i++) {
            arr[votes[i]]++;
        }
        for(int i=1; i<n+1; i++)
            if(arr[i] > n/2)
                return i;
        return -1;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 코드입니다. 아래에는 잘못된 부분이 없으니, 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n1 = 3;
        int[] votes1 = {1, 2, 1, 3, 1, 2, 1};
        int ret1 = sol.solution(n1, votes1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int n2 = 2;
        int[] votes2 = {2, 1, 2, 1, 2, 2, 1};
        int ret2 = sol.solution(n2, votes2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");        
    }    
}