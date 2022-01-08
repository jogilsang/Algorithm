class Solution {
    public char findTheDifference(String s, String t) {
        char DUMMY = Character.MAX_VALUE; 
        // TestCase
        // (1) "abcd", "abcde" -> e
        // (2) "aa", "a" -> a
        // (3) "","a" -> a
        
        // Solution
        // 1. HashMap1을 만든다
        // 2. s의 item을 넣으면서 Count를 증가시킨다.
        // 3. HashMap2을 만든다
        // 4. t의 item을 HashMap1에 없으면, return
        //              HashMap1에 있으면 HashMap2에 넣었을떄 값보다
        //              크면 return, 크지않으면 count를 증가시킨다.
 
        Map<Character, Integer> s_map = new HashMap<>();
        Map<Character, Integer> t_map = new HashMap<>();
        
        for(char key : s.toCharArray()){
            s_map.put(key , s_map.getOrDefault(key,0)+1);
        }
        for(char key : t.toCharArray()){
            if(!s_map.containsKey(key)) {
                return key;
            }
            else{
                int value_s = s_map.get(key).intValue();
                int value_t = t_map.getOrDefault(key,0) + 1;
                if(value_t > value_s) {
                    return key;
                }
                else {
                    t_map.put(key, value_t);
                }
            }
            
        }
        
        return DUMMY;
            
    }
}






















