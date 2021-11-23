class Solution {
    public int lengthOfLastWord(String s) {
        
        // solution 1
        // 정규표현식 적용 -> 공백문자들을 공백 한개로 변경
        // split 적용해서 다 쪼개기
        // 마지막거를 return
        
        // solution 2
        // 뒤에서 부터 search를 하는대 공백이 아닌문자에서 공백이 아닌문자까지
        
        s=s.trim();
        if(s.equals(" ") || s.equals("")) return 0;
        if(s.length() == 1) return 1;
        
        char[] arr = s.toCharArray();
        int startIndex = 0;
        boolean isFinedLastIndex = false;
        String answer = "";
        
        for(int i = arr.length-1 ; i >= 0 ; i--) {
            char ch = arr[i];
            if(ch == ' ') {
                startIndex = i+1;
                answer = s.substring(startIndex, arr.length);
                return answer.length();
            }
        }
        answer = s.substring(0, arr.length);
        return answer.length();
        
    }
}