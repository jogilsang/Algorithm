

//문제 설명
//        코딩 오디션 프로그램에 해커가 침투하여 일부 참가자의 점수를 조작하였습니다. 조사관으로 투입된 당신은, 해커가 조작한 점수에 어떤 패턴이 남은 것을 발견하였고, 아래와 같은 패턴을 띄는 조작된 점수를 제거하기로 하였습니다.
//
//        인접된 등수 사이의 점수차가 k번이상 반복되어 나온다면, 해당하는 인접된 등수는 모두 조작된 점수입니다.
//        이 때, 조작되지 않은 점수는 몇 개인지 구하려 합니다.
//        조작의 기준인 반복 횟수 k, 내림차순으로 정렬된 점수가 담긴 배열 score가 매개변수로 주어집니다. 이때, 조작되지 않은 점수의 개수를 return 하도록 solution 함수를 완성해주세요.
//
//        제한사항
//        k는 2이상 100,000이하인 정수입니다.
//        score는 길이가 1이상 500,000이하인 1차원 배열입니다.
//        score를 구성하는 원소는 0이상 2,000,000,000이하인 정수입니다.
//        score를 구성하는 원소는 내림차순으로 정렬되어 주어집니다.
//        score를 구성하는 원소에는 중복된 값이 없습니다.
//        입출력 예
//        k	score	result
//        3	[24,22,20,10,5,3,2,1]	3
//        2	[1300000000,700000000,668239490,618239490,568239490,568239486,518239486,157658638,157658634,100000000,100]	4
//        입출력 설명
//        입출력 예#1
//
//        등수	점수	앞 등수와의 점수차
//        1등	24	-
//        2등	22	2
//        3등	20	2
//        4등	10	10
//        5등	5	5
//        6등	3	2
//        7등	2	1
//        8등	1	1
//        1-2등, 2-3등, 5-6등 사이의 점수차가 2이며, 3회 반복됩니다. k=3 이므로, 1등, 2등, 3등, 5등, 6등의 점수는 모두 제거합니다. 남은 점수는 4등, 7등, 8등의 점수이므로 3을 return 합니다.
//
//
//        입출력 예#2
//
//        등수	점수	앞 등수와의 점수차
//        1등	1300000000	-
//        2등	700000000	600000000
//        3등	668239490	31760510
//        4등	618239490	50000000
//        5등	568239490	50000000
//        6등	568239486	4
//        7등	518239486	50000000
//        8등	157658638	360580848
//        9등	157658634	4
//        10등	100000000	57658634
//        11등	100	99999900
//        3-4등, 4-5등, 6-7등 사이의 점수차가 50000000으로, 3회 반복됩니다. 또한 8-9등, 5-6등 사이의 점수차가 4로, 2회 반복됩니다. k=2 이므로, 3등, 4등, 5등, 6등, 7등, 8등, 9등이 제거되어야 합니다. 제거하고 남은 점수는 아래와 같습니다.
//
//        등수	점수	앞 등수와의 점수차
//        1등	1300000000	-
//        2등	700000000	600000000
//        10등	100000000	57658634
//        11등	100	99999900
//        제거하고 남은 점수들을 살펴보면,
//        1-2등의 점수차가 600000000, 2-10등의 점수차가 600000000 입니다.
//        하지만 10등의 앞 등수는 2등이 아니라 제거된 9등이므로, 점수차 57658634가 여전히 유지됩니다. 즉, 중간에 몇 개의 점수가 제거되어도, 처음 정해진 앞 등수와의 점수차가 변하지는 않습니다. 따라서 4개의 점수가 남으며, 4를 return 해주어야 합니다.

import java.util.HashMap;
import java.util.HashSet;

public class netmarble_4 {

//    인접된 점수 사이에 차이를
//    key로 해서. count를 올리자
//
//    그 다음 그거 다돌려서 k랑 일치하면
//    그 값에 대해서 다시 for 문을 돌려서 count하자

    public static void main(String[] args) {


    }

    public int solution(int k, int[] score) {
        int answer = 0;

        int global_interval = 0;

        // 이전항 정보
        int temp = 0;

        // default : 0
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int value : score) {
            if (temp == 0) {
                temp = value;
            }

            // 점수차이
            int interval = temp - value;
            temp = value;

            if (map.containsKey(interval)) {
                int someValue = map.get(interval);
                someValue = someValue + 1;
                map.put(interval, someValue);
            } else {
                map.put(interval, 0);
            }
        }



        // 방법 3
        for (Integer key : map.keySet()) {
            int value2 = map.get(key);
            if (value2 == k) {
                global_interval = key;
                break;
            }
        }

        // for문을 다시돌려서
        // global_interval과 일치하면
        // hashset에 추가하고 size 리턴하기

        temp = 0;
        for (int value : score) {
            if (temp == 0) {
                temp = value;
            }

            // 점수차이
            int interval = temp - value;


            if(interval == global_interval) {
                set.add(temp);
                set.add(value);
            }

            temp = value;

        }

        answer = set.size();

        return answer;
    }

}





































