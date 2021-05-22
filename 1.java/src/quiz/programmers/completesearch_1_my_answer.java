//모의고사
//        문제 설명
//        수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
//
//        1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//        2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//        3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//
//        1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
//
//        제한 조건
//        시험은 최대 10,000 문제로 구성되어있습니다.
//        문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
//        가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
//        입출력 예
//        answers	return
//        [1,2,3,4,5]	[1]
//        [1,3,2,4,2]	[1,2,3]
//        입출력 예 설명
//        입출력 예 #1
//
//        수포자 1은 모든 문제를 맞혔습니다.
//        수포자 2는 모든 문제를 틀렸습니다.
//        수포자 3은 모든 문제를 틀렸습니다.
//        따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.
//
//        입출력 예 #2
//
//        모든 사람이 2문제씩을 맞췄습니다.

// 문제 :  https://programmers.co.kr/learn/courses/30/lessons/42840

import java.util.ArrayList;

public class completesearch_1_my_answer {

// 문제해결
// 수포자 1,2,3은 정답을 찍는대 특정 유형이있음
// answers의 length 크기에 맞춰서 정답을 조합시키면됨
// 가장 많은 정답을 맞춘사람을 return 해주면됨
// 만약 동점자가 존재할경우 오름차순으로 정렬해서 return

    public int[] solution(int[] answers) {

//        수포자들의 배열을 만든다.
//        1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//                              1, 2, 3, 4, 5 를 반복한다.
//        2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//                              홀수번째는 2, 짝수번째는 2,4,6,8 ( 1,3,4,5 )
//        3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5,
//                              3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

        int size = answers.length;

        int person_1_point =0;
        int person_2_point =0;
        int person_3_point =0;

        int[] person_1 = new int[size];
        int[] person_2 = new int[size];
        int[] person_3 = new int[size];

        int[] person_1_answer = {5, 1, 2, 3, 4};
        int[] person_2_answer = {5, 2, 1, 2, 3, 2, 4, 2};
        int[] person_3_answer = {5, 3, 3, 1, 1, 2, 2, 4, 4, 5};

        // 수포자 1번
        int example_1 = 1;
        for (int i = 0; i < size; i++) {
            if (example_1 != 6) {
                person_1[i] = example_1++;
            } else {
                example_1 = 1;
                person_1[i] = example_1;
            }
        }

        // 수포자 2번
        int example_2 = 2;
        for (int i = 0; i < size; i++) {

            int order = i + 1;

            // 짝수면
            if (order % 2 == 0) {
                switch (order % 8) {
                    case 0:
                        person_2[i] = 5;
                        break;

                    case 2:
                        person_2[i] = 1;
                        break;

                    case 4:
                        person_2[i] = 3;
                        break;

                    case 6:
                        person_2[i] = 4;
                        break;

                }

            }
            // 홀수면
            else {
                person_2[i] = 2;
            }

        }

        // 수포자 3번
        for (int i = 0; i < size; i++) {

            int order = i + 1;
            int index = order % 10;
            person_3[i] = person_3_answer[index];
        }

        // 채점
        int i = 0;
        for(int answer : answers) {
            if(person_1[i] == answer) {
                person_1_point++;
            }
            if(person_2[i] == answer) {
                person_2_point++;
            }
            if(person_3[i] == answer) {
                person_3_point++;
            }
            i++;
        }

        int max = 0;

        if (person_1_point >= person_2_point && person_1_point >= person_3_point) {
            max = person_1_point;
        } else if (person_2_point >= person_1_point && person_2_point >= person_3_point) {
            max = person_2_point;
        } else {
            max = person_3_point;
        }
        System.out.println("가장 큰 수는 " + max + "입니다.");

        ArrayList<Integer> arrayList = new ArrayList<>();

        if(person_1_point == max) {
            arrayList.add(1);
        }

        if(person_2_point == max) {
            arrayList.add(2);
        }

        if(person_3_point == max) {
            arrayList.add(3);
        }

        int[] answer = new int[arrayList.size()];

        int p = 0;
        for(int value : arrayList) {
            answer[p++] = value;
        }

        return answer;
    }

}
