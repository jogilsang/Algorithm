package quiz.backjoon;

import java.util.Scanner;

public class backjoon_12_9 {


    public static void insertionSort(String[][] arr) {
        insertionSort(arr, 1);
    }

    public static void insertionSort(String[][] arr, int end) {

        if(end < arr.length) {
            for(int i = end ; i > 0 ; i--) {
                if(Integer.valueOf(arr[i-1][0]) > Integer.valueOf(arr[i][0])) {

                    swap(arr, i-1, i);
                }
            }
        }
    }

    public static void swap(String[][] arr, int i, int i1) {
        String temp_0 = arr[i][0];
        String temp_1 = arr[i][1];
        arr[i][0] = arr[i1][0];
        arr[i][1] = arr[i1][1];
        arr[i1][0] = temp_0;
        arr[i1][1] = temp_1;
    }

    public static void main(String[] args) {

        // 입력
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        sc.nextLine();

        // 2차원배열
        String[][] arr = new String[n][2];

        // 입력순서 배열
        int[] dateOrder = new int[n];

        // 값 받기

        for(int i = 0 ; i < n ; i++) {
            String[] temp = sc.nextLine().split(" ");
            arr[i][0] = temp[0];
            arr[i][1] = temp[1];
            dateOrder[i] = i;
        }

        insertionSort(arr);

        for(String[] str : arr) {
            System.out.println(str[0] + " " + str[1]);
        }

        // 1. [0]에 따라 오름차순
        // 2. [0]가 같으면, 입력순서에 따라 정렬



    }

}
