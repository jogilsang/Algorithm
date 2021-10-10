/**
 * 
 * 2의 제곱수인지 판별
 * 2,4,8,16,32,64와 같이 2의 제곱으로 이뤄진 수이면 true를 반환하고 아니면 false를 반환
 * 
 * 2로 계속 나누는 방법 대신 비트 연산을 이용하여 코드를 작성한다.
 * 
 */

public class udemy_12_2 {
    public static void main(String[] args) {

    }

    public static boolean isPowerOf2(int i) {
        // 2 : 10
        // 4 : 100 
        // 8 : 1000
        // 16 : 10000
        // 2^n : 앞자리가 0임 
        if(i==0 || i==1) return true;
        
        // 일반풀이
        // 1. 2진수로 바꾼다
        // 2. for문으로 0번째가 1인경우, 1번부터~length-1까지 0이면 제곱수

        // 정답
        return (i & (i - 1) == 0);
    }

} 