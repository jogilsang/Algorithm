package backjoon;

import java.util.*;

public class backjoon_5_1 {

    public static void main(String[] args) {

        int min = 1000001;
        int max = -1000001;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(!(n>=1 && n<=1000000)) {
            System.out.println("N is out of range");
        }

        sc.nextLine(); // 개행문자 제거
        String temp = sc.nextLine();
        String[] valuesString = temp.split(" ");
        int[] values = new int[valuesString.length];

        int i = 0;
        for(String value : valuesString) {
            int conversion = Integer.valueOf(value);

            if(!(conversion >= -1000000 && conversion <= 1000000)) {
                System.out.println("value is out of range");
                return;
            }

            values[i++] = conversion;
        }

        for(int value : values) {

            min = min > value ? value : min;
            max = max < value ? value : max;

        }

        System.out.println(String.valueOf(min) + " " + String.valueOf(max));

    }


}
