// 문제 : https://programmers.co.kr/learn/courses/30/lessons/42587

import java.util.LinkedList;
import java.util.Queue;

public class queue_1_my_answer {

//    프린터
//    문제 설명
//    일반적인 프린터는 인쇄 요청이 들어온 순서대로 인쇄합니다. 그렇기 때문에 중요한 문서가 나중에 인쇄될 수 있습니다.
//    이런 문제를 보완하기 위해 중요도가 높은 문서를 먼저 인쇄하는 프린터를 개발했습니다. 이 새롭게 개발한 프린터는 아래와 같은 방식으로 인쇄 작업을 수행합니다.
//
//    1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
//    2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
//    3. 그렇지 않으면 J를 인쇄합니다.
//    예를 들어, 4개의 문서(A, B, C, D)가 순서대로 인쇄 대기목록에 있고 중요도가 2 1 3 2 라면 C D A B 순으로 인쇄하게 됩니다.
//
//    내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 알고 싶습니다. 위의 예에서 C는 1번째로, A는 3번째로 인쇄됩니다.
//
//    현재 대기목록에 있는 문서의 중요도가 순서대로 담긴 배열 priorities와 내가 인쇄를 요청한 문서가 현재 대기목록의 어떤 위치에 있는지를 알려주는 location이 매개변수로 주어질 때, 내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 return 하도록 solution 함수를 작성해주세요.
//
//    제한사항
//    현재 대기목록에는 1개 이상 100개 이하의 문서가 있습니다.
//    인쇄 작업의 중요도는 1~9로 표현하며 숫자가 클수록 중요하다는 뜻입니다.
//    location은 0 이상 (현재 대기목록에 있는 작업 수 - 1) 이하의 값을 가지며 대기목록의 가장 앞에 있으면 0, 두 번째에 있으면 1로 표현합니다.
//    입출력 예
//    priorities	location	return
//            [2, 1, 3, 2]	2	1
//            [1, 1, 9, 1, 1, 1]	0	5
//    입출력 예 설명
//    예제 #1
//
//    문제에 나온 예와 같습니다.
//
//    예제 #2
//    6개의 문서(A, B, C, D, E, F)가 인쇄 대기목록에 있고 중요도가 1 1 9 1 1 1 이므로 C D E F A B 순으로 인쇄합니다.
//

    public int solution(int[] priorities, int location) {
        int answer = 0;

        // 문제해결
        // 1. 큐를 만든다 (offer, poll)
        Queue queue = new LinkedList();
        Queue printedList = new LinkedList();

        // 큐에 로케이션을 담는다.
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(i);
        }

        // 인쇄를 시작한다.(인쇄가 끝날떄까지)
        while(!queue.isEmpty()) {

            // 큐의 첫번째값을 보여준다.(로케이션)
            int first = (int)queue.peek();
            System.out.println(String.valueOf(first));

            // 로케이션에 해당하는 우선순위가 최고인지 확인한다
            int index = 0;
            int breakPoint = 0;
            for(int priority : priorities) {
                // 자기 로케이션에 대한 우선순위가 아니라면, 비교를 시작한다.
                if(index != first) {
                    // 우선순위가 더 높은게 리스트에 있는경우
                    if(priority > priorities[first]) {
                        queue.poll();
                        queue.offer(first);
                        breakPoint = 1;
                        break;
                    }
                }
                index ++;
            }
            // 검사를 통과했으면, 우선순위 높은게 없으므로 큐에서 제거
            if(breakPoint == 0) {
                int printed = (int)queue.poll();
                printedList.offer(printed);
                priorities[first] = 0; // 우선순위 0 으로 바꿔버림
            }
        }
        // 큐가 다 비워지면, printed list가 채워진다
        // printedlist에서 location이 몇번쨰 있는지 확인하면된다
        answer = ((LinkedList) printedList).indexOf(location) + 1;

        return answer;
    }

}
