package backjoon;

import java.util.Scanner;

public class backjoon_8_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong(); // 1000
        long B = sc.nextLong(); // 70
        long C = sc.nextLong(); // 170

        int n = 1;

        // B가 C와 같으면, 손익분기점은 평생 넘을수없음
        if(B>=C) {
            System.out.println("-1");
            return;
        }

        long minus = A;
        long plus = 0 ;

        while(true){

            minus += B ;
            plus += C ;

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
