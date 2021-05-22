package quiz.backjoon;

import java.util.Scanner;

public class backjoon_5_3 {

    public static void main(String[] args) {

        final String ASCENDING = "ascending";
        final String DESCENDING = "descending";
        final String MIXED = "mixed";
        int solution = 0;

        // 주어진 숫자개수 만큼 값을 정함
        // 비교를 한다
        // ascending이면 +0
        // descending이면 -1
        // 값이 변함이 없으면 ascending 으로 판별
        // 값이 0 면 descending 으로 판별
        // 값이 중간이면 mixed로 판별

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] valuesString = line.split(" ");
        int[] values = new int[valuesString.length];
        solution = valuesString.length;

        int i = 0;
        for(String value : valuesString) {
            values[i++] = Integer.valueOf(value);
        }

        final int pivot = valuesString.length-1;
        solution = valuesString.length - 1;

        for(i = 0; i < valuesString.length-1  ;  i++) {
            if(values[i]>values[i+1]) {
                solution--;
            }
        }

        switch (solution) {

            case 0 :
                System.out.println(DESCENDING);

                break;
            case 7 :
                System.out.println(ASCENDING);
                break;
            default:
                System.out.println(MIXED);
                break;
        }

    }

}
