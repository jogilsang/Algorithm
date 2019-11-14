import java.util.*;

class Solution {
    int func_a(int[] scores, int score){
        int length = scores.length;
        for(int rank = 0; rank < length; rank++)
            if(scores[rank] == score)
                return rank + 1;
        return 0;
    }
    
    void func_b(int[] arr){
        Arrays.sort(arr);
        int length = arr.length;
        int temp = 0;
        for(int i = 0; i < length / 2; i++){
            temp = arr[i];
            arr[i] = arr[(length - 1) - i];
            arr[(length - 1) - i] = temp;
        }
    }
    
    int func_c(int[] arr, int n){
        return arr[n];
    }
    public int solution(int[] scores, int n) {
        int s = func_c(scores, n);
        func_b(scores);
        int answer = func_a(scores, s);
        return answer;
    }
}