class Solution {
    public int solution(int money, int[] chairs, int[] desks) {
        int answer = 0;

        for(int i = 0; i < chairs.length; i++) {
            for(int j = 0; j < desks.length; j++) {
                int price = chairs[i] + desks[j];
                if(answer < price && price <= money)
                    answer = price;
            }
        }

        return answer;
    }
}