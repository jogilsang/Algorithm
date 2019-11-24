package quiz.backjoon;

import java.util.Scanner;

public class backjoon_7_10 {

    public static void main(String[] args) {

        // 영문a~z까지의 아스키코드값은
        // 대문자 65~90
        // 소문자 97~122

        // 알파벳
        // int[] index = new int[26];

        // 대문자 문자열을 받는다
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int answer = 0;

        for(int i =0 ; i<n ;i++){
            String input = sc.nextLine();
            int[] index = new int[26];
            int priv = 0;
            boolean isAnswer = true;
            // 글자탐색
            for(int j = 0 ; j < input.length() ; j++ ){
                // 이전꺼랑 다음꺼를 비교
                int temp = (int)input.charAt(j) - 97;
                // 진행안됬었따면
                if(index[temp] == 0) {
                    index[temp]++;
                    priv = temp;
                }
                // 기존에 진행됬었음
                else {
                    // 연속되는중
                    if(priv == temp) {
                        index[temp]++;
                    }
                    // 기존에 진행됬었지만, 연속되지는 않음 -> 그룹숫자 탈락
                    else {
                        isAnswer = false;
                    }
                }
            }

            if(isAnswer == true) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
