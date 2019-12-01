package quiz.backjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class backjoon_12_8 {

    // 문자열 길이에 따라 삽입정렬
    public static void InsertionSort(String[] arr){
        InsertionSort(arr, 1);
    }

    public static void InsertionSort(String[] arr, int end){

        if(end < arr.length) {

            for(int i = end ; i > 0 ; i--) {
                // 문자열 길이비교 : 이전항이 길면 다음항과 바꾸기
                if(arr[i-1].length() > arr[i].length()) {
                    swap(arr, i-1 ,i);
                }
                // 문자열 길이가 같다면, compareTo Method로 알파벳순으로 정렬
                else if(arr[i-1].length() == arr[i].length()) {
                    if(arr[i-1].compareTo(arr[i]) > 0) {
                        swap(arr, i-1 ,i);
                    }
                }
            }
            InsertionSort(arr, end + 1);
        }
    }

    private static void swap(String[] arr, int i, int i1) {
        String temp = arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }

    public static void main(String[] args) {

        // n값을 정수로받음
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        // 문자열 중복제거
        Set<String> set = new HashSet<String>();

        // n만큼 문자열 입력을받음
        for(int i = 0 ; i < n ; i++) {
            set.add(sc.nextLine());
        }

        // Set을 array로 변경
        String[] arr = set.toArray(new String[set.size()]);

        // 출력
        InsertionSort(arr);
        for(String str : arr) {
            System.out.println(str);
        }
    }
}
