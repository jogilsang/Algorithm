package quiz.backjoon;

import java.util.Scanner;

public class backjoon_7_5 {

    public static void main(String[] args) {

        // 영문a~z까지의 아스키코드값은
        // 대문자 65~90
        // 소문자 97~122

        // 첫번째 줄 값만큼 반복
        Scanner sc = new Scanner((System.in));
        String str = sc.nextLine();
        int counts[] = new int[26];
        int sum = 0;
        int num = 0;
        int index = 0;

        // 각 알파벳별로 몇개있는지 count 완료
        for(int i = 0 ; i < str.length();  i++) {
            char c = str.charAt(i);
            int value = (int)c;
            if(value >= 65 && value <= 90) {
                value -= 65;
            }else if(value >=97 && value <=122){
                value -= 97;
            }
            counts[value]++;
        }

        for(int j = 0 ; j < counts.length  ; j++  ) {
            if(counts[j] > sum ) {
                sum = counts[j];
                num = 0;
                index = j;
            }
            else if (counts[j] == sum){
                num++;
            }
            else {
                // pass
            }
        }

        if(num > 0) {
            System.out.println("?");
        }else {
            System.out.println((char)(index+65));
        }

    }

}
