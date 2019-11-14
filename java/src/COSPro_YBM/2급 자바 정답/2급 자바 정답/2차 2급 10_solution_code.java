class Solution {
    public int solution(int[] purchase) {
        int total = 0;
        for(int i = 0; i < purchase.length; ++i){
            if(purchase[i] >= 1000000)
                total += 50000;
            else if(purchase[i] >= 600000)
                total += 30000;
            else if(purchase[i] >= 400000)
                total += 20000;
            else if(purchase[i] >= 200000)
                total += 10000;
        }
        return total;
    }
}