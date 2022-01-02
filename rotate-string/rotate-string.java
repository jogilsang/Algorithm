class Solution {
    public boolean rotateString(String s, String goal) {
        // shift횟수 : length() - 1
        
        boolean isMatched = false;
        String target = s;
        
        int count = s.length() - 1;
        while(count != 0){
            target = target.substring(1, s.length()) + target.charAt(0);
            if(target.equals(goal)) return true;
            count--;
        }
        
        return false;
    }
}