package default_sort;

public class Test {

    public static int binarySearch(int[] arr, int key) {

        int left = 0;
        int right = arr.length -1;
        return binarySearch(arr , left , right, key);
    }

    public static int binarySearch(int[] arr, int left, int right, int key) {

        int mid = (left +right) /2;

        if(key == arr[mid]) {
            return key;
        }

        if(key >arr[mid]) {
            return binarySearch(arr, mid +1 , right ,key);
        }
        else {
            return binarySearch(arr, left, mid-1, key);
        }

    }


    public static void main(String[] args) {


    }


}

























