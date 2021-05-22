package quiz.backjoon;

// java (00:00), 2019-12-10
// 에라토스테네스의체
//

import java.util.Scanner;

public class backjoon_9_3_2 {

    public static void main(String[] args) {

        // m,n 으로 배열을 만든다.
        // 각 index와 일치하게 만들고, 0번쨰,1번째는 0 으로 채운다
        // 소수의 배수 index는 0으로 채운다.
        // 0이 아닌 값을 최종적으로 출력한다.

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (!(1 <= m && m <= n && n <= 1000000)) {
            System.out.println("out of range");
            return;
        }

        // 배열 선언 및 초기화
        int[] arr = new int[n - m + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = m + i;
        }

        // 에라토스테네스의 체
        // 소수로 판정되면, 배수를 지운다.
        for (int i = 0; i < arr.length; i++) {

            // 값을 가져온다
            int value = arr[i];

            // 소수라면
            if (isPrime(value)) {
                // 소수를 출력한다
                System.out.println(value);

                // 소수의 배수를 없앤다
                // 기존 인덱스에 소수의 값을 더해서, 배열방을 확인하면됨
                int new_index = i + value;
                while(new_index < arr.length) {
                    arr[new_index] = 1;
                    new_index += value;
                }
            }
            // 소수가 아니라면
            else {
                // 패스
            }
        }
    }

    public static boolean isPrime(int value) {

        if (value == 1 || value == 0) {
            return false;
        }

        for (int j = 2; j <= value - 1; j++) {
            if (value % j == 0) {
                // 소수가 아니다
                return false;
            }
        }
        return true;
    }
}
