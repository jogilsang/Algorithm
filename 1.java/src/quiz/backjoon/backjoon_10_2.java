package quiz.backjoon;

import java.util.Scanner;

public class backjoon_10_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(!(n>=0 && n<=20)) {
            System.out.println("out of range");
            return;
        }

        int value = pibonaci(n);
        System.out.println(value);

    }

    public static int pibonaci(int n){

        // 기저사례
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        // 재귀호출
        return pibonaci(n-1) + pibonaci(n-2);
    }

}
