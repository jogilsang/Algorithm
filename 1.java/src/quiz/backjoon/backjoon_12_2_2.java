package quiz.backjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class backjoon_12_2_2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();

        if (!(n >= 1 && n <= 1000)) {
            System.out.println("out of range");
            return;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);
        printArr(arr);

    }

    public static void printArr(int[] arr) {
        StringBuffer str = new StringBuffer();
        for (int value : arr) {
            str.append(value + "\n");
        }
        System.out.println(str);
    }

    public static void printArr(ArrayList<Integer> arr) {
        for (int value : arr) {
            System.out.println(value);
        }
    }

}
