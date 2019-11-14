//문제 설명
//        보조 배터리 n개를 구입하려면 최소 얼마가 필요한지 구하려 합니다.
//        보조 배터리 제조사로부터 다양한 제품들에 대한 견적을 받았고, 그 견적에는 '판매 단위'와 '단위 가격'(판매 단위만큼 구입할 때의 가격)이 적혀있습니다.
//
//        예를 들어 판매 단위가 4이고, 단위 가격이 35,000원인 제품이 있습니다. 이 배터리는 4의 배수 개(4개, 8개, 12개...등)씩 주문해야 하며,
//        3세트(12개)를 주문하면 105,000원을 내야 합니다.
//
//        구입할 배터리 수 n, 보조 배터리 제조사가 보내온 견적이 담긴 배열 battery가 매개변수로 주어질 때,
//        배터리를 n개 이상 구매하기 위해서 필요한 최소 비용을 return 하도록 solution함수를 완성해주세요.
//
//        제한사항
//        n은 10,000 이하인 자연수 입니다.
//        battery의 길이는 1이상 10,000 이하입니다.
//        battery의 원소는 [판매 단위, 단위 가격]을 나타냅니다.
//        판매 단위는 10,000이하인 자연수 입니다.
//        단위 가격은 200,000이하인 자연수 입니다.
//        입출력 예
//        n	battery	result
//        50	[[10,100000],[4,35000],[1,15000]]	450000
//        20	[[6,30000],[3,18000],[4,28000],[1,9500]]	108000
//        입출력 예 설명
//        입출력 예 #1
//        2번 제품을 12세트 주문하여 배터리 4 x 12 = 48개를 35,000 x 12 = 420,000원에 삽니다.
//        그리고 3번 제품을 2세트 주문하여 배터리 1 x 2 = 2개를 15,000 x 2 = 30,000원에 삽니다.
//        배터리 50개를 450,000에 구입했으며 이 때가 비용을 가장 적게 쓰는 경우입니다.
//
//        입출력 예 #2
//        1번 제품을 3세트를 주문하여 배터리 3 x 6 = 18개를 3 x 30,000 = 90,000원에 삽니다.
//        그리고 2번 제품을 1세트 주문하여 배터리 1 x 3 = 3개를 1 x 18,000 = 18,000원에 삽니다.
//        배터리 21개를 108,000원에 구입했으며 이 때가 비용을 가장 적게 쓰는 경우입니다. 20개가 필요하므로, 그 이상 주문하여도 상관 없습니다.

import java.util.ArrayList;
import java.util.Collections;

public class netmarble_7 {

    public static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        int n = 20;
        System.out.print(n);
        System.out.print("\n");
        int[][] battery = {{6,30000},{3,18000},{4,28000},{1,9500}};
        for(int[] value : battery) {
            System.out.print(value.toString() + " ");

        }
        System.out.print("\n");

        int answer = solution(n, battery);

        System.out.print(answer);
    }

    public static int solution(int n, int[][] battery) {

        // 답변 = 0
        int answer = 0;
        
        // 최소가격을 찾는다
        // para 1 : 단위수
        // para 2 : 개수 0원
        // para 3 : 가격 0원
        // para 4 : 특정 배터리에 대한 정보
        // para 5 : 배터리에 대한 index (size를 넘기면안됨)
        // para 6 : 배터리에 대한 정보

        getMinPrice(n, 0,0, 0, battery);

        Collections.sort(list);

        if(list.size() != 0) {
            answer = list.get(0);
        }

        return answer;
    }

    // 기저조건
    // n이 50이면, price를 리스트에 저장하고 끝내기
    // 계산직전 : 가격

    public static void getMinPrice(int n, int count, int price, int index, int[][] battery) {

        // 배열은 사이즈 이상의 index를 가질수없으므로 return
        if (index >= battery.length) {
            return;
        }

        // n 입력값이 n보다 큰 경우
        if (count >= n) {

            // 최종 가격 더해주기
            list.add(price);

        } else {
            // 기준단위
            int temp_size = battery[index][0];
            // 기준가격
            int temp_price = battery[index][1];

            // 총단위
            int maxSize = 0;
            // 총합가격
            int sum = 0;

            // 기준단위가 총 개수 이하일때만
            while (maxSize < n) {
                sum = sum + temp_price;
                maxSize = maxSize + temp_size;
                getMinPrice(n, maxSize+count, price + sum, index + 1, battery);

            }

        }

    }


}

