package quiz.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class backjoon_12_1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();

        if (!(n >= 1 && n <= 1000)) {
            System.out.println("out of range");
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        printArr(arr);

    }

    public static void printArr(int[] arr) {
        for (int value : arr) {
            System.out.println(value);
        }
    }

}
