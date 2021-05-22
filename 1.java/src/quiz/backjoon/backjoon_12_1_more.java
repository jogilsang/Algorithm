package quiz.backjoon;

import java.util.Scanner;

public class backjoon_12_1_more {

    public static void selectionSort(int[] arr, int start) {

        if(start < arr.length - 1) {
            int min_index = start;
            for(int i = start ; i < arr.length ; i++) {
                if(arr[i] < arr[min_index]) {
                    min_index = i;
                }
            }
            // swap
            int temp = arr[min_index];
            arr[min_index] = arr[start];
            arr[start] = temp;
            selectionSort(arr ,start + 1);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        sc.nextLine();

        if(n >= 1 && n <= 1000) {

        }

        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }

        selectionSort(arr , 0 );
        printArr(arr);

    }

    public static void printArr(int[] arr){
         for(int value : arr) {
             System.out.println(value);
         }
    }

}
