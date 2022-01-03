class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // Solution1 :
        // 1. 대 소문자 구분
        // 2. stones의 글자가 jewels의 포함되면, 보석이다
        int count = 0;
        for(char stone : stones.toCharArray()){
            if(jewels.contains(String.valueOf(stone))) count++;
        }
        return count;
        
    }
}