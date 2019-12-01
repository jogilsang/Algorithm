package default_sort;

public class BaseSort {

    // TODO : 삽입정렬 (AISC)
    public static void insertionSort(int[] arr) {
        insertionSort(arr, 1);
    }

    public static void insertionSort(int[] arr, int end) {

        if (end < arr.length) {
            for (int i = end; i > 0; i--) {
                // 이전항이 그 다음 항보다 크면 swap
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i - 1, i);
                }
            }
            insertionSort(arr, end + 1);
        }
    }

    // 문자열 길이, 문자열 사전순에 에 따라 삽입정렬
    public static void insertionSort(String[] arr) {
        insertionSort(arr, 1);
    }

    public static void insertionSort(String[] arr, int end) {

        if (end < arr.length) {

            for (int i = end; i > 0; i--) {
                // 문자열 길이비교 : 이전항이 길면 다음항과 바꾸기
                if (arr[i - 1].length() > arr[i].length()) {
                    swap(arr, i - 1, i);
                }
                // 문자열 길이가 같다면, compareTo Method로 알파벳순으로 정렬
                else if (arr[i - 1].length() == arr[i].length()) {
                    if (arr[i - 1].compareTo(arr[i]) > 0) {
                        swap(arr, i - 1, i);
                    }
                }
            }
            insertionSort(arr, end + 1);
        }
    }

    // TODO :  선택정렬 (AISC)
    public static void selectionSort(int[] arr) {
        selectionSort(arr, 0);
    }

    public static void selectionSort(int[] arr, int start) {
        if (start < arr.length - 1) {
            int min_index = start;
            for (int i = start; i < arr.length; i++) {
                if (arr[i] < arr[min_index])
                    min_index = i;
            }
            swap(arr, start, min_index);
            selectionSort(arr, start + 1);
        }
    }

    // TODO :  선택정렬 (DISC)
    public static void selectionDISCSort(int[] arr) {

        selectionDISCSort(arr, 0);
    }


    public static void selectionDISCSort(int[] arr, int start) {

        if (start < arr.length - 1) {
            int max_index = start;
            for (int i = start; i < arr.length; i++) {
                if (arr[i] > arr[max_index]) {
                    max_index = i;
                }
            }
            int temp = arr[max_index];
            arr[max_index] = arr[start];
            arr[start] = temp;
            selectionDISCSort(arr, start + 1);

        }
    }


    // TODO : 버블 정렬 (AISC)
    public static void bubbleSort(int[] arr) {
        bubbleSort(arr, arr.length - 1);
    }

    public static void bubbleSort(int[] arr, int last) {

        if (last > 0) {
            for (int i = 1; i <= last; i++) {
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i - 1, i);
                }
            }
            bubbleSort(arr, last - 1);
        }

    }

    // TODO : 2차원 버블정렬(AISC)

    public static void bubbleSort(int[][] arr) {
        bubbleSort(arr, arr.length - 1);
    }

    public static void bubbleSort(int[][] arr, int last) {
        if (last > 0) {
            for (int i = 1; i <= last; i++) {
                // 이전 항이, 다음항보다 크다면 스왑
                if (arr[i - 1][0] > arr[i][0]) {
                    // x값 변경
                    int temp = arr[i - 1][0];
                    arr[i - 1][0] = arr[i][0];
                    arr[i][0] = temp;

                    // y값 변경
                    temp = arr[i - 1][1];
                    arr[i - 1][1] = arr[i][1];
                    arr[i][1] = temp;
                }
                // 이전 항이 다음 항과 같다면
                // 두번쨰 배열값을 비교해준다.
                else if (arr[i - 1][0] == arr[i][0]) {
                    // y값이 크면 스왑
                    if (arr[i - 1][1] > arr[i][1]) {
                        // x값 변경
                        int temp = arr[i - 1][0];
                        arr[i - 1][0] = arr[i][0];
                        arr[i][0] = temp;

                        // y값 변경
                        temp = arr[i - 1][1];
                        arr[i - 1][1] = arr[i][1];
                        arr[i][1] = temp;
                    }
                    // y값이 같거나 작으면 스왑안함
                    else {
                        // pass
                    }
                }
            }
            bubbleSort(arr, last - 1);
        }
    }

    // TODO : 이진탐색(BinarySearch)

    public static int binarySearch(int[] arr, int key) {

        int left = 0;
        int right = arr.length - 1;

        return binarySearch(arr, left, right, key);

    }

    public static int binarySearch(int[] arr, int left, int right, int key) {

        int mid = (left + right) / 2;

//        있을경우 1, 없을경우 0 return
//        if(left > right) {
//            return 0;
//        }
//
//        if (key == arr[mid]) {
//            return 1;
//        }

        if (arr[mid] == key) {
            return mid;
        }

        if (key > arr[mid]) {
            return binarySearch(arr, mid + 1, right, key);
        } else {
            return binarySearch(arr, left, mid - 1, key);
        }
    }

    // TODO : 순차탐색
    public static int sequentialSearch(int[] subArray, int search) {
        for (int i = 0; i < subArray.length; i++) {
            if (subArray[i] == search)
                return i;
        }
        return -1;
    }


    // TODO : UTILL
    // 배열과 인덱스 두 개가 주어졌을때 값을 바꿔줌
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void swap(String[] arr, int index1, int index2) {
        String temp = arr[index1];
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
