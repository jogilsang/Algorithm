package quiz.backjoon;

// java (7:30), 2019-12-10
import java.util.ArrayList;
import java.util.Scanner;

public class backjoon_9_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        // M과 N 사이의 소수들의 최댓값, 최솟값 출력
        // 소수가 없으면 -1 출력

        // 1. 소수들을 구해서 배열을 만든다.
        // 2. 합과 최솟값을 찾는다.
        // 3. 출력한다. ( 배열의 길이가 0 이면 -1출력)

        ArrayList<Integer> list = new ArrayList<Integer>();

        int sum = 0;

        for (int i = m; i <= n; i++) {
            if(isPrime(i)) {
                list.add(i);
                sum += i;
            }
        }

        // 소수가 없으면 -1 리턴
        if(list.size() == 0) {
            System.out.println("-1");
            return;
        }
        else{
            list.sort(null);
        }

        System.out.println(sum);
        System.out.println(list.get(0));

    }

    public static boolean isPrime(int value) {

        // 1은 소수가 아니다. 따라서 세지않는다
        if (value == 1) {
            return false;
        }

        // 소수는 2~자기자신의수 -1 까지 나눌때 나머지가 무조건 발생한다.
        // 따라서 나머지가 발생하지않으면 소수가 아니므로 세지않는다.
        for (int j = 2; j <= value - 1; j++) {
            if (value % j == 0) {
                return false;
            }
        }
        return true;
    }
}
