import java.util.Arrays;
import java.util.HashMap;

// 문제 : https://programmers.co.kr/learn/courses/30/lessons/42577?language=java

//전화번호 목록
//        문제 설명
//        전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
//        전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
//
//        구조대 : 119
//        박준영 : 97 674 223
//        지영석 : 11 9552 4421
//        전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때,
//        어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
//
//        제한 사항
//        phone_book의 길이는 1 이상 1,000,000 이하입니다.
//        각 전화번호의 길이는 1 이상 20 이하입니다.
//        입출력 예제
//        phone_book	return
//        [119, 97674223, 1195524421]	false
//        [123,456,789]	true
//        [12,123,1235,567,88]	false
//        입출력 예 설명
//        입출력 예 #1
//        앞에서 설명한 예와 같습니다.
//
//        입출력 예 #2
//        한 번호가 다른 번호의 접두사인 경우가 없으므로, 답은 true입니다.
//
//        입출력 예 #3
//        첫 번째 전화번호, “12”가 두 번째 전화번호 “123”의 접두사입니다. 따라서 답은 false입니다.
//
//        알림
//
//        2019년 5월 13일, 테스트 케이스가 변경되었습니다. 이로 인해 이전에 통과하던 코드가 더 이상 통과하지 않을 수 있습니다.
//
//        출처

public class hash_2_my_answer {
    public boolean solution_hash_2_my_answer(String[] phone_book) {

        // 전화번호부의 번호중 접두사가 있으면 false
        // 전화번호부의 번호중 접두사가 없으면 true

        // 전수조사 할 필요없이, 접두사 있는게 하나라도 있으면 false 리턴하면됨

        // 배열을 글자순으로 정렬한다
        // contains 함수로 조회한다

        boolean answer = true;

        HashMap<String, Boolean> hm = new HashMap<>();

        // 정렬
        Arrays.sort(phone_book, String.CASE_INSENSITIVE_ORDER);

        for(int i = 0 ; i < phone_book.length - 1 ;   i++) {

            for( int j = i + 1 ; j < phone_book.length  ;  j++) {

                if(phone_book[j].contains(phone_book[i])) {
                     answer = false;
                     return answer;
                }

            }
        }

//        Best Answer
//        for(int i=0; i<phone_book.length-1; i++) {
//            for(int j=i+1; j<phone_book.length; j++) {
//                if(phone_book[i].startsWith(phone_book[j])) {return false;}
//                if(phone_book[j].startsWith(phone_book[i])) {return false;}
//            }
//        }

        return answer;
    }

}