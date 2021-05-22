// 문제 : https://programmers.co.kr/learn/courses/30/lessons/12903?language=java

public class practice_1_my_answer {
//
//    가운데 글자 가져오기
//    문제 설명
//    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//
//    재한사항
//    s는 길이가 1 이상, 100이하인 스트링입니다.
//    입출력 예
//    s	return
//    abcde	c


    public String solution(String s) {

        String answer = "";

        // 글자 길이가 짝수인경우
        if(s.length() % 2 == 0) {
            int index = s.length()/2 - 1 ;
            answer = s.substring(index,index+2);
        }
        // 글자 길이가 홀수인경우
        else {
            int index = s.length()/2 ;
            answer = s.substring(index,index+1);
        }


        return answer;
    }

}
