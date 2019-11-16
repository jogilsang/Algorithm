package backjoon;

import java.util.Scanner;

public class backjoon_5_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[n];
        float[] conversions = new float[n];
        int index_max = 0;
        int max = 0;
        float average = 0;

        // 값을 넣는다
        // MAX 값과 index를 찾는다
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                index_max = i;
            }
        }

        // MAX값을 제외하고 연산을 진행한뒤, float에 집어넣는다
        for (int i = 0; i < n; i++) {
            float temp = ((float) arr[i] / (float) max) * 100;
            conversions[i] = temp;
            average += conversions[i];
        }
        
        average /= n;
        System.out.println(average);


    }

}
