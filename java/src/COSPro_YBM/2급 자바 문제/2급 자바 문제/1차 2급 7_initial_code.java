class Solution {
    public int solution(int[] scores) {
        int count = 0;
        for (int i = 0; i < scores.length; i++)
            if (650 <= scores[i] || scores[i] < 800) 
                count += 1;
        return count;
    }

    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] scores = {650, 722, 914, 558, 714, 803, 650, 679, 669, 800};
        int ret = sol.solution(scores);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}