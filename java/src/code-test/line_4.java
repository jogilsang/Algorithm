import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class line_4 {

    // 1000101 같이 값이 주어졌을때
    // index 찾기

    public static void main(String[] args) {

        // 입출력 받음
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 개행문자 제거
        String b = sc.nextLine();

        // 공백 제거 후 int형 배열로 변경
        String[] k = b.split(" ");
        int[] distances = new int[k.length];
        int temp = 0;
        for (String value : k) {
            try {
                distances[temp++] = Integer.parseInt(value);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        // 정답배열
        ArrayList<Integer> arrayList = new ArrayList<>();

        // 사람과 사람간의 간격 탐색
        // 1 에서 1을 만나기전까지 거리를 계산해서 list에 저장한뒤, 가장 높은 값을 출력
        for (int i = 0; i < distances.length; i++) {
            int count = 0;
            for (int j = i + 1; j < distances.length; j++) {
                if (distances[i] == 1) {
                    if (distances[j] == 1) {
                        // 두 사람 간격이 짝수인경우
                        int answer = 0;
                        if (count % 2 == 0) {
                            answer = count / 2;
                            arrayList.add(answer);
                        }
                        // 두사람 간격이 홀수인경우
                        else {
                            answer = count / 2 + 1;
                            arrayList.add(answer);
                        }
                        arrayList.add(answer);
                    } else {
                        // 카운트 증가
                        count++;
                    }
                } else {
                    break;
                }
            }
        }

        // 거리가 가장 높은순으로 내림차순으로 정렬
        Collections.reverse(arrayList);

        // 가장 높은 거리 출력
        System.out.println(arrayList.get(0));

    }


}
