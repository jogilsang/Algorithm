import java.util.ArrayList;

public class practice_level3_1_myanswer {

// https://programmers.co.kr/learn/courses/30/lessons/12924
// 숫자의표현

// Finn은 요즘 수학공부에 빠져 있습니다. 수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다. 예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.

// 1 + 2 + 3 + 4 + 5 = 15
// 4 + 5 + 6 = 15
// 7 + 8 = 15
// 15 = 15
// 자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.

// 나의로직
// 1. n을 받는다.
// 2. n을 2로 나눈다.
// 3. t라고 한다
// 4. t와 t+1 t-1로 시작을 해본다.
// 5. 최소값은 1이다.
    public int solution(int n) {

        // 제출값
        int answer = 0;

        // 목표값
        int target = n;
        answer++;

        while(n != 0) {

            int pivot_0 = n/2 - 1;
            int pivot_1 = n/2
            int pivot_2 = n/2 + 1;
            int sum_pivot_0 = 0;
            int sum_pivot_1 = 0;
            int sum_pivot_2 = 0;
            n = n/2;

            for(int i = pivot_0 ; i < target ; i++) {
                pivot_0 = sum_pivot_0 + i;

                if(sum_pivot_0 == target) {

                    // 정답수 하나 증가
                    answer++;
                    break;
                }

                if(sum_pivot_0 > target) {
                    // 더 돌 가치가없음
                    break;
                }
            }

            for(int i = pivot_1 ; i < target ; i++) {
                sum_pivot_1 = sum_pivot_1 + i;

                if(sum_pivot_1 == target) {

                    // 정답수 하나 증가
                    answer++;
                    break;
                }

                if(sum_pivot_1 > target) {
                    // 더 돌 가치가없음
                    break;
                }
            }

            for(int i = pivot_2 ; i < target ; i++) {
                pivot_2 = pivot_2 + i;

                if(pivot_2 == target) {

                    // 정답수 하나 증가
                    answer++;
                    break;
                }

                if(pivot_2 > target) {
                    // 더 돌 가치가없음
                    break;
                }
            }


    
        }


        return answer;

  }

}


































