package default_sort;

public class TestSelectionSort {

    public static void selectionSort(int[] arr) {
        selectionSort(arr, 0);
    }

    public static void selectionSort(int[] arr, int start) {

        if(start < arr.length - 1) {
            int min_index = start;
            for ( int i = start ; i < arr.length -1 ;i ++) {
                if(arr[i] < arr[min_index]) {
                    min_index = i;
                }
            }
            swap(arr, start, min_index);
            selectionSort(arr, start);
        }

    }

    public static void main(String[] args) {

        // 선택정렬
        int[] arr = {3, 6, 1, 8, 2, 4};
        printArr(arr);
        selectionSort(arr);
        printArr(arr);

    }


    // 배열과 인덱스 두 개가 주어졌을때 값을 바꿔줌
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void printArr(int[] arr) {
        // 문자열 선언
        StringBuffer toString = new StringBuffer();
        for (int value : arr) {
            toString.append(value + " ");
        }
        // 띄어쓰기
        System.out.println(toString);
    }

}
