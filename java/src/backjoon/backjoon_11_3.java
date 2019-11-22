// java
// 2019-11-22, time : 14:22, solved by gilsang

package backjoon;

import java.util.Scanner;

public class backjoon_11_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 사람 수
        String answer = ""; // 출력할 정답
        int rank = 0;       // 자신의 순위
        sc.nextLine(); // 한줄 넘어감

        int[][] arr = new int[n][2]; // x,y (키,몸무게)를 n만큼

        // n 조건
        if (!(n >= 2 && n <= 50)) {
            System.out.println("out of range");
            return;
        }

        // 카드 채우기
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr[i][0] = x;
            arr[i][1] = y;

            sc.nextLine();
        }

        // 모든 조합 구해보기
        // 키와 덩치 둘다 커야 순위가 높은거임
        // 키워 덩치 하나만 높은거면, 높은게아님
        // rank + 1이 출력값임

        for (int i = 0; i < n; i++) {
            int pivot_x = arr[i][0];
            int pivot_y = arr[i][1];
            for(int j = 0 ; j < n ;j++) {
                if(i==j) {
                    continue;
                }
                int compare_x = arr[j][0];
                int compare_y = arr[j][1];

                // 더 큰게존재함
                if(pivot_x < compare_x && pivot_y < compare_y) {
                    rank++;
                }
            }
            if(!answer.equals("")) {
                answer += " " + String.valueOf(rank+1);
            }else {
                answer = String.valueOf(rank+1);
            }

            rank = 0;
        }

        // 출력
        System.out.println(answer);
    }
}
