import java.util.ArrayList;
import java.util.Scanner;

public class line_5 {

//    문제 설명
//    코니와 문의 술래잡기
//    가로, 세로가 각각 n과 m인 모눈종이 공간에서 코니와 문이 술래잡기를 하고 있다. 이때, 코니가 (x,y)위치로 도망 간 뒤, 문이 코니를 가장 빨리 잡을 수 있는 경우의 수는 몇 가지인가?
//
//    다음은 코니와 문의 술래잡기 규칙이다.
//
//    코니는 도망간 뒤 이동하지 않는다
//    문은 (0,0) 지점에서 게임을 시작한다
//    문은 가로, 세로로만 이동이 가능하다
//    한 칸을 이동할 때 1초의 시간이 필요하다
//    코니가 모눈종이 공간 밖으로 도망 간 경우 문은 코니를 잡을 수 없다
//    모눈종이 공간의 n, m 크기는 1부터 24 사이의 자연수이다 (0 < n,m < 25)
//    예시
//    아래는 가로x세로 9x9 모눈종이 공간이다. 코니가 (2,1) 위치로 도망을 갔다. 문이 (0,0) 위치에서 출발하여 코니를 가장 빨리 잡을 수 있는 경우의 수는 3가지이며 3초의 시간이 걸린다.

    // 최단거리 가지수
    public static ArrayList<Integer> courseList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // n x m 모눈종이
        int[] map = new int[2];
        map[0] = a;
        map[1] = b;

        // 코니의 좌표
        int[] location = new int[2];
        location[0] = c;
        location[1] = d;

        // 코니가 map 외부에 위치해있다면, fail
        if (map[0] < location[0] || map[1] < location[1]) {
            System.out.println("fail");
            return;
        }

        // 최소 시간은 코니의 좌표의 합으로 고정되있음
        int minTime = location[0] + location[1];

        // 최소 시간으로 가는 최단거리를 탐색하는 함수
        search(0, minTime, 0, 0, location[0], location[1]);

        // 최소시간과 경우의 수 출력
        System.out.println(String.valueOf(minTime));
        System.out.println(String.valueOf(courseList.size()));

    }

    private static void search(int count, int minTime, int culX, int culY, int desX, int dexY) {

        // 현재 위치가 목표 위치를 벗어나게되면 고려하지않음
        if (culX > desX || culY > dexY) {
            return;
        }

        // 현재 위치가 목표위치에 도달한다면
        if (culX == desX && culY == dexY) {
            // 최소시간과 일치하면, 최단거리로 인정하고 count를 증가시킨다.
            if (count == minTime) {
                courseList.add(count);
            }
            return;
        }

        // 0,0 좌표에서 출발하기떄문에 무조건 위방향, 오른쪽 방향으로 가게된다.
        search(count + 1, minTime, culX + 1, culY, desX, dexY);
        search(count + 1, minTime, culX, culY + 1, desX, dexY);

    }


}
