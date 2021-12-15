class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // numbers의 item이 target보다 크면 반복문 종료
        // numbers의 item과 target의 차이와 일치하면 return
        //                                 작으면 다음으로
        //                                 크면 반복문 종료
        for(int i = 0 ; i < numbers.length ; i++ ) {
            int pivot = numbers[i];
            int difference = target - pivot;
            for(int j = i+1 ; j < numbers.length ; j++) {
                int item = numbers[j];
                if(item == difference) return new int[]{i+1,j+1};
                if(item > difference) break;
            }
        }
        
        return new int[]{-1,-1};
        
    }
}