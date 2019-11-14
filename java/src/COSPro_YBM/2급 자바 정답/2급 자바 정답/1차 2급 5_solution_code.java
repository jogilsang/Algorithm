class Solution {
    public int[] solution(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left += 1;
            right -= 1;
        }
        return arr;
    }
}