

// 124 알고리즘
// N이 주어졌을때 n-1 번째 항을 리스트나 배열에서 리턴해주면된다
// 이때 순열이나 조합으로 만들어서 오름차순으로 정렬해서 배열에 계속 추가한다 size가 N보다 같거나 커질때까지,
// 반복문을 돌리는대 3c1, 3c2 계속... 3ck에서 k는 결과가 끝나면 count를 올려준다.

// url : https://programmers.co.kr/learn/courses/30/lessons/12899?language=java

import java.util.ArrayList;

public class practice_3_myanswer {

    // 순열 경우의수를 담은 list
    public static ArrayList<String> list = new ArrayList<>();

    public String solution(int n) {

        int[] arr = {1,2,4};

        perm(arr, 0, arr.length, arr.length);

        String answer = list.get(n-1);
        return answer;
    }


    public static void perm(int[] arr, int depth , int n, int k) {
        /**
         * arr : 조합할 숫자들
         * depth : init 값
         * n :
         * k :
         *
         * */

        // 한번 depth 가 k로 도달하면 사이클이 돌았음. 출력함.
        if (depth == k) {
            addNumber(arr, k);
            return;
        }
        for (int i = depth; i < n; i++) {
            swap(arr, i, depth);
            perm(arr, depth + 1, n, k);
            swap(arr, i, depth);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void addNumber(int[] arr, int k) {
        String temp = "";
        for (int i = 0; i < k; i++) {
            if (i == k - 1)
                temp = temp + String.valueOf(arr[i]);
            else
                temp = temp + String.valueOf(arr[i]);
        }
        list.add(temp);
    }


}
