import java.util.ArrayList;

public class practice_level1_2_myanswer {

// 카펫 문제 : https://programmers.co.kr/learn/courses/30/lessons/42842

/**
 *
 * */

//    카펫
//    문제 설명
//    Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 빨간색으로 칠해져 있고 모서리는 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.
//
//    Leo는 집으로 돌아와서 아까 본 카펫의 빨간색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.
//
//    Leo가 본 카펫에서 갈색 격자의 수 brown, 빨간색 격자의 수 red가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아
//    return 하도록 solution 함수를 작성해주세요.
//
//    제한사항
//    갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
//    빨간색 격자의 수 red는 1 이상 2,000,000 이하인 자연수입니다.
//    카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
//    입출력 예
//    brown	red	return
//    10	2	[4, 3]
//    8	1	[3, 3]
//    24	24	[8, 6]
//    출처

// 문제해결
// 빨강타일을 받아서, 공약수 2차원 배열로 바꾼다 x와 y를 더한다음 x2 +4와 일치하는 브라운을 찾는다 그 다음 x+2, y+2를 리턴한다


    public int[] solution(int brown, int red) {

        int[] commonDivisor = getCommonDivisorArray(red);


        int[] answer = {};
        return answer;
    }


    public int[] getCommonDivisorArray(int target) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int row = 1 ; row <= target ; row ++) {

            // 공약수 발견
            if(target % row == 0) {
                arrayList.add(row);
            }
        }

        return arrayList.stream().mapToInt(i->i.intValue()).toArray();

    }

}




































