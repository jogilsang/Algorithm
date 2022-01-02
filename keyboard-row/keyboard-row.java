// Solution 1 :
// HashMap에 alphabet을 key로, row를 value로 넣음
// 반복문을 돌려서 value가 달라지면 fail
//               value가 같으면 success

class Solution {
    public String[] findWords(String[] words) {

        ArrayList<String> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        String row1 = "qwertyuiopQWERTYUIIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";
        
        for(char r1 : row1.toCharArray()){
            map.put(String.valueOf(r1), 1);
        }
        for(char r2 : row2.toCharArray()){
            map.put(String.valueOf(r2), 2);
        }
        for(char r3 : row3.toCharArray()){
            map.put(String.valueOf(r3), 3);
        }
        
        for(String str : words) {
            int temp = 0;
            boolean isOneRowConsisted = true;
            for(char target : str.toCharArray()) {
                String key = String.valueOf(target);
                int value = map.getOrDefault(key, -1);
                if (temp == 0) temp = value;
                if(temp != value) {
                    isOneRowConsisted = false;
                    break;
                }
            }
            if(isOneRowConsisted) answer.add(str);
        }
        

        return answer.toArray(new String[answer.size()]);
        
        
    }
}

















