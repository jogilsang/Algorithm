

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// 문제 : https://programmers.co.kr/learn/courses/30/lessons/42862?language=java

//체육복
//        문제 설명
//        점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다. 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
//
//        전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
//
//        제한사항
//        전체 학생의 수는 2명 이상 30명 이하입니다.
//        체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
//        여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
//        여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
//        여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
//        입출력 예
//        n	lost	reserve	return
//        5	[2, 4]	[1, 3, 5]	5
//        5	[2, 4]	[3]	4
//        3	[3]	[1]	2
//        입출력 예 설명
//        예제 #1
//        1번 학생이 2번 학생에게 체육복을 빌려주고, 3번 학생이나 5번 학생이 4번 학생에게 체육복을 빌려주면 학생 5명이 체육수업을 들을 수 있습니다.
//
//        예제 #2
//        3번 학생이 2번 학생이나 4번 학생에게 체육복을 빌려주면 학생 4명이 체육수업을 들을 수 있습니다.
//
//        출처
//
//        ※ 공지 - 2019년 2월 18일 지문이 리뉴얼되었습니다.
//        ※ 공지 - 2019년 2월 27일, 28일 테스트케이스가 추가되었습니다.

public class greed_1_my_answer {

    // n : 전체학생수
    // answer : 체육복 입은학생수
    // lost : 체육복 잃어버린애들
    // reserve : 여벌옷 하나 더있는애들. 애내가 잃어버렸을수도있음

    public int solution(int n, int[] lost, int[] reserve) {

        // 문제풀이
        // 1. 여벌옷 있는대, 옷을 잃어버린애들은 배열에서 제거하기. 이 애들은 결과에 영향을 주지않음

        // 2. 옷 잃어버린애들을 전체인원수에서 뺀다음 결과값(옷 입을수있는애들)에 더해주기
        //    여벌을 가지고있든, 한벌을 가지고있든 옷을 잃어버리지않았으면 결과적으로 옷을 입을수있음

        // 3. 옷 잃어버린애들이 여벌옷을 받아서 입을수있는 애들을 모아서, 결과값(옷 입을수있는애들)에 더해주기

        // 4. 결과값 리턴하기

        int answer = 0;

        // 문제풀이 1번 : 두 배열간 중복되는 값 제거
        int[] lost_deldupe = delDupes_AFromB(lost, reserve);
        int[] reserve_deldupe = delDupes_AFromB(reserve, lost);

        // 문제풀이 2번 : 결과적으로 옷을 입을수있는 애들 계산해서 더해주기
        int people_lost = n - lost_deldupe.length;
        answer = answer + people_lost;


        // 문제풀이 3번
        // 여벌옷 받아서 입는 애들 배열 하나만들기
        ArrayList<Integer> arrayList = new ArrayList<>();

        // 옷 잃어버린 애들 체크를 위한 Set 만들기
        HashSet<Integer> hashSet = new HashSet<>();

        for(int lost_people : lost_deldupe) {
            hashSet.add(lost_people);
        }


        // reserve의 값 +1,-1 에 대해서
        // lost에 있는지 찾기
        // 1순위 : -1
        // 2순위 : +1
        // 있으면 옷입는애들 배열에 넣고, lost에서제거하기
        // 옷 준애 reserve에서 제거하기
        // reserve 다 순회하면 끝
        // 옷입는애들 배열 length를 answer에 더해주기

        for(int i =0 ; i < reserve_deldupe.length ; i++) {
            int front = reserve_deldupe[i] - 1;
            if(hashSet.contains(front)) {
                arrayList.add(front);
                hashSet.remove(front);
            }
            else {

                int back = reserve_deldupe[i] + 1;

                if(hashSet.contains(back)) {
                    arrayList.add(back);
                    hashSet.remove(back);
                }

            }
        }

        // 여벌옷 받은애들 더해주기
        answer = answer + arrayList.size();

        // 문제풀이 4번
        return answer;
    }



    // lost와 reserve에서 계산해서 더해주기

    // 두 배열간에 중복값을 찾아서 리턴해준다.
    public int[] findDupes(int[] a, int[] b) {

        HashSet<Integer> map = new HashSet<Integer>();
        HashSet<Integer> answer = new HashSet<Integer>();

        for (int i : a)
            map.add(i);
        for (int i : b) {
            if (map.contains(i)) {
                answer.add(i);
            }
            // found duplicate!
        }

        // 배열 생성
        int[] array = new int[answer.size()];

        // 반복자 생성
        Iterator value = map.iterator();

        // 초기인덱스
        int i = 0;

        // 반복자 실행
        while(value.hasNext()) {
            array[i++] = (int)value.next();
        }

        // 배열 리턴
        return array;
    }

    // 두 배열간에 중복값을 제거해서, 리턴해준다.
    public int[] delDupes_AFromB(int[] a, int[] b) {

        HashSet<Integer> map = new HashSet<Integer>();

        // 중복값이 담김
        HashSet<Integer> store = new HashSet<Integer>();

        // 정수형 배열리스트 생성
        ArrayList<Integer> answers = new ArrayList<>();

        for (int i : a)
            map.add(i);
        for (int i : b) {
            if (map.contains(i)) {
                store.add(i);
            }
            // found duplicate!
        }

        for(int i : a) {
            // 중복안된다면 넣기
            if(!store.contains(i)) {
                answers.add(i);
            }
        }

        // 배열 생성
        int[] array = new int[answers.size()];

        int i = 0;
        for(int answer : answers) {
            array[i++] = answer;
        }

        // 배열 리턴
        return array;
    }

}
