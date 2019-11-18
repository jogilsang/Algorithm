package backjoon;

import java.util.Scanner;

public class backjoon_7_4 {

    public static void main(String[] args) {

        // 첫번째 줄 값만큼 반복
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();

        // int -> String 읽을때 에러방지
        sc.nextLine();

        // 정답변수, 반복문이 끝날때마다 한줄씩 정답이 들어감
        String answer = "";

        // 반복시작
        for(int i = 0 ; i < n ; i++) {

            // 다음줄로 넘어감
            String temp = sc.nextLine();

            // 첫번째 숫자는 반복값, 두번째 값은 반복해야될 문자열
            int repeat = Integer.valueOf(temp.split(" ")[0]);
            String[] value = temp.split(" ")[1].split("");

            // 문자열 길이만큼 반복을 적용해야함
            for(int j = 0 ; j < value.length ; j++) {

                // repeat 횟수만큼 반복해서, answer문자열에 더함
                for(int k = 0 ; k < repeat ; k++) {
                    answer = answer + value[j];
                }
            }
            // 다음 줄을 위해 개행을 붙임
            answer = answer +"\n";
        }
        // 정답출력
        System.out.println(answer);

    }

}
