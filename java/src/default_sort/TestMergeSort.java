package default_sort;

public class TestMergeSort {

    public static void mergeSort(int[] arr) {
        int[] tmp = new int[arr.length];
        mergeSort(arr, tmp, 0 , arr.length - 1);
    }

    public static void mergeSort(int[] arr, int[] tmp, int start, int end) {

        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, tmp, start, mid);
            mergeSort(arr, tmp, mid+1, end);
            merge(arr, tmp, start, mid, end);
        }
    }

    private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {

        for(int i = start ; i <= end; i++ ) {
            tmp[i] = arr[i];
        }
        int part1 = start;
        int part2 = mid + 1;
        // 결과 배열방
        int index = start;

        // 첫번째 배열이나 두번쨰 배열 끝까지 갈떄까지
        while(part1 <= mid && part2 <= end) {
            if(tmp[part1] <= tmp[part2]) {
                arr[index] = tmp[part1];
                part1++;
            }
            else {
                arr[index] = tmp[part2];
                part2++;
            }
            index++;
        }

        for(int i = 0 ; i <= mid - part1 ; i++) {
            arr[index + i] = tmp [part1 + i];
        }

    }

    public static void main(String[] args) {

        // 합병정렬
        int[] arr = {3,9,4,7,5,0,1,6,8,2};
        printArr(arr);
        mergeSort(arr);
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
