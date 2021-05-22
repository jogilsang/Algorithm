package quiz.backjoon;

import java.util.Scanner;

public class backjoon_5_4 {

    public static void main(String[] args) {

        // 세 개의 숫자를 입력받는다.
        // index 0~9, 에 값을 집어넣으면 각 숫자별로 몇개인지 count하는 결과가됨
        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(!(a>=100 && a<1000) || !(b>=100 && b<1000) || !(c>=100 && c<1000)) {
            System.out.println("Out of range");
            return;
        }

        int multi = a * b * c;

        while(multi > 0) {
            int output = multi % 10;
            arr[output] = arr[output] + 1;
            multi /= 10;
        }

        // 결과를 출력한다.
        for(int value : arr) {
            System.out.println(value);
        }

    }

}
