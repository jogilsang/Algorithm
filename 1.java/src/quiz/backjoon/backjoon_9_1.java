package quiz.backjoon;

// java (6:52)
import java.util.Scanner;

public class backjoon_9_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i = 0 ; i < n ; i++) {
            int value = sc.nextInt();
            count = isPrime(value, count);
        }

        System.out.println(count);

    }

    public static int isPrime(int i, int count){

        // 1은 소수가 아니다. 따라서 세지않는다
        if(i == 1) {
            return count;
        }

        // 소수는 2~자기자신의수 -1 까지 나눌때 나머지가 무조건 발생한다.
        // 따라서 나머지가 발생하지않으면 소수가 아니므로 세지않는다.
        for(int j = 2; j <= i - 1; j++) {
            if( i % j ==0) {
                return count;
            }
        }
        return count+1;
    }
}
