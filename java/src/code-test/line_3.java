import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class line_3 {
//
//    문제 설명
//    화장실
//    오프라인 필기 테스트의 시험 감독을 맡게 된 코니는 혹시 부정행위가 일어나지는 않을까 시험장을 구석구석 살펴보았다.
//    지원자들을 매의 눈으로 주시하던 코니는 놓친 부분을 발견했다. 바로 화장실이었다! 지원자들이 화장실에 같이 가서 답을 공유하지는 않을까?
//    걱정이 많은 코니는 한 가지 사실을 깨닫고 마음을 놓을 수 있었다. LINE의 화장실은 모든 지원자들을 서로 다른 화장실로 보낼 수 있을 만큼 넉넉하다는 것이었다.
//    지원자의 수와 지원자들이 화장실에 간 시간과 화장실에서 돌아온 시간의 목록이 주어졌을 때,
//    모든 지원자들이 서로 다른 화장실에 들어갈 수 있는 화장실의 최소 개수를 구하여라.
//
//    입력 형식
//    첫 번째 줄에는 지원자의 수 N이 들어온다
//    N은 1000 이하의 양의 정수이다
//    두 번째 줄부터 N+1번째 줄까지 각 지원자가 화장실에 간 시간과 화장실에서 돌아온 시간이 주어진다
//    화장실에 간 시간과 화장실에서 돌아온 시간은 모두 150 이하의 음이 아닌 정수이며,
//    화장실에서 돌아온 시간은 화장실에서 간 시간보다 항상 크다, 화장실에 가지 않는 지원자는 없다
//    출력 형식
//    모든 지원자들이 서로 다른 화장실에 들어갈 수 있는 화장실 수의 최솟값을 출력한다

    public static void main(String[] args) {

        // 입력 형식
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄에는 지원자의 수 N이 들어온다
        // N은 1000 이하의 양의 정수이다
        int a = sc.nextInt();

        // 두 번째 줄부터 N+1번째 줄까지 각 지원자가 화장실에 간 시간과 화장실에서 돌아온 시간이 주어진다
        // 화장실에 간 시간과 화장실에서 돌아온 시간은 모두 150 이하의 음이 아닌 정수이며, 화장실에서 돌아온 시간은 화장실에서 간 시간보다 항상 크다
        // 화장실에 가지 않는 지원자는 없다

        int[][] users = new int[a][2];

        for(int p = 0 ; p < a ; p++) {
            int b = sc.nextInt();
            int c = sc.nextInt();

            users[p][0] = b;
            users[p][1] = c;
        }

        // 2차원 배열, 첫번째 행 기준 오름차순 정렬
        Arrays.sort(users, new Comparator<int[]>() {
            @Override
            public int compare(final int[] entry1, final int[] entry2) {
                final Integer time1 = entry1[0];
                final Integer time2 = entry2[0];
                return time1.compareTo(time2);
            }
        });

        // 사용자 index 넣기
        HashSet<Integer> visited = new HashSet<>();

        // 화장실은 무조건 하나는 사용하므로 1로 시작
        int count = 1;
        for(int i = 0 ; i < a ; i++) {

            // 화장실 연산에 사용되었던 사용자라면 pass
            if(visited.contains(i)) {
                continue;
            }
            for(int j = i + 1 ; j < a ; j++) {
                // 크거나 같으면, 화장실 추가할 필요없음
                if(users[i][1] <= users[j][0]) {
                    visited.add(i);
                    visited.add(j);
                }
                // 작다면, 그 시간에 화장실 써야하므로 화장실 추가
                else {
                    count++;
                }
            }
        }

        System.out.println(count);


    }



}
