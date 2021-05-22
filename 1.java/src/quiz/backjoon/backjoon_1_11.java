package quiz.backjoon;

import java.util.Scanner;

public class backjoon_1_11 {


    public static void main(String[] args) {

        // 입력형식
        Scanner sc_1 = new Scanner(System.in);
        String input_1 = sc_1.nextLine();
        int A = Integer.valueOf(input_1);

        Scanner sc_2 = new Scanner(System.in);
        String input_2 = sc_2.nextLine();
        int B = Integer.valueOf(input_2);

        // 두 숫자 모두 세자리

        int line_1 = A * ((B % 100) % 10);
        int line_2 = A * ((B % 100) / 10 );
        int line_3 = A * (B / 100);
        int line_4 = A * B;

        System.out.println(line_1);
        System.out.println(line_2);
        System.out.println(line_3);
        System.out.println(line_4);


    }

}
