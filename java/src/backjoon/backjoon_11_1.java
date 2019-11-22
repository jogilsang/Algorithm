package backjoon;

import java.util.Scanner;

public class backjoon_11_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 조합할 카드 수
        int m = sc.nextInt(); // 맞춰야할 값
        int answer = 0; // 출력할 정답 ( <= m)

        sc.nextLine(); // 한줄 넘어감

        int[] arr = new int[n]; // n만큼 카드 수를 추가함

        // n,m 조건
        if (!(n >= 3 && n <= 100)) {
            System.out.println("out of range");
            return;
        }

        if (!(m >= 10 && m <= 300000)) {
            System.out.println("out of range");
            return;
        }

        // 카드 채우기
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr[i] = temp;
        }

        // 모든 조합 구해보기
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int temp = arr[i] + arr[j] + arr[k];
                    if (temp >= answer && temp <= m) {
                        answer = temp;
                    } else {
                        // pass
                    }
                }
            }
        }

        // 출력
        System.out.println(answer);
    }
}
