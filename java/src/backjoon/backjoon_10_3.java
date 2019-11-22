package backjoon;

import java.util.Scanner;

public class backjoon_10_3 {

    // fail

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n은 3의 제곱
        if(n % 3 != 0) {
            System.out.println("out of range");
            return;
        }

        String text =
        "***\n" +
        "* *\n" +
        "***";

        System.out.println(text);
        System.out.println(text);

    }



}
