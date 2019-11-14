class Solution {
    public int solution(int[] timeTable, int n) {
        int answer = 0;

        int[] arr = new int[n];

        for(int i = 0; i < timeTable.length; i++)
        	arr[i % n] += timeTable[i];

        for(int i = 0; i < n; i++)
        	answer = answer > arr[i] ? answer : arr[i];
        
        return answer;
    }
}