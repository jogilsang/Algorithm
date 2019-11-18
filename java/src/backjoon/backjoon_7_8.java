package backjoon;

import java.util.Scanner;

public class backjoon_7_8 {

    public static void main(String[] args) {

        // 영문a~z까지의 아스키코드값은
        // 대문자 65~90
        // 소문자 97~122

        // 대문자 문자열을 받는다
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;

        // index별로 대응하는 값을 집어넣는다
        int[] lists = {
                2,2,2,
                3,3,3,
                4,4,4,
                5,5,5,
                6,6,6,
                7,7,7,7,
                8,8,8,
                9,9,9,9
        };

        // index에 대한 값을 다 찾은다음, length만큼 더해줘서 출력
        for(int i = 0 ; i < str.length() ; i++) {
            int index = (int)str.charAt(i) - 65;
            sum += lists[index];
        }

        // 문자열의 길이
        int length = str.length();

        // 정답출력
        System.out.println(sum+length);
    }
}
