// 문제 : https://programmers.co.kr/learn/courses/30/lessons/1829

import java.util.Stack;

public class kakao2017_1_my_answer {

// 문제풀이 :
// 같은 크기의 2차원 배열 boolean을 만든다
// 혹은 그 좌표의 key를 가지는 hashmap을 만든다.
// 방문할때마다 true로 바꿈

// 배열의 값이 0 일 경우 pass
// 배열의 값이 1일 경우 상하좌우로 탐색한다.



    class Solution {

        // next 방향 전환을 위한 4x2 배열
        // up, down, left, right
        int [][]direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        // (0, 0)에서 시작
        int curX = 0;
        int curY = 0;

        boolean isInside(int m, int n, int a, int b) {
            return ( a >= 0 && a < m ) && (b >=0 && b < n);
        }

        public int[] solution(int m, int n, int[][] picture) {

            // 지났던 길 기록
            Boolean[][] check = new Boolean[m][n];

            // 전후좌우 이동 및 체크
            for(int i = 0; i < 4; i++) {
                int nextX = curX + direction[i][1];
                int nextY = curY + direction[i][0];

                // 배열 범위를 벗어나지 않았는지 && 배열을 통해 방문한 적이 없는지
                if(isInside(m,n,nextX,nextY) && check[nextX][nextY] == false) {

                    // 그림의 값이 0 이면 pass
                    if(picture[nextX][nextY] == 0) {
                        // pass
                    }
                    // 그림에 값이 있으면 이동!
                    else {
                        // Move
                    }
                }

            }

            int numberOfArea = 0;
            int maxSizeOfOneArea = 0;

            int[] answer = new int[2];
            answer[0] = numberOfArea;
            answer[1] = maxSizeOfOneArea;
            return answer;
        }
    }

}
