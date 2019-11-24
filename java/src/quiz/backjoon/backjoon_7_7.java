package quiz.backjoon;

import java.util.Scanner;

public class backjoon_7_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 1000
        int B = sc.nextInt(); // 70

        // A와 B중 큰 숫자를 출력한다
        // 근데 둘다 숫자를 뒤집어서 비교한다

        String[] A_split = String.valueOf(A).split("");
        String[] B_split = String.valueOf(B).split("");

        String new_A = "";
        String new_B = "";

        for(int i = A_split.length - 1 ; i >= 0 ; i--) {
            new_A += A_split[i];
            new_B += B_split[i];
        }

        int value_A = Integer.valueOf(new_A.trim());
        int value_B = Integer.valueOf(new_B.trim());

        System.out.println(value_A >= value_B ? value_A : value_B);

    }
}
