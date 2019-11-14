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
        int countThree = func_c(arr);
        int countFive = func_a(arr);
        String answer = func_b(countThree, countFive);
        return answer;
    }
}