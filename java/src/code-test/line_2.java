import java.util.ArrayList;
import java.util.Scanner;

public class line_2 {

    // 순열 만들고 k번쨰 순열값 return하기

    // 순열 경우의수를 담은 list
    public static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

        // 입력형식
        Scanner sc = new Scanner(System.in);

        // 첫 번째 행에 공백(space)을 구분자로 숫자가 주어진다
        // 각 숫자는 한 자리 숫자로 주어진다 (0과 같거나 크고, 10보다 작은 숫자)
        // 같은 숫자가 중복되어 나타나지 않는다
        String a = sc.nextLine();
        String[] k = a.split(" ");
        int[] arr = new int[k.length];

        int index = 0;
        for (String value : k) {
            arr[index++] = Integer.parseInt(value);
        }

        // 두 번째 행에 찾으려는 수열의 순서(k)가 주어진다
        // k는 조합된 순열의 개수보다 크거나 작지 않다
        int b = sc.nextInt();

        // 출력 형식
        // 조합된 순열을 오름차순으로 정렬 했을 때 k번째 순열
        // 맨 앞자리가 0인 경우는 0을 그대로 유지한다
        perm(arr, 0, arr.length, arr.length, b);
        System.out.println(list.get(b - 1));
    }

    public static void perm(int[] arr, int depth , int n, int k, int b) {

        // 한번 depth 가 k로 도달하면 사이클이 돌았음. 출력함.
        if (depth == k) {
            addNumber(arr, k);
            return;
        }
        for (int i = depth; i < n; i++) {
            swap(arr, i, depth);
            perm(arr, depth + 1, n, k, b);
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
