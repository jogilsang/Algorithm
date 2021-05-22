package quiz.backjoon;


// jogilsang, 2019-12-13, 25:00

import java.util.Scanner;

public class backjoon_14_2 {

    static long[] memoization;
    static long[] memoization_count_0;
    static long[] memoization_count_1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트케이스

        memoization = new long[41];
        memoization_count_0 = new long[41];
        memoization_count_1 = new long[41];

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            if (n > 40 && n < 0) {
                return;
            }

            long answer = fibonachi(n);

            System.out.println(String.valueOf(memoization_count_0[n]) +
                    " " +
                    String.valueOf(memoization_count_1[n]));
        }
    }

    public static long fibonachi(int n) {

        // 기저사례
        if (n == 0) {
            memoization_count_0[0] = 1;
            memoization_count_1[0] = 0;
            return 0;
        } else if (n == 1) {
            memoization_count_0[1] = 0;
            memoization_count_1[1] = 1;
            return 1;
        }

        // 메모이제이션 확인하기
        if (memoization[n] != 0) {
            return memoization[n];
        }

        // 메모이제이션 되지않았으면, 새로구하기
        memoization[n] = fibonachi(n - 1) + fibonachi(n - 2);
        memoization_count_0[n] = fibonachiCount_0(n - 1) + fibonachiCount_0(n - 2);
        memoization_count_1[n] = fibonachiCount_1(n - 1) + fibonachiCount_1(n - 2);
        return memoization[n];
    }

    private static long fibonachiCount_1(int n) {

        if (n == 0) {

            return 0;
        } else if (n == 1) {

            return 1;
        }

        if (memoization_count_1[n] != 0) {
            return memoization_count_1[n];
        }

        memoization_count_1[n] = fibonachiCount_0(n-1) + fibonachiCount_0(n-2);
        return memoization_count_1[n];
    }

    private static long fibonachiCount_0(int n) {

        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 0;
        }

        if (memoization_count_0[n] != 0) {
            return memoization_count_0[n];
        }

        memoization_count_0[n] = fibonachiCount_0(n-1) + fibonachiCount_0(n-2);
        return memoization_count_0[n];
    }
}
