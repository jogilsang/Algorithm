package default_sort;

public class TestQuickSort {

    public static void main(String[] args) {

        int[] arr = {3,5,2,4,7,9,0};
        for(int value : arr) {
            System.out.println(value + " ");
        }
        quickSort(arr);
        for(int value : arr) {
            System.out.println(value + " ");
        }

    }

    private static void quickSort(int[] arr) {
        quickSort(arr, 0 ,arr.length -1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        int part = partition(arr, start , end);
        if(start < part - 1) {
            quickSort(arr, start, part -1);
        }
        if(part < end) {
            quickSort(arr, part, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {

        // 기준값을 만든다
        int pivot = arr[(start + end) / 2];
        // start가 end를 넘어가면 종료
        while(start <= end) {
            // pivot 왼쪽 값이 pivot보다 커지면 멈춤
            while(arr[start] < pivot) start++;
            // arr[end]값이 pivot보다 작으면 멈춤
            while(arr[end] > pivot) end--;
            if(start <= end) {
                swap (arr, start,end);
                start++;
                end++;
            }
        }
        return start;
    }

    private static void swap(int[] arr, int i1 , int i2) {

        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }





}
