
class Solution {
    public int reverse(int x) {
        // String으로 변환한다.
        // charArray로 바꿔서 reverse한다.
        // 앞에 0을 제거해준다.
        // (1) int로 바꿔서 리턴한다.
        // (2) 음수면 -, 양수면+를 붙인다.
        
        // sum을 선언한다.
        // 자릿수를 구한다
        int sum = 0;
        int length = (int)(Math.log10(x)+1);
        
        // 숫자가 n자리인경우, 1의자리 * 10 ^ n-1
        //                    n번쨰 자리 * 10^n-n
    
        // 10의 자리 = (x % 100) / 10
        // 100의 자리 = (x % 1000) / 100
        // n자리 = = (x % 10^(n-n) / 
        for (int i = 1 ; i <= length ; i++) {
            int multi = (int)Math.pow(10, length - i);
            int target = (x % (int)Math.pow(10,i)) / (int)Math.pow(10,i-1);
            sum += multi * target;
        }
        
        // 붙여서 return
        return sum;
                    
    }
}