
//https://programmers.co.kr/learn/courses/30/lessons/43164
import java.util.ArrayList;
import java.util.Collections;
 
public class Solution {
    boolean[] visited;                    //방문한지 안한지를 체크하는 visited배열
    ArrayList<String> answers;
 
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];    
        answers = new ArrayList<String>();
        int count = 0;                                    //몇개의 공항을 들렸는지 알려주는 카운트
        dfs(count, "ICN", "ICN",tickets);                
        Collections.sort(answers);                        //답들 중 가장 알파벳순이 빠른 배열들로 정렬
        String[] answer = answers.get(0).split(" ");    //가장 빠른 배열을 뽑아서 String형 배열로 만듬
        return answer;
    }
    public void dfs(int count, String present, String answer, String[][]ticktes) {
        if(count == ticktes.length) {            //모든 공항을 들렸다면
            answers.add(answer);                //answers에 추가
            return;
        }
        for(int i = 0; i < ticktes.length; i++) {
            if(!visited[i] && ticktes[i][0].equals(present)) {        //present와 같고 들리지 않은 공항을 찾고
                visited[i] = true;                                    //해당 공항을 들린걸로 만듬.
                dfs(count+1, ticktes[i][1],answer+" "+ticktes[i][1] , ticktes);    //카운트 +1 도착 공항을 present로 넣어주고 answer에 도착공항을 추가해준다.
                visited[i] = false;
            }
        }
        return;
    }

}
// 출처: https://tosuccess.tistory.com/36 [EI_HJ]



// // 내 풀이
// class Solution {
//     String[] answer = {};
//     String[] target ;
//     boolean[] visited ;
//     int columnCount;
//     int rowCount;
    
//     public String[] solution(String[][] tickets) {
                
//         // 행의개수
//         rowCount = tickets.length;
//         columnCount = tickets[0].length;

//         target = new String[rowCount+1];
//         visited = new boolean[rowCount+1];
        
//         dfs("ICN", 0,target, tickets);

//         return answer;
//     }
//     public void dfs(String start, int index, String[] target, String[][] tickets) {
//         if(target.length == rowCount + 1 ) {
//             // 정답과 비교해서 다 가까운걸로 대체
//             answer = target;
//             return ;
//         }
        
//         for(int i = 0; i < rowCount ; i++) {
//             // 방문하지않았고, 포함한다면
//             if(!visited[i] && tickets[i][0].equals(start)) {
//                 visited[i]=true;
//                 target[index] = tickets[i][1];
//                 dfs(tickets[i][1], index +1, target, tickets);
//                 visited[i]=false;
//             }
//         }
//     }
// }