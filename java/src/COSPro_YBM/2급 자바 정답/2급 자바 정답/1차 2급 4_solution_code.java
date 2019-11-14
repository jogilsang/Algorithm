class Solution {
    int[] func_a(int[] arr){
        int[] counter = new int[1001];
        for(int i = 0; i < arr.length; ++i)
            counter[arr[i]]++;
        return counter;
    }
    
    int func_b(int[] arr){
        int ret = 0;
        for(int i = 0; i < arr.length; ++i){
            if(ret < arr[i])
                ret = arr[i];
        }
        return ret;
    }
    
    int func_c(int[] arr){
        int ret = 1001;
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] != 0 && ret > arr[i])
                ret = arr[i];
        }
        return ret;
    }
    public int solution(int[] arr) {
        int[] counter = func_a(arr);
        int max_cnt = func_b(counter);
        int min_cnt = func_c(counter);
        return max_cnt / min_cnt;
    }
}