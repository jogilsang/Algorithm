import java.util.Arrays;
class Solution {
    String func_a(String bundle, int start, int n) {
        String answer = "";
        for(int i=0; i<n; i++)
            answer += bundle.charAt(start+i*2);
        return answer;
    }

    int[] func_b(int score1, int score2) {
        int[] answer = new int[2];
        if(score1 > score2) {
            answer[0] = 1;
            answer[1] = score1;
        }
        else if(score1 < score2) {
            answer[0] = 2;
            answer[1] = score2;
        }
        else {
            answer[0] = 0;
            answer[1] = score1;
        }
        return answer;
    }

    int func_c(String card) {
        int answer = 0;
        for(int i = 0; i < card.length(); i++) {
            answer += card.charAt(i) - 'a' + 1;
        }
        return answer;
    }

    int[] solution(int n, String bundle) {
        String aCards = func_a(bundle, @@@, @@@);
        String bCards = func_a(bundle, @@@, @@@);
        int aScore = func_c(@@@);
        int bScore = func_c(@@@);
        int[] answer = func_b(@@@, @@@);
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 4;
        String bundle = new String("cacdbdedccbb");
        int[] ret = sol.solution(n, bundle);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.print("solution 메소드의 반환 값은 ");
        System.out.printf(Arrays.toString(ret));
        System.out.println(" 입니다.");
    }
}