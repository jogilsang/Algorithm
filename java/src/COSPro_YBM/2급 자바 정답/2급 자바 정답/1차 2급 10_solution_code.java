class Solution {
    public int solution(int[] data) {
        double total = 0;
        int len = data.length;
        for(int i = 0; i < len; ++i)
            total += data[i];
        int cnt = 0;
        double average = (double)total / (double)len;
        for(int i = 0; i < len; ++i)
            if (data[i] <= average)
                cnt += 1;
        return cnt;
    }
}