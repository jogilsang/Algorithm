import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

class Solution {
    
    static int EXCEPTION_CODE = -1;
    
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Integer key : map.keySet()) {
            int answer = key.intValue();
            int value = map.get(key).intValue();
            if(value == 1) return answer;
        }
        return EXCEPTION_CODE;
    }
}