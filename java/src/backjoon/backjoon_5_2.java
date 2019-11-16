package backjoon;

import java.util.*;

public class backjoon_5_2 {

    public static void main(String[] args) {

        int[] values = new int[9];
        int max = 0;
        int index = -1;

        Scanner sc = new Scanner(System.in);

        int count = 0;
        while(count != 9) {
            ++count;
            int n = sc.nextInt();
            if(n > max) {
                max = n;
                index = count;
            }
        }
        System.out.println(String.valueOf(max));
        System.out.println(String.valueOf(index));

    }

}
