class Solution {
    public int solution(String[] words, String word) {
        int count = 0;
        
        for(String comp : words) {
            for(int i = 0; i < comp.length(); i++) {
                if(comp.charAt(i) != word.charAt(i)) count++;
            }
        }
        return count;
    }
}