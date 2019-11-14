class Solution {
    public int func_a(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; ++i)
            if (arr[i] % 5 == 0)
                count += 1;
        return count;
    }
    public String func_b(int three, int five){
        if (three > five)
            return "three";
        else if (three < five)
            return "five";
        else
            return "same";
    }
    
    public int func_c(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; ++i)
            if (arr[i] % 3 == 0)
                count += 1;
        return count;
    }

    public String solution(int[] arr) {
        int countThree = func_@@@(@@@);
        int countFive = func_@@@(@@@);
        String answer = func_@@@(@@@);
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {2, 3, 6, 9, 12, 15, 10, 20, 22, 25};
        String ret = sol.solution(arr);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}