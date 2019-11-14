import java.util.Arrays;
import java.util.Scanner;

public class line_1 {

//    문제 설명
//    메시지(message) 처리 시간
//    최대 10개의 메시지를 처리하는 메시지 큐(message queue)가 있다. 메시지 큐에 메시지가 쌓이면 이를 순차적으로 최대 10개의 컨슈머(consumer)가 처리한다. 메시지마다 처리에 걸리는 시간은 다를 수 있고 하나의 메시지 처리에 걸리는 시간은 최대 100초이다.
//    모든 메시지가 0초에 도착하고 입력받는 순서대로 처리한다고 가정하였을 때, 전체 메시지를 처리하는데 걸리는 시간을 계산하시오.
//    단, 메시지의 개수, 컨슈머의 개수 모두 1개 이상이고 메시지를 메시지 큐에 넣거나 빼는 작업에는 아무런 오버헤드가 없다.

    public static void main(String[] args) {

        // 입력형식
        Scanner sc = new Scanner(System.in);

        // 첫째 줄에 입력받을 메시지의 수와 컨슈머 개수가 정수로 입력된다
        int messageNum = sc.nextInt();
        int consumerNum = sc.nextInt();

        // 첫째 줄의 메시지의 수만큼 처리 소요 시간이 입력된다
        int[] times = new int[messageNum];
        for (int count = 0; count < messageNum; count++) {
            times[count] = sc.nextInt();
        }

        // 메세지 큐에서 컨슈머 별로 메세지 작업을 인계한다.
        // 컨슈머가 비어있을경우 바로 집어넣는다.
        // 컨슈머별로 소요시간이 가장 적은곳으로 메세지를 집어넣는다.
        int[] consumers = new int[consumerNum];

        for (int i = 0; i < messageNum; i++) {
            Arrays.sort(consumers);
            consumers[0] = consumers[0] + times[i];
        }

        // 각 컨슈머 별로 처리한 시간중, 가장 긴시간을 return 해준다.
        System.out.println(String.valueOf(consumers[0]));
    }
}
