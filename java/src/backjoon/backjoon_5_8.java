package backjoon;

import java.util.Scanner;

public class backjoon_5_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // int와 String 사이 공백에러발생, 제거요망

        // 입력값 index에 맞게 점수를 집어넣음

        // 한 줄씩 평균을 넘는 학생들의 비율
        float[] points = new float[n];

        // 입력값
        String[] arr = new String[n];



        for (int i = 0; i < n; i++) {
            // 문자열을 입력받음 (OOOOXXXXOOO)
            arr[i] = sc.nextLine();

            // 포인트와 포인트합산값을 선언
            int point = 0;
            int sum = 0;

            // O,X를 각각 쪼개서 새롭게 배열을 만듬
            String[] temp = arr[i].split("");
            for (int j = 0; j < temp.length; j++) {

                // O를 만나면 point 증가 그리고 점수 추가
                if (temp[j].equals("O")) {
                    sum += ++point;
                }
                // X를 만나면 0으로 초기화
                else {
                    point = 0;
                }
            }
            // 포인트 합산값을 포인트 배열에 넣음
            points[i] = sum;
        }

        // 각각의 문자열 계산한 포인트를 출력함
        for (int point : points) {
            System.out.println(point);
        }

    }

}
