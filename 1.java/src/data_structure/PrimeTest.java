import java.util.Scanner;

public class PrimeTest {
    
    public static void main(String[] args) {
        int n,count;
        System.out.print("정수를 입력하세요:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n < 2 || n > 100) {
            System.out.println("입력하신 값은 2미만, 100초과인 정수입니다");
            return ;
        }
        count = prime_number(n);
        System.out.println("2부터 " + n + "까지의 소수는 총" + count + "개 입니다.");
        sc.close();
    }

    // 2부터 n사이의 소수를 출력
    // 소수의 개수를 리턴
    static int prime_number(int n) {

        int count = 0;
        int c=0;
        // 입력받은 n에 대해서
        // 2부터 n까지 소수가있는걸 출력하고, 개수를 return
        for(int i = 2 ; i<=n ; i++) {
            // i가 소수인지 판별하는 로직
            for(int j=1; j<=i; j++){
                if(i%j==0)
                c+=1;
            }
            // 소수인경우
            if(c==2) {
                System.out.print(i + " ");
                count++;
            }
            // 초기화
            c = 0;
        }
        // 한칸띄기
        System.out.println("");
        return count;
    }

}