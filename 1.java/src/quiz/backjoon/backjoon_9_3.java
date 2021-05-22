package quiz.backjoon;

// java (06:24), 2019-12-10, 시간초과
import java.util.Scanner;

public class backjoon_9_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        if(!(1 <= m && m <= n && n <= 1000000)) {
            System.out.println("out of range");
            return;
        }
        // 소수를 판별할수를 꺼낸다.
        for(int i = m ; i <= n ; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int value) {

        if(value == 1) {
            return false;
        }

        for(int j = 2 ; j <= value-1 ; j++) {
            if( value % j == 0) {
                // 소수가 아니다
                return false;
            }
        }
        return true;
    }
}
