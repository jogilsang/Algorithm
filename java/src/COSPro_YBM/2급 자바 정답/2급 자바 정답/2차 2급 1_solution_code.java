class Solution {
    final int max_product_number = 10;
    
    public int[] func_a(int[] arr){
        int[] counter = new int[max_product_number + 1];
        for(int i = 0; i < arr.length; i++)
            counter[arr[i]] += 1;
        return counter;
    }
    
    public int solution(int[] left_gloves, int[] right_gloves) {
        int[] left_counter = func_a(left_gloves);
        int[] right_counter = func_a(right_gloves);
        int total = 0;
        for(int i = 1; i <= max_product_number; i++)
            total += Math.min(left_counter[i], right_counter[i]);
        return total;
    }
}
