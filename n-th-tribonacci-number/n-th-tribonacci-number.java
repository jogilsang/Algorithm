class Solution {
    
    HashMap<Integer,Integer> map = new HashMap<>();
    
    public int tribonacci(int n) {
        
        if(n==0) return 0 ;
        if(n==1 || n==2) return 1 ;
        
        int value = map.getOrDefault(n,0);
        if(value==0) {
            int tribonacci_1 = tribonacci(n-1);
            int tribonacci_2 = tribonacci(n-2);
            int tribonacci_3 = tribonacci(n-3);
            map.put(n-1,tribonacci_1);
            map.put(n-2,tribonacci_2);
            map.put(n-3,tribonacci_3);
            return tribonacci_1 + tribonacci_2 + tribonacci_3;
            
        }else {
            return value;
        }
    }
}