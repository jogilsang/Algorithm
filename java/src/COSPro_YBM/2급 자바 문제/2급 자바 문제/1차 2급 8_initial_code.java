import java.util.*;

class Solution {
    boolean solution(String sentence){
        String str = "";
        for(int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);
            if(c != ' ' || c != '.') str += c;
        }
        int len = str.length();
        for(int i = 0; i < len / 2; i++){
            if(str.charAt(i) != str.charAt(len - 1 - i)) return false;
        }
        return true;
    }

    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
        Solution sol = new Solution();
        String sentence1 = "never odd or even.";
        boolean ret1 = sol.solution(sentence1);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        
        String sentence2 = "palindrome";
        boolean ret2 = sol.solution(sentence2);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret2+ " .");       
    }
}