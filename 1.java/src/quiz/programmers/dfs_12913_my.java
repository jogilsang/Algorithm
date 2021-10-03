

// https://programmers.co.kr/learn/courses/30/lessons/12913
//땅따먹기 게임을 하려고 합니다. 땅따먹기 게임의 땅(land)은 총 N행 4열로 이루어져 있고, 모든 칸에는 점수가 쓰여 있습니다. 1행부터 땅을 밟으며 한 행씩 내려올 때, 각 행의 4칸 중 한 칸만 밟으면서 내려와야 합니다. 단, 땅따먹기 게임에는 한 행씩 내려올 때, 같은 열을 연속해서 밟을 수 없는 특수 규칙이 있습니다.
//
//        예를 들면,
//
//        | 1 | 2 | 3 | 5 |
//
//        | 5 | 6 | 7 | 8 |
//
//        | 4 | 3 | 2 | 1 |


// 틀림
//
//import java.lang.Math;
//
//class Solution {
//
//    int[][] data;
//    int answer;
//    int solution(int[][] land) {
//        answer = 0;
//        data = land;
//
//        answer = getMaxPoint();
//
//        return answer;
//    }
//
//    public int getMaxPoint() {
//
//        int point = 0;
//        int beforeColumnIndex = -1;
//
//        for(int i = 0 ; i < data.length ; i++) {
//            // 최대값을 찾을 임시변수
//            int max = Integer.MIN_VALUE;
//            int currentColumnIndex = -1;
//            // 최대값을 찾는다.
//            for(int j = 0 ; j < data[0].length ; j++) {
//                // 특수규칙 : 같은 열을 계속해서 밞을 수 없다.
//                if(beforeColumnIndex != j) {
//                    // 최대값을 찾았다면
//                    if(data[i][j] > max) {
//                        // 최대값의 index를 저장
//                        currentColumnIndex = j;
//                        // 비교할 최대값 변경
//                        max = data[i][j];
//                    }
//                }
//            }
//            // 다음에 비교할 이전인덱스는 현재의 최대값 index
//            beforeColumnIndex = currentColumnIndex;
//            // for문이 종료되면 값을 더한다.
//            point += max;
//        }
//        return point;
//    }
//
//}

//class Solution {
//
//    int[][] data;
//    boolean[] visited;
//    int answer;
//    int solution(int[][] land) {
//        answer = 0;
//        data = land;
//        visited = new boolean[land.length];
//
//        dfs(0,0,0,0);
//
//        return answer;
//    }
//
//    public void dfs(int start, int before, int count, int result) {
//
//        if(count == data.length) {
//            if(answer < result) {
//                answer = result;
//                System.out.println(answer);
//                return ;
//            }
//        }
//
//        // 순회
//        for(int i = 0 ; i < data.length ; i++) {
//            // 방문
//            if(!visited[i]) {
//                for(int j = 0 ; j <  4 ; j++) {
//                    // 이전에 선택된 것중 같은 건 안됨
//                    if(j != before) {
//                        visited[i] = true;
//                        dfs(i, j, count+1 , result + data[i][j]);
//                        visited[i] = false;
//                    }
//                }
//
//            }
//        }
//    }
//
//}