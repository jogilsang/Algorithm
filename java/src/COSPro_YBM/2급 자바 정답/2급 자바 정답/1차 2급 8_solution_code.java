class Solution{
    boolean solution(String sentence){
        String str = "";
        for(int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);
            if(c != ' ' && c != '.') str += c;
        }
        int len = str.length();
        for(int i = 0; i < len / 2; i++){
            if(str.charAt(i) != str.charAt(len - 1 - i)) return false;
        }
        return true;
    }
}
