package quiz.backjoon;

import java.util.Scanner;

public class backjoon_10_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(!(n>=0 && n<=12)) {
            System.out.println("out of range");
            return;
        }

        int value = factorial(n);
        System.out.println(value);

    }

    public static int factorial(int n){

        // 기저사례
        if(n == 1 || n == 0) {
            return 1;
        }

        // 재귀호출
        return n * factorial(n-1);
    }

}
