package quiz.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class backjoon_20_1 {

    public static int binarySearch(int[] arr, int key) {

        int left = 0;
        int right = arr.length - 1;

        return binarySearch(arr, left, right, key);
    }

    public static int binarySearch(int[] arr, int left, int right, int key) {

        int mid = (left + right) / 2;

        if(left > right) {
            return 0;
        }

        if (key == arr[mid]) {
            return 1;
        }

        if (key > arr[mid]) {
            return binarySearch(arr, mid + 1, right, key);
        } else {
            return binarySearch(arr, left, mid - 1, key);
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // n을 받는다
        int n = sc.nextInt();
        sc.nextLine();

        // n크기 만큼 배열을 만든다.
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        sc.nextLine();

        // M 값을 받는다.
        int m = sc.nextInt();
        sc.nextLine();

        // 베열 선언해서, 찾을값들을 넣는다.
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열을 정렬한다.
        Arrays.sort(A);

        // 이진탐색한다. 찾으면 1, 못찾으면 0 을 대입한다.
        for (int i = 0; i < m; i++) {
            arr[i] = binarySearch(A, arr[i]);
            System.out.println(arr[i]);
        }
    }

}
