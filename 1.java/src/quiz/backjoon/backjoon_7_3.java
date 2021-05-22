package quiz.backjoon;

import java.util.Scanner;

public class backjoon_7_3 {

    public static void main(String[] args) {

        // 영문a~z까지의 아스키코드값은
        // 대문자 65~90
        // 소문자 97~122

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] answers = new int[26];
        char[] lists = new char[26];

        // -1 로 초기화
        for(int j = 0 ;  j < answers.length ; j++){
            answers[j] = -1;
        }

        // str -> char
        for(int i =0 ; i < str.length()  ; i++) {
            int index = (int)str.charAt(i) - 97;
            if(answers[index] == -1) {
                answers[index] = i;
            }

        }

        String answer ="";
        for(int value : answers) {
            answer += String.valueOf(value) + " ";
        }

        System.out.println(answer);

    }

}
