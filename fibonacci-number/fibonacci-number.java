class Solution {
    
    HashMap<Integer,Integer> map = new HashMap<>();
    
    public int fib(int n) {
        
        // 기저조건
        // n == 0, n== 1
        if(n==1) return 1;
        if(n==0) return 0;
        
        int value = map.getOrDefault(n,0).intValue();
        if(value == 0) {
            int fib1 = fib(n-1);
            int fib2 = fib(n-2);
            map.put(n-1, fib1);
            map.put(n-2, fib2);
            
            return fib1 + fib2;
            
        }else {
            return value;
        }
        
    }
}