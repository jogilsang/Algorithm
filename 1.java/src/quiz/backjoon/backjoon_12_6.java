package quiz.backjoon;

import java.util.Scanner;

public class backjoon_12_6 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for(int i = 0 ; i < n ; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();

        }

        bubbleSort(arr);
        printArr(arr);
    }

    public static void printArr(int[][] arr) {
        for (int[] value : arr) {
            System.out.println(value[0] + " " + value[1]);
        }
    }

    public static void bubbleSort(int[][] arr){
        bubbleSort(arr, arr.length -1);
    }

    public static void bubbleSort(int[][] arr, int last){
        if(last > 0) {
            for(int i = 1 ; i <= last ; i++) {
                // 이전 항이, 다음항보다 크다면 스왑
                if(arr[i - 1][0] > arr[i][0]) {
                    // x값 변경
                    int temp = arr[i-1][0];
                    arr[i-1][0] = arr[i][0];
                    arr[i][0] = temp;

                    // y값 변경
                    temp = arr[i-1][1];
                    arr[i-1][1] = arr[i][1];
                    arr[i][1] = temp;
                }
                // 이전 항이 다음 항과 같다면
                // 두번쨰 배열값을 비교해준다.
                else if(arr[i - 1][0] == arr[i][0]){
                    // y값이 크면 스왑
                    if(arr[i-1][1] > arr[i][1]) {
                        // x값 변경
                        int temp = arr[i-1][0];
                        arr[i-1][0] = arr[i][0];
                        arr[i][0] = temp;

                        // y값 변경
                        temp = arr[i-1][1];
                        arr[i-1][1] = arr[i][1];
                        arr[i][1] = temp;
                    }
                    // y값이 같거나 작으면 스왑안함
                    else {
                        // pass
                    }
                }
            }
            bubbleSort(arr, last -1);
        }
    }



}
