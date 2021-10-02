
// 네트워크
// 문제 설명
// 네트워크란 컴퓨터 상호 간에 정보를 교환할 수 있도록 연결된 형태를 의미합니다. 
// 예를 들어, 컴퓨터 A와 컴퓨터 B가 직접적으로 연결되어있고, 
// 컴퓨터 B와 컴퓨터 C가 직접적으로 연결되어 있을 때 컴퓨터 A와 컴퓨터 C도 
// 간접적으로 연결되어 정보를 교환할 수 있습니다. 따라서 컴퓨터 A, B, C는 모두 같은 네트워크 상에 있다고 할 수 있습니다.

// 컴퓨터의 개수 n, 연결에 대한 정보가 담긴 2차원 배열 computers가 매개변수로 주어질 때, 네트워크의 개수를 return 하도록 solution 함수를 작성하시오.

// 제한사항
// 컴퓨터의 개수 n은 1 이상 200 이하인 자연수입니다.
// 각 컴퓨터는 0부터 n-1인 정수로 표현합니다.
// i번 컴퓨터와 j번 컴퓨터가 연결되어 있으면 computers[i][j]를 1로 표현합니다.
// computer[i][i]는 항상 1입니다.

// https://programmers.co.kr/learn/courses/30/lessons/43162


// dfs 호출횟수를 확인하는문제
class Solution {
    
    // 연결정보가 담긴 computers
    int[][] data;
    boolean[] chk;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        data = computers; // 방문해야될 컴퓨터들
        chk = new boolean[n]; // 컴퓨터 확인여부
        
        // 컴퓨터 연결여부를 확인한다.
        // for문이 한번끝나면, 연결된 모든 컴퓨터들은 방문이 체크되고 다시 체크하지않는다.
        for(int i = 0; i < n; i++) {
            // 방문하지않았다면
            if(!chk[i]) {
                // dfs를 돌려본다.
                dfs(i);
                answer++;
            }
        }
        return answer;
    }
    
    // 깊이우선탐색
    void dfs(int start) {
        // 확인한 컴퓨터는 체크
        chk[start] = true;
        
        // 컴퓨터의 개수만큼 확인
        for(int i = 0; i < data.length; i++) {
            // 확인하지않은 컴퓨터이면서, 1로 연결되어있다면
            if(data[start][i] == 1 && !chk[i]) {
                // 연결된 컴퓨터의 방문을 체크한다.
                dfs(i);
            }
        }
    }
}

// class Solution {
//     boolean visited[];
//     int[][] data;

//     public int solution(int n, int[][] computers) {
//         int answer = 0;
//         visited = new boolean[n];
//         data = computers;

//         for(int i=0; i<n; i++) {
//             if(!visited[i]) {
//                 answer++;
//                 dfs(i);
//             }
//         }
//         return answer;
//     }

//     void dfs(int index) {
//         if(visited[index]) {return;}
//         visited[index] = true;

//         for(int i=0; i<data[index].length; i++) {
//             if(data[index][i] == 1) {
//                 dfs(i);
//             }
//         }

//     }
// }