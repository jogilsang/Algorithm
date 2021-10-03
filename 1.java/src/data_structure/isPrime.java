import java.lang.Math;

public class isPrime {
    public static void main(String[] args) {

        int p = 8;
        if(isPrime(p)) System.out.println(p + "은 소수다");
        else System.out.println(p + "은 소수가 아니다");
    }

    /**
     *
     * 소수 판별하기
     *
     * @param n : 정수
     * @return true : 소수인경우
     *         false : 소수가 아닌경우
     *
     */

    private static boolean isPrime(int n) {
        int sqrt = (int) Math.sqrt(n);

        // 2는 짝수이므로 종료조건
        if(n == 2) return true;
        // 짝수와 1은 소수가 아니다
        if(n == 1 || n % 2 == 0) return false;

        // 제곱근까지만 홀수로 나눠보기
        for(int i = 3 ; i<=sqrt ; i+=2){
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}