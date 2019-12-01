package quiz.backjoon;

import java.util.Scanner;

public class backjoon_13_1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // 1 <= m <= n <= 8
        if(!((n>= 1 && n <=8) && (m>=1 && m <= 8) && n>=m)) {
           System.out.println("Out of range");
            return;
        }
        StringBuffer str = new StringBuffer();

        for(int i = 1 ; i <= n; i++) {
            for(int j = 1 ; i <= m; i++) {
                if(i != j) {
                    str.append(i);
                    str.append(" ");
                    str.append(j);

                }
            }
            str.append("\n");
        }

    }

}
