package default_sort;

public class TestMergeSort2 {

    // i: 정렬된 왼쪽 리스트에 대한 인덱스
    // j: 정렬된 오른쪽 리스트에 대한 인덱스
    // k: 정렬될 리스트에 대한 인덱스
    /* 2개의 인접한 배열 list[left...mid]와 list[mid+1...right]의 합병 과정 */
    /* (실제로 숫자들이 정렬되는 과정) */
    public static void merge(int list[], int[] tmp, int left, int mid, int right) {
        
        int sorted_left_index, sorted_right_index, k, l;
        
        sorted_left_index = left;
        sorted_right_index = mid + 1;
        k = left;

        /* 분할 정렬된 list의 합병 */
        while (sorted_left_index <= mid && sorted_right_index <= right) {
            if (list[sorted_left_index] <= list[sorted_right_index])
                tmp[k++] = list[sorted_left_index++];
            else
                tmp[k++] = list[sorted_right_index++];
        }

        // 남아 있는 값들을 일괄 복사
        if (sorted_left_index > mid) {
            for (l = sorted_right_index; l <= right; l++)
                tmp[k++] = list[l];
        }
        // 남아 있는 값들을 일괄 복사
        else {
            for (l = sorted_left_index; l <= mid; l++)
                tmp[k++] = list[l];
        }

        // 배열 tmp[](임시 배열)의 리스트를 배열 list[]로 재복사
        for (l = left; l <= right; l++) {
            list[l] = tmp[l];
        }
    }
    
    

    // 합병 정렬
    public static void mergeSort(int[] arr) {

        int[] tmp = new int[arr.length];
        
        mergeSort(arr, tmp, 0, arr.length - 1);
        
    }
    
    
    public static void mergeSort(int[] arr, int[] tmp, int left, int right) {
        int mid = (left + right) / 2; // 분할(Divide)

        if (left < right) {
            mergeSort(arr, tmp, left, mid); // 앞쪽 부분 리스트 정렬 -정복(Conquer)
            mergeSort(arr, tmp, mid + 1, right); // 뒤쪽 부분 리스트 정렬 -정복(Conquer)
            merge(arr, tmp, left, mid, right); // 정렬된 2개의 부분 배열을 합병하는 과정 -결합(Combine)
        }
    }

    public static void main(String[] args) {

    }
}
