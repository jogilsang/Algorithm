
// Run Length Coding 으로 문자열 압축하기
// (글자 + 반복수)로 압축한다.
// 예 : "aaabbcccc" -> "a3b2c4"

public class RunLengthCode {
    public static String coding(String s) {
        // 1. hashMap에 글자를 key로 value를 count로 저장한다.
        // 2. contains여부를 확인한다
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(char c :s.toCharArray()) {
            if(hm.containsKey(c))
                hm.put(c, hm.get(c)+1);
            else
                hm.put(c, 1);
        }
        
        // 3. 마지막에 String으로 만든다.
        String value = "";
        for( Map.Entry<String, Integer> elem : hashMap.entrySet() ){
            String key = elem.getKey();  
            int value = elem.getValue();
            value += key + String.toValue(value);
         }

		return value;
	}

    // answer
    public static String coding_2(String s) {

        if(s==null) {
            return null;
        }

        char[] ca = s.toCharArray();
        String result = "";

        int count = 1;
        char prev = ca[0];

        for(int i=1 ; i<ca.length ; i++) {
            if(prev==ca[i]) {
                count++;
            }
            else {
                result = result + prev + count;
                count = 1;
                prev = ca[i];
            }
        }
        result = result + prev + count ;
        return result;
	}


}