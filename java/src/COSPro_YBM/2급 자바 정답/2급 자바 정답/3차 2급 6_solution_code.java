class Solution {
    public String solution(int len) {
        String answer="";
        String com = "RRRGGB";
        if(len%6==1 || len%6==2 || len%6 ==4) answer ="-1";
        else{
            for(int i =0; i <len;i++) answer += com.charAt(i%6);
        }
        return answer;
}
}
