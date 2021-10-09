
/**
 * 
 * 주사위로 이동 가능한 경우의 수 구하기
 * N칸의 보드게임에서 1~6의 눈금이 있는 주사윌르 굴려 갈수 있는 모든 경우의수를 반환하는 함수 구현
 * 
 */
public class udemy_5_1 {

   public void static main(String[] args) {

   }

    public static int countWays(int n) {
       
       // 음수가 되는경우
       if (n < 0) {
           return 0;
       }

       if(n == 0) {
           return 1;
       }
       
       return countWays(n-1) + 
       countWays(n-2) +
       countWays(n-3) +
       countWays(n-4) +
       countWays(n-5) +
       countWays(n-6);
    }
}

