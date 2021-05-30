package quiz.backjoon;

import java.util.ArrayList;
import java.util.Scanner;

// 시간초과

public class backjoon_19_1 {

    public static void main(String[] args) {
        // 1. 인수를 받는다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        // 2. 인수로 리스트를 만든다
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = n; i >= 1; i--) {
            arrayList.add(i);
        }

        // 3. pop행위로 for문을 돌린다.
        while(arrayList.size() != 1) {
            int index = arrayList.size()-1;
            //    3.1. 뒤에걸 제거하고 -> 리스트의 길이가 1이 아니면 -> 앞으로 이동
            arrayList.remove(index);
            if(arrayList.size() != 1) {
                int temp = arrayList.get(index-1);
                arrayList.remove(index-1);
                arrayList.add(0, temp);
            }
            //    3.2. 뒤에걸 제거하고 -> 리스트의 길이가 1이면 -> 종료
            else {
                break;
            }
        }
        System.out.println(arrayList);

    }

}
