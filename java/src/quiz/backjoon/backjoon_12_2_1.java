package quiz.backjoon;

import java.util.Scanner;

public class backjoon_12_2_1 {

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int start, int end) {

        int index = partition(arr, start, end);

        if (start < index - 1)
            quickSort(arr, start, index - 1);

        if (index < end)
            quickSort(arr, index, end);

    }

    private static int partition(int[] arr, int start, int end) {

        int pivot = arr[(start + end) / 2];

        while (start <= end) {
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;
            if (start <= end) {
                swap(arr, start,end);
                start++;
                end--;
            }
        }

        return start;
    }

    public static void swap(int[] arr, int i1, int i2) {

        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;

    }


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

        quickSort(arr);
        printArr(arr);

    }

    public static void printArr(int[] arr) {
        for(int value : arr) {
            System.out.println(value);
        }
    }

}
