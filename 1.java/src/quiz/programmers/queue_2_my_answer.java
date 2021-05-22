import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class queue_2_my_answer {

//    주식가격
//    문제 설명
//    초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
//
//    제한사항
//    prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
//    prices의 길이는 2 이상 100,000 이하입니다.
//    입출력 예
//    prices	return
//    [1, 2, 3, 2, 3]	[4, 3, 1, 1, 0]
//    입출력 예 설명
//    1초 시점의 ₩1은 끝까지 가격이 떨어지지 않았습니다.
//    2초 시점의 ₩2은 끝까지 가격이 떨어지지 않았습니다.
//    3초 시점의 ₩3은 1초뒤에 가격이 떨어집니다. 따라서 1초간 가격이 떨어지지 않은 것으로 봅니다.
//    4초 시점의 ₩2은 1초간 가격이 떨어지지 않았습니다.
//    5초 시점의 ₩3은 0초간 가격이 떨어지지 않았습니다.
//    ※ 공지 - 2019년 2월 28일 지문이 리뉴얼되었습니다.

    public static void main(String args[]) {


        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(prices));

        int[] answers = solution(prices);
        System.out.println(Arrays.toString(answers));
    }

    public static int[] solution(int[] prices) {

        // 큐 생성
        Queue queue = new LinkedList<>();

        // 정답 생성
        ArrayList<Integer> list = new ArrayList<>();

        // 큐로 데이터 넣기
        for(int price : prices) {
            queue.offer(price);
        }

        for(int i = 0 ; i < prices.length ; i++) {
            int peek = prices[i];

            System.out.println("peek : " + String.valueOf(peek));
            int count = 0;
            int k = i;

            // 마지막
            if(k == prices.length -1) {
                list.add(0);
                break;
            }

            // 처음부터 마지막 전까지
            while (peek <= prices[k+1]) {
                k++;
                count++;
                if(k == prices.length-1) {
                    break;
                }
            }

            list.add(count);
        }

        int[] answer = list.stream().mapToInt(i -> i.intValue()).toArray();
        return answer;
    }


}
