package quiz.backjoon;

// java (00:00), 2019-12-10
// 에라토스테네스의체
// 12:46

import java.util.Scanner;

public class backjoon_9_3_1 {

    public static void main(String[] args) {

        // m,n 으로 배열을 만든다.
        // 각 index와 일치하게 만들고, 0번쨰,1번째는 0 으로 채운다
        // 소수의 배수 index는 0으로 채운다.
        // 0이 아닌 값을 최종적으로 출력한다.

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n-m+1];

        if(!(1 <= m && m <= n && n <= 1000000)) {
            System.out.println("out of range");
            return;
        }

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = m + i;
        }

        // 에라토스테네스의 체로 거른다
        // 2,3,5,7 의 배수는 소수가 아니다.
        for(int i = 0 ; i < arr.length ; i++) {
            int value = arr[i];

            if(value == 2 || value == 3 || value == 5 || value == 7)
                continue;

            if(value % 2 == 0) {
                arr[i] = 0;
            }else if(value % 3 == 0){
                arr[i] = 0;
            }else if(value % 5 == 0) {
                arr[i] = 0;
            }else if(value % 7 == 0) {
                arr[i] = 0;
            }
        }

        for (int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == 0) {
                continue;
            }
            if(isPrime(arr[i])) {
                System.out.println(arr[i]);
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
