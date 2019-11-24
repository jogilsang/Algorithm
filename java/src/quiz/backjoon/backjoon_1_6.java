package quiz.backjoon;

import java.util.Scanner;

public class backjoon_1_6 {


    public static void main(String[] args) {

        // 입력형식
        Scanner sc = new Scanner(System.in);

        // ex : 3 5 6 2 4
        // 첫 번째 행에 공백(space)을 구분자로 숫자가 주어진다
        // 각 숫자는 한 자리 숫자로 주어진다 (0과 같거나 크고, 10보다 작은 숫자)
        // 같은 숫자가 중복되어 나타나지 않는다
        String input = sc.nextLine();
        String[] splitInput = input.split(" ");
        int[] arr = new int[splitInput.length];

        int count = 0;
        for(String value : splitInput) {
            arr[count++] = Integer.valueOf(value);
        }

        int sum  = 0;

        for(int value : arr) {
            sum += value;
        }

        System.out.println(sum);

    }

}
