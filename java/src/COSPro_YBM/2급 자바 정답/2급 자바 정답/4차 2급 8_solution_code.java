class Solution {
    public int solution(int n, int[] votes) {
        int answer = 0;
        int candidate = votes[0];
        int count = 1;
        for (int i = 1; i < votes.length; i++) {
            if (candidate == votes[i]) {
                count++;
            }
            else {
                count--;
            }
            if (count == 0) {
                candidate = votes[i];
                count = 1;
            }
        }

        int test_count = 0;
        for (int i = 0; i < votes.length; i++) {
            if (votes[i] == candidate) {
                ++test_count;
            }
        }

        if (test_count > votes.length/2) {
            answer = candidate;
        } else {
            answer = -1;
        }

        return answer;
    }
}