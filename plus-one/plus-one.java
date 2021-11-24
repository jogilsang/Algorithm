class Solution {
    public int[] plusOne(int[] digits) {
        // Integer.MAX_VALUE = 2,147,483,647
        // Integer.MIN_VALUE = -2,147,483,648
        
        // case
        // 1,2,3 -> 1,2,4
        // 1,2,9 -> 1,3,0
        // 9,9,9 -> 1,0,0,0
        // 0 -> 1
        // 9 -> 10
        
        // solution
        ArrayList<Integer> list = new ArrayList<>();
        digits[digits.length -1] = digits[digits.length -1] + 1;
        
        for(int i = digits.length -1 ; i >=0 ; i--) {
            int value = digits[i];
            if(value == 10) {
                list.add(0);
                if(i != 0) {
                   digits[i-1]=digits[i-1]+1;
                }
                else {
                   list.add(1); 
                }
            }else {
                list.add(value);
            }
        }
        
        Collections.reverse(list);
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        
        return arr;
    }
}









