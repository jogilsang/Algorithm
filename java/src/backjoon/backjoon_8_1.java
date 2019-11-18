package backjoon;

import java.util.Scanner;

public class backjoon_8_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 1000
        int B = sc.nextInt(); // 70
        int C = sc.nextInt(); // 170

        int n = 1;

        if(B>=C) {
            System.out.println("-1");
            return;
        }

        while(true){

            int minus = A + (B * n) ;
            int plus = C * n;

            if(plus > minus) {
                System.out.println(n);
                break;
            }
            else {
                n++;
            }
        }
    }
}
