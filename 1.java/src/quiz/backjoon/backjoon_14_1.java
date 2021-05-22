package quiz.backjoon;


// jogilsang, 2019-12-13, 05:41

import java.util.Scanner;

public class backjoon_14_1 {

    static long[] memoization;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 90 && n < 2) {
            return;
        }

        memoization = new long[n+1];

        long answer = fibonachi(n);
        System.out.println(answer);

    }

    public static long fibonachi(int n) {

        // 기저사례
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        // 메모이제이션 확인하기
        if (memoization[n] != 0) {
            return memoization[n];
        }

        // 메모이제이션 되지않았으면, 새로구하기
        memoization[n] = fibonachi(n - 1) + fibonachi(n - 2);
        return memoization[n];

    }
}
