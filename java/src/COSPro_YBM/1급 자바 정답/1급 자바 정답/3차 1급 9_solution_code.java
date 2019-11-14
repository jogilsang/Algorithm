class Solution {
    public int solution(int[] revenue, int k) {
        int answer = 0;
        int n = revenue.length;
        int sum = 0;
        for (int i=0; i<k; i++) {
            sum += revenue[i];
        }
        answer = sum;
        for (int i=k; i<n; i++) {
            sum = sum - revenue[i-k] + revenue[i];
            if (answer < sum) {
                answer = sum;
            }
        }
        return answer;
    }
}