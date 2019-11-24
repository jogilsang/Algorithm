import java.util.ArrayList;

public class practice_level1_1_myanswer {

// TODO : 배열에 연속된 숫자들은 하나만 남기고 다 제거하는 코드
/**
 * 그냥 hashset에 넣으면 해결될문제
 *
 *
 * */

//    같은 숫자는 싫어
//    문제 설명
//    배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
//    이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
//    단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
//
//    예를 들면,
//    arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
//    arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
//    배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
//
//    제한사항
//    배열 arr의 크기 : 1,000,000 이하의 자연수
//    배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수

//    입출력 예
//    arr	answer
//    [1,1,3,3,0,1,1]	[1,3,0,1]
//    [4,4,4,3,3]	[4,3]
//    입출력 예 설명
//    입출력 예 #1,2
//    문제의 예시와 같습니다.

    // URL : https://programmers.co.kr/learn/courses/30/lessons/12906

    public int[] solution(int []arr) {

        // 문제풀이
        // array를 list로 변환한다
        // 초항부터 끝항까지 같은 숫자를 탐색한다.
        // 중간에 같은 숫자가 나오면 delete하며, 종료조건은 시작index와 검색하면서 증가하는 index의 끝항의 index인지 체크하는것
        // 결과를 return

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> answerList = new ArrayList<>();


        for(int value : arr) {
            arrayList.add(value);
        }

        int size = arrayList.size();


        for(int i = 0 ; i < size  ; i++) {

            // 기준값
            int pivot = arrayList.get(i);

            // 저장여부
            // Boolean saved = false;

            // 비교값
            for(int j = i +1 ; j < size ; j ++) {
                if(j >= size) {
                    break;
                }
                int compare = arrayList.get(j);

                if(pivot == compare) {
//                    if(saved == false) {
//                        answerList.add(pivot);
//                        saved = true;
//                    }
                    // 효율성 테스트 미통과
                     arrayList.remove(j);
                     j--;
                     size = arrayList.size();
                }
                else {
                    break;
                }
            }
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");

        int[] answer = arrayList.stream().mapToInt(i -> i.intValue()).toArray();
        return answer;
    }

}




































