package backjoon;

// java
// 2019-11-22, time : 02:00, solved by gilsang
import java.util.Scanner;

public class backjoon_3_9 {

    // 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String answer ="";

        if(!(n>=1 && n<=100)){
            System.out.println("out of range");
            return;
        }

        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j <= i ; j++) {
                answer += "*";
            }
            answer += "\n";
        }

        System.out.println(answer);
    }
}
