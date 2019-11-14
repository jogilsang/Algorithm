class Solution {
    public int solution(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            int current = i;
            int temp = count;
            while (current != 0) {
                if (@@@){
                    count++;
                    System.out.print("pair");
                }
                current /= 10;
            }
            if(temp == count)
                System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        return count;
    }

   // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int number = 40;
        int ret = sol.solution(number);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}