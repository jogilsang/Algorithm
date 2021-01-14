public class practice_level3_2_myanswer {

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

        // 이전 기준값
        int before_pivot = target;
        int finish = 0;

        answer++;

        while(n != 0) {

            int pivot = n/2 - 1;
            if(pivot == 0)
                pivot = 1;

            int sum_pivot  = 0;

            n = n/2;

            for(int i = pivot ; i < before_pivot ; i++) {
                int sum = 0;
                for(int j = i ; j < before_pivot ; j++) {
                    sum = sum + j;
                    if(sum >= target) {
                        if(sum==target) {
                            answer++;
                            finish = 1;
                        }
                        break;
                    }
                }
            if(finish == 1) {
                before_pivot = pivot;
                break;
            }
            
    
          }
        }


        return answer;

  }

}


































