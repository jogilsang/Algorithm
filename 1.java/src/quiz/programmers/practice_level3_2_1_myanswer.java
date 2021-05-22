package quiz.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class practice_level3_2_1_myanswer {

    // https://programmers.co.kr/learn/courses/30/lessons/42746
    // 가장 큰 수

    // 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때,
    // 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요

    // 1. 앞자리수가 큰걸로 정렬한다.
    // 2. 앞자리수가 같다면, 자릿수가 적은걸 앞에둔다.
    // 합쳐서 출력한다.

    // 1. 오름차순으로 정렬한다.
    // 2. 자릿수 최대값은 마지막값
    // 2. 앞자리수에 대한 배열을 만든다. ( 0 ~ 9)
    // 3. 1의 자릿수의 경우 그냥 넣는다.
    // 4. 2자릿수 이상의 경우, 임시배열을 만든다음 내림차순으로 정렬 후 집어넣는다.
    // 5. 끝나면 다 합쳐서 return 한다.

    public static void main(String[] args) {

        int[] numbers = new int[]{6, 10, 2};
        String temp = solution(numbers);
        System.out.println(temp);

    }

    public static String solution(int[] numbers) {

        String answer = "";

        // 오름차순 정렬
        Arrays.sort(numbers);

        // 리스트 생성
        ArrayList<Integer> arr_0 = new ArrayList<>();
        ArrayList<Integer> arr_1 = new ArrayList<>();
        ArrayList<Integer> arr_2 = new ArrayList<>();
        ArrayList<Integer> arr_3 = new ArrayList<>();
        ArrayList<Integer> arr_4 = new ArrayList<>();
        ArrayList<Integer> arr_5 = new ArrayList<>();
        ArrayList<Integer> arr_6 = new ArrayList<>();
        ArrayList<Integer> arr_7 = new ArrayList<>();
        ArrayList<Integer> arr_8 = new ArrayList<>();
        ArrayList<Integer> arr_9 = new ArrayList<>();

        // 임시 리스트 생성
        ArrayList<Integer> temp_arr_1 = new ArrayList<>();
        ArrayList<Integer> temp_arr_2 = new ArrayList<>();
        ArrayList<Integer> temp_arr_3 = new ArrayList<>();
        ArrayList<Integer> temp_arr_4 = new ArrayList<>();
        ArrayList<Integer> temp_arr_5 = new ArrayList<>();
        ArrayList<Integer> temp_arr_6 = new ArrayList<>();
        ArrayList<Integer> temp_arr_7 = new ArrayList<>();
        ArrayList<Integer> temp_arr_8 = new ArrayList<>();
        ArrayList<Integer> temp_arr_9 = new ArrayList<>();

        ArrayList<Integer> answerList = new ArrayList<>();

        int current_division = 1;

        for (int i = 0; i < numbers.length; i++) {

            // 배열의 값
            String str = String.valueOf(numbers[i]);
            int value = numbers[i];

            // 맨 앞자리의 값
            String pivot = str.substring(0, 1);

            // 전체 자릿수
            int division = str.length();

            // 현재 체크하는 자리수와 전체자릿수가 동일하다면
            if (current_division == division) {
                // 맨 앞자리의 값을 확인
                switch (pivot) {

                    case "0":
                        arr_0.add(value);
                        break;
                    case "1":
                        temp_arr_1.add(value);
                        break;
                    case "2":
                        temp_arr_2.add(value);
                        break;
                    case "3":
                        temp_arr_3.add(value);
                        break;
                    case "4":
                        temp_arr_4.add(value);
                        break;
                    case "5":
                        temp_arr_5.add(value);
                        break;
                    case "6":
                        temp_arr_6.add(value);
                        break;
                    case "7":
                        temp_arr_7.add(value);
                        break;
                    case "8":
                        temp_arr_8.add(value);
                        break;
                    case "9":
                        temp_arr_9.add(value);
                        break;
                }
            }
            // 현재 체크하는 자리수가 달라진다면
            else {
                // 자릿수 하나 증가시키고
                current_division = division;

                // 기존에 넣었던 거를 내림차순으로 재정렬
                Collections.reverse(temp_arr_1);
                Collections.reverse(temp_arr_2);
                Collections.reverse(temp_arr_3);
                Collections.reverse(temp_arr_4);
                Collections.reverse(temp_arr_5);
                Collections.reverse(temp_arr_6);
                Collections.reverse(temp_arr_7);
                Collections.reverse(temp_arr_8);
                Collections.reverse(temp_arr_9);

                // 재정렬된거를 넣어준다.
                arr_1.addAll(temp_arr_1);
                arr_2.addAll(temp_arr_2);
                arr_3.addAll(temp_arr_3);
                arr_4.addAll(temp_arr_4);
                arr_5.addAll(temp_arr_5);
                arr_6.addAll(temp_arr_6);
                arr_7.addAll(temp_arr_7);
                arr_8.addAll(temp_arr_8);
                arr_9.addAll(temp_arr_9);

                // 임시 리스트를 비운다.
                temp_arr_1.clear();
                temp_arr_2.clear();
                temp_arr_3.clear();
                temp_arr_4.clear();
                temp_arr_5.clear();
                temp_arr_6.clear();
                temp_arr_7.clear();
                temp_arr_8.clear();
                temp_arr_9.clear();

                // 자릿수가 변경된 값을 넣어준다.
                switch (pivot) {

                    case "0":
                        arr_0.add(value);
                        break;
                    case "1":
                        temp_arr_1.add(value);
                        break;
                    case "2":
                        temp_arr_2.add(value);
                        break;
                    case "3":
                        temp_arr_3.add(value);
                        break;
                    case "4":
                        temp_arr_4.add(value);
                        break;
                    case "5":
                        temp_arr_5.add(value);
                        break;
                    case "6":
                        temp_arr_6.add(value);
                        break;
                    case "7":
                        temp_arr_7.add(value);
                        break;
                    case "8":
                        temp_arr_8.add(value);
                        break;
                    case "9":
                        temp_arr_9.add(value);
                        break;
                }
            }

        }

        // 마지막 재정렬된거를 넣어준다.
        arr_1.addAll(temp_arr_1);
        arr_2.addAll(temp_arr_2);
        arr_3.addAll(temp_arr_3);
        arr_4.addAll(temp_arr_4);
        arr_5.addAll(temp_arr_5);
        arr_6.addAll(temp_arr_6);
        arr_7.addAll(temp_arr_7);
        arr_8.addAll(temp_arr_8);
        arr_9.addAll(temp_arr_9);

        // 최종리스트를 넣는다
        answerList.addAll(arr_9);
        answerList.addAll(arr_8);
        answerList.addAll(arr_7);
        answerList.addAll(arr_6);
        answerList.addAll(arr_5);
        answerList.addAll(arr_4);
        answerList.addAll(arr_3);
        answerList.addAll(arr_2);
        answerList.addAll(arr_1);
        answerList.addAll(arr_0);

        for (int listValue : answerList) {
            answer = answer + String.valueOf(listValue);
        }

        return answer;

    }


}
