// 주소 : https://programmers.co.kr/learn/courses/30/lessons/42747?language=java

//H-Index
//        문제 설명
//        H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.
//
//        어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h가 이 과학자의 H-Index입니다.
//
//        어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.
//
//        제한사항
//        과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
//        논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
//        입출력 예
//        citations	return
//        [3, 0, 6, 1, 5]	3
//        입출력 예 설명
//        이 과학자가 발표한 논문의 수는 5편이고, 그중 3편의 논문은 3회 이상 인용되었습니다. 그리고 나머지 2편의 논문은 3회 이하 인용되었기 때문에 이 과학자의 H-Index는 3입니다.

import java.util.Arrays;
import java.util.HashMap;

public class hash_4_my_answer {

    public static int solution(int[] citations) {

        int answer = 0;

        // 맵을 만든다
        HashMap<String, Integer> map = new HashMap<>();

        // 논문별 인용횟수가 동일한것에 대한 개수를 저장한다.
        for(int hindex : citations) {
            String key = String.valueOf(hindex);
            // 논문별 인용횟수
            if(!map.containsKey(key)) {
                map.put(key, 1);
            }
            else {
                map.put(key, map.get(key) + 1);
            }

        }

        // 배열을 정렬한다.
        Arrays.sort(citations);

        // 배열의 최소값과 최대값을 받는다.
        int min = citations[0];
        int max = citations[citations.length-1];

        System.out.println(String.valueOf(max));
        System.out.println(String.valueOf(min));

        int sum = 0;

        /**
         * 해결
         * 배열이나 리스트가 주어졌을때,
         * 1. 특정 숫자 이상의 값이 특정 숫자이상 있는지 확인한다.
         * 2. 나머지 숫자가 특정 숫자 보다 같거나 밑이여야한다.
         *
         * */

        // [3, 0, 6, 1, 5]	3
        // [0, 1, 3, 5, 6]

        // 배열의 최소값부터 최대값까지 hindex를 찾는다
        // sum 값이 min보다 같거나 작아야함
        for(int hindex = min ; hindex <= max  ; hindex++) {

            // key값이 존재한다면
            if(map.containsKey(String.valueOf(hindex))) {

                // 조건충족실패
                if( hindex < sum) {
                    // pass
                    sum = sum + map.get(String.valueOf(hindex));
                }
                // 조건충족
                else {
                    // 나머지 배열의 length값이 i보다 크거나 같으면됨
                    if(hindex >= citations.length - sum) {
                        answer = hindex;
                        return answer;
                    }
                }


            }

            // key값 없으면 pass

        }

        return answer;


    }

}
