package default_sort;

public class TestBinarySearch {


    public static int binarySearch(int[] arr, int key) {

        int left = 0;
        int right = arr.length - 1;

        return binarySearch(arr, left, right, key);

    }

    public static int binarySearch(int[] arr, int left, int right, int key) {

        int mid = (left + right) / 2;

        if(key == arr[mid]) {
            return mid;
        }

        if(key > arr[mid]) {
            return binarySearch(arr, mid + 1, right, key);
        }
        else {
            return binarySearch(arr, left, mid -1, key);
        }
    }

    public static void main(String[] args) {

        // 선택정렬
        int[] arr = {1, 2, 3, 4, 5, 6};
        printArr(arr);
        int n = 4;
        System.out.println(n + "번째" + " 인덱스는 " + binarySearch(arr, n) + "이다");
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
