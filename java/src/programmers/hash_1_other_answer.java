import java.util.Arrays;
import java.util.HashMap;

// // 문제 : https://programmers.co.kr/learn/courses/30/lessons/42577?language=java

public class hash_1_other_answer {
    public String solution(String[] participant, String[] completion) {

        // 정답변수 선언
        String answer = "";

        // 해시맵 선언
        HashMap<String, Integer> hm = new HashMap<>();

        // 참여자들
        for(String Player : participant){

            // 사용자 이름(key)을 넣을때마다 1을 더해줌
            // 중복처리가능
            hm.put(Player, hm.getOrDefault(Player, 0) + 1);
        }

        // 완료자들
        for(String Player : completion){

            // 사용자 이름(key)가 겹칠때마다 1을 빼줌
            hm.put(Player, hm.get(Player)-1);
        }

        // 사용자 이름비교
        for(String key : hm.keySet()) {
            // 사용자 이름이 겹치지않는 단 하나의 key는 value가 0임
            if(hm.get(key) != 0) {
              answer = key;
            }
        }

        return answer;
    }
}