import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 문제 : https://programmers.co.kr/learn/courses/30/lessons/42586?language=java

//기능개발
//        문제 설명
//        프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
//
//        또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
//
//        먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
//
//        제한 사항
//        작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
//        작업 진도는 100 미만의 자연수입니다.
//        작업 속도는 100 이하의 자연수입니다.
//        배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다. 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
//        입출력 예
//        progresses	speeds	return
//        [93,30,55]	[1,30,5]	[2,1]
//        입출력 예 설명
//        첫 번째 기능은 93% 완료되어 있고 하루에 1%씩 작업이 가능하므로 7일간 작업 후 배포가 가능합니다.
//        두 번째 기능은 30%가 완료되어 있고 하루에 30%씩 작업이 가능하므로 3일간 작업 후 배포가 가능합니다. 하지만 이전 첫 번째 기능이 아직 완성된 상태가 아니기 때문에 첫 번째 기능이 배포되는 7일째 배포됩니다.
//        세 번째 기능은 55%가 완료되어 있고 하루에 5%씩 작업이 가능하므로 9일간 작업 후 배포가 가능합니다.
//
//        따라서 7일째에 2개의 기능, 9일째에 1개의 기능이 배포됩니다.

public class queue_3_my_answer {

    public static void main(String args[])
    {

        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};

        System.out.println(Arrays.toString(progresses));
        System.out.println(Arrays.toString(speeds));

        int[]answers = solution(progresses, speeds);

        System.out.println(Arrays.toString(answers));
    }

    public static int[] solution(int[] progresses, int[] speeds) {

        // 100% 작업이 되는 요일에 대한 큐
        Queue queue = new LinkedList();

        // 정답을 넣을 리스트
        ArrayList<Integer> arrayList = new ArrayList<>();

        // 각 작업별로 100%되는 프로젝트 기일을 큐에 집어넣음
        for (int i = 0 ; i < progresses.length ; i++ ) {

            int sum = 0;
            int count = 0;
            while(progresses[i] + sum<100) {
                sum = sum + speeds[i];
                count++;
            }
            queue.offer(count);
        }

        System.out.println(Arrays.toString(queue.toArray()));

        // TODO : 큐를 확인해서 처리
        // queue.isEmpty 할때까지
        // queue.peek 값보다 크게 나올떄까지 디큐후, count
        // 크게 나오면 count값 집어넣고 위에 과정 반복
        while(!queue.isEmpty()) {
            int count = 0;
            int pivot = (int)queue.peek();

            while(!queue.isEmpty()) {
                if(pivot >= (int)queue.peek()) {
                    count ++;
                    queue.poll();
                }
                else {
                    break;
                }
            }
            arrayList.add(count);
        }

        // list를 array로 변환
        return arrayList.stream().mapToInt(i -> i.intValue()).toArray();
    }


}
