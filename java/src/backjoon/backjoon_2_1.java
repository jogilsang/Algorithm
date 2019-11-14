package backjoon;

import java.util.Scanner;

public class backjoon_2_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] splitInput = input.split(" ");
        int[] arr = new int[splitInput.length];

        int count = 0;

        for (String value : splitInput) {
            arr[count++] = Integer.valueOf(value);
        }

        if (arr[0] > arr[1]) {
            System.out.println(">");

        } else if (arr[0] < arr[1]) {
            System.out.println("<");

        } else {
            System.out.println("==");
        }


    }


}
