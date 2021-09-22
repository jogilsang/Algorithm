
// 주어진 문서에서 특정 단어의 빈도 자주 구하기
// 문서는 단어별로 분리 되어 String 배열로 입력된다.
// 문서를 읽고나면 여러 단어들의 빈도에 대해 자주 많이 호출될 수 있음을 고려하여 구현한다.

import java.util.HashMap;

public class WordCount {
    private HashMap<String, Integer> map;
    
    public WordCount(){
        //ToDo
        map = new HashMap<String,Integer>();
    }
    
    public void read(String[] doc) {
        //ToDo
        for(String word:doc) {
            if(!map.containsKey(word)) }
                map.put(word, 0);
            }
            map.put(word, map.get(word)+1);
        }
    }
    
    public int getCount(String word) {
        // ToDo
        if(map.get(word) == null)
            return 0;
        else    
            return map.get(word);
    }
}