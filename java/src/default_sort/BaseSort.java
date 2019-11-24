package default_sort;

public class BaseSort {

    // TODO :  선택정렬
    public static void selectionSort(int[] arr) {
        selectionSort(arr,0);
    }

    public static void selectionSort(int[] arr, int start) {
        if(start < arr.length - 1) {
            int min_index = start;
            for(int i = start ; i < arr.length ; i++) {
                if(arr[i] < arr[min_index])
                    min_index = i;
            }
            swap(arr, start, min_index);
            selectionSort(arr, start+1);
        }
    }

    // TODO : 버블 정렬
    public static void bubbleSort(int[] arr) {
        bubbleSort(arr, arr.length -1);
    }

    public static void bubbleSort(int[] arr, int last) {

        if(last >0) {
            for ( int i = 1; i<= last ; i++) {
                if(arr[i-1] > arr[ i]) {
                    swap(arr, i-1, i);
                }
            }
            bubbleSort(arr, last -1);
        }

    }

    // 배열과 인덱스 두 개가 주어졌을때 값을 바꿔줌
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void printArr(int[] arr){
        // 문자열 선언
        StringBuffer toString = new StringBuffer();
        for(int value : arr) {
            toString.append(value + " ");
        }
        // 띄어쓰기
        System.out.println(toString);
    }
    
    
    
}
