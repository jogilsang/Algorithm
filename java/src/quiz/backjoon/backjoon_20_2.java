package quiz.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class backjoon_20_2 {

    public static void main(String[] args) {

        // 정답선언
        StringBuffer str = new StringBuffer();

        // 입력받기
        Scanner sc = new Scanner(System.in);

        // n 받기
        int n = sc.nextInt();

        // 탐색할 값들을 넣을 배열의 크기 n 선언
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // 이진탐색을 위한 정렬
        Arrays.sort(arr);

        //
        int m = sc.nextInt();

        int[] arrSearch = new int[m];

        for (int i = 0; i < m; i++) {
            // 찾을 값
            arrSearch[i] = sc.nextInt();

            // 순차탐색할 index
            int index = binarySearch(arr, arrSearch[i]);

            int count = sequentialSearch(arr, index, arrSearch[i], 0) ;
            str.append(count);
            str.append(" ");
        }

        System.out.println(str.substring(0, str.length() - 1));

    }

    private static int sequentialSearch(int[]arr, int start, int key, int count) {

        for(int i = start ; i < arr.length ; i++) {
            if(arr[i] == key) {
                count++;
            }
        }

        return count;
    }


    private static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        return binarySearch(arr, left, right, key);
    }

    private static int binarySearch(int[] arr, int left, int right, int key) {

        int mid = (left + right) / 2;

        if (key == arr[mid]) {
            return left;
        }

        if (key > arr[mid]) {
            return binarySearch(arr, mid + 1, right, key);
        } else {
            return binarySearch(arr, left, mid - 1, key);
        }
    }
}
