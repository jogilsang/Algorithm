
// 빨강타일을 받아서, 공약수 2차원 배열로 바꾼다 x와 y를 더한다음
// x*2 +4와 일치하는 브라운을 찾는다 그 다음 x+2, y+2를 리턴한다

import java.util.ArrayList;

public class completesearch_2_myanswer {

    public int[] solution(int brown, int red) {

        // 빨강타일의 공약수
        int[] commonDivisorOfRed = getCommonDivisor(red);

        int[] answer = {};
        return answer;
    }

    public int[] getCommonDivisor(int value){

        ArrayList<Integer> list = new ArrayList<>();

        for( int i = 1 ;  i <= value ; i++ ) {

            if(value % i ==0) {
                list.add(i);
            }
        }

        return list.stream().mapToInt(i -> i.intValue()).toArray();
    }

}
