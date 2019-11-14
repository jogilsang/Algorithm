public class practice_2_other_answer {

    class Solution {
        public String solution(int a, int b) {
            String answer = "";

            int[] c = {31,29,31,30,31,30,31,31,30,31,30,31};
            String[] MM ={"FRI","SAT","SUN","MON","TUE","WED","THU"};
            int Adate = 0;
            for(int i = 0 ; i< a-1; i++){
                Adate += c[i];
            }
            Adate += b-1;
            answer = MM[Adate %7];

            return answer;
        }
    }


}
