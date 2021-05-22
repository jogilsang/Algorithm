package default_sort;

public class StudySort extends BaseSort {

    public static void main(String[] args) {

        // 선택정렬
        int[] arr = {3,6,1,8,2,4};
        printArr(arr);
        selectionSort(arr);
        printArr(arr);

    }


}
