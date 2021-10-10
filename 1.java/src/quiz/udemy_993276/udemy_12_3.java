/**
 * 
 * 두 수의 비트차이수 구하기
 * 예를들어 이진수로 1101,1110 이 두수는 2개 비트가 다르다
 * 
 */

public class udemy_12_3 {
    public static void main(String[] args) {

    }

    public static int count(int a, int b) {
        int diff = a^b;
        int count = 0;

        while(diff != 0 ) {
            // 제일 앞에있는 비트를 0으로 set
            // 1000
            // 0111
            // 0000
            // 1001 (-1) -> 제일 앞에있는 1이 없어짐
            // 0111
            // 0001
            diff = diff & (diff-1);
            count++;
        }
        return count ;
    }

} 