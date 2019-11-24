package quiz.backjoon;

import java.util.Scanner;

public class backjoon_12_5 {

    public static void selectionDISCSort(int[] arr) {

        selectionDISCSort(arr, 0);
    }


    public static void selectionDISCSort(int[] arr, int start) {

        if (start < arr.length - 1) {
            int max_index = start;
            for (int i = start; i < arr.length; i++) {
                if (arr[i] > arr[max_index]) {
                    max_index = i;
                }
            }
            int temp = arr[max_index];
            arr[max_index] = arr[start];
            arr[start] = temp;
            selectionDISCSort(arr, start + 1);

        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        String n = sc.nextLine();
        String[] arr = n.split("");
        int[] answers = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answers[i] = Integer.valueOf(arr[i]);
        }

        selectionDISCSort(answers);
        printArr(answers);

    }

    public static void printArr(int[] arr) {
        StringBuffer str = new StringBuffer();
        for (int value : arr) {
            str.append(value);
        }
        System.out.println(str);
    }

}
