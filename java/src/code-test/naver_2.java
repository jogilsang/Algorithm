import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class naver_2 {


    public static void main(String[] args) {

        long conclution = solution(100000);
        System.out.println(conclution);
    }

    static HashMap<Long, Long> map = new HashMap<Long, Long>();

    public static long solution(int n) {

        // 해쉬셋 생성
        // 숫자가 고유하게들어간다
        HashSet<Long> hashSet = new HashSet<Long>();

        // n 입력받는 크기 이하 만큼 만들어서 출력
        if(n==1) {
            return 2L;
        }
        // 초항 넣기
        hashSet.add(2L);

        long init = 2L;
        long next = 1L;

        // n보다 조합수가 크다면, 조합 다음수+1까지만 만들고 n번쨰 return 해주면됨


//        if(factorial(init) >= n) {
//
//        }
//        // init 값을 증가시켜줘야함
//        else {
//            next++;
//        }

        // 조합 만든게 사이즈가 크지 않을떄까지
        while(!(hashSet.size() > n)) {
//        while(!(factorialMemoization(next) > n)) {

            // 시작값부터 끝값까지 개수에 만족해서 충분히 다 만들어서 넣는다.
            // 조합을 만들어서 hashset에 넣어준다.
            for(long i = init ; i < init + next ; i++) {
                long value = i;
                for(long j = i + 1 ; j <= i + next; j++) {
                    value = value * j;
                    //System.out.println("i : " + String.valueOf(j));
                    //System.out.println("j : " + String.valueOf(j));
                    //System.out.println("value : " + String.valueOf(value));
                    hashSet.add(value);
                    //long fact = factorialMemoization(j);
                    //hashSet.add(fact);

                }
            }
            next++;

        }

        ArrayList<Long> arrayList = new ArrayList<>(hashSet);
        // HashSet을 리스트나 array로 바꾼다음 오름차순으로 정렬해서 출력한다.

        arrayList.sort(Comparator.naturalOrder());

        // 9! = 36만
        // 10! = 360만

        long answer = arrayList.get(n-1);
        return answer;
    }

    public static long factorial(long n) {

        if(n <= 1) {
            return n;
        }else {
            return factorial(n-1) * n;

        }

    }
    // 메모이제이션을 적용한 factorial 함수

    public static long factorialMemoization(long number){

        if(map.containsKey(number)){
            return (long) map.get(number);
        }else{

            if(number>0){
                long temp = number*factorial(number-1);
                map.put(number, temp);
                return temp;
            }else{
                return 1;
            }
        }
    }

}
