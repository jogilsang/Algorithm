package backjoon;

import java.util.Scanner;

public class backjoon_5_5 {

    public static void main(String[] args) {

        // 10개 입력을 받아서 배열에 넣을예정
        // 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
        int[] arr = new int[10];

        // 0 ~  41 나머지를 가진 숫자가 있을경우 하나씩 count
        int[] remainders = new int[42];

        Scanner sc = new Scanner(System.in);

        for( int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
            if(!(arr[i] <= 1000 && arr[i] >0)) {
                System.out.println("Out of range!");
                return;
            }
        }
        
        for(int value : arr) {
            // temp : 0 ~ 41
            int temp = value % 42;
            remainders[temp]++;
        }
        
        int count = 0;
        
        for(int remainder : remainders) {
            if(remainder != 0) {
                count++;
            }
        }

        System.out.println(count);

    }

}
