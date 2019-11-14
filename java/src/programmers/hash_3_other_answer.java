import java.util.HashMap;
import java.util.Iterator;

public class hash_3_other_answer {

    //    예를 들어 머리부분 3개고, 눈부분 2개면요 -> ([머리] 입을 수 있는 경우 3가지 + 아무것도 안 입는 경우 1가지) * ([눈] 입을 수 있는 경우 2가지 + 아무것도 안 입는 경우 1가지) 이렇게 계산이 되는데, 문제에서 적어도 무언가는 하나는 써야 한다고 했으니 모든 부분에 아무것도 안 입는 경우 1가지를 제외하는 겁니다.
    public int hash_3_solution_other_answer(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            String key = clothes[i][1];
            if(!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        Iterator<Integer> it = map.values().iterator();
        while(it.hasNext()) {
            answer *= it.next().intValue()+1;
        }
        return answer-1;

    }
}
