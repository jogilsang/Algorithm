class Solution {
    public boolean isSubsequence(String s, String t) {
        // case
        // s="", t=""
        // solution
        // s의 첫번째 글자가 발견되는 index 이후 index를 탐색한다
        // 1. 하나라도 없다면 종료, false를 리턴
        // 2. size가 작아도 종료
        
        if(s.length() == 0) return true;
        if(s.length() == 0 && t.length() == 0) return true;
        if(t.length() == 0 || s.length() > t.length()) return false;
        
        int fromIndex = 0;
        
        for(int i = 0 ; i < s.toCharArray().length ; i++){
            char c = s.charAt(i);
            int index = t.indexOf(c,fromIndex);
            if(index == -1) return false;
            
            fromIndex = index+1;
            
        }
        
        return true;
    }
}