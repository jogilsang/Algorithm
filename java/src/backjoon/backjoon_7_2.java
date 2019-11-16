package backjoon;

import java.util.Scanner;

public class backjoon_7_2 {


    public static void main(String[] args) {

        int sum = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        sc.nextLine();
        String input = sc.nextLine();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(input.substring(i,i+1));
            sum += arr[i];
        }

        System.out.println(sum);

    }

}
