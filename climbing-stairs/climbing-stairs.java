// solution
// n=2 -> 1+1, 2
//        => 2
// n=3 -> 1+1+1, 1+2,2+1 
//        => 3
// n=4 -> 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2 
//        => 5
// n=5 -> 1+1+1+1+1 -> 1
//        1+1+1+2,  -> 4
//        1+2+2, 2+1+2, 2+2+1, -> 3
//        => 8
// step(n) = step(n-1) + step(n-2)
// 

class Solution {
    
    static HashMap<Integer, Integer> hm = new HashMap<>();
    
    public int climbStairs(int n) {
        return recursiveClimbStairs(n);
    }
    
    // 1 <= n <= 45
    public int recursiveClimbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        
        // memoization
        int value = hm.getOrDefault(n, 0).intValue();
        if(value == 0) {
            // 기존에 연산한건 저장한다.
            // 연산되어있으면 가져온다.
            value = recursiveClimbStairs(n-1) + recursiveClimbStairs(n-2);
            hm.put(n, value);
        }
        return value;
    }
    
}











