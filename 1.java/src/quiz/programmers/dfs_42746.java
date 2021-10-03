//0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
//
//        예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
//
//        0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
//
//        제한 사항
//        numbers의 길이는 1 이상 100,000 이하입니다.
//        numbers의 원소는 0 이상 1,000 이하입니다.
//        정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.

//https://programmers.co.kr/learn/courses/30/lessons/42746
import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        ArrayList<String> strList = new ArrayList();
        for(int num : numbers) {
            strList.add(num);
        }

        Collections.sort(strList, (a,b)->(b+a).compareTo(a+b));

        if(strList.get(0).startsWith("0")) return "0";
        for(String s : strList) {
            answer += s;
        }

        return answer;
    }
}

//class Solution {
//    int[] arr;
//    String[] result;
//    boolean[] visited;
//    String answer;
//    public String solution(int[] numbers) {
//        answer = "";
//        arr=numbers;
//        result=new String[numbers.length];
//        visited = new boolean[numbers.length];
//        // 순열문제
//        if(numbers.length == 1 && numbers[0] == 0) {
//            return "0";
//        }
//
//        perm(arr, result, 0,numbers.length, numbers.length);
//
//        return answer;
//    }
//
//    public void perm(int[] arr, String[] result, int depth, int n, int p){
//
//        if(depth == arr.length) {
//            if(answer.length() < result[depth-1].length()){
//                try {
//                    long answer_long = Long.parseLong(answer);
//                    long result_long = Long.parseLong(result[depth-1]);
//                    answer = (answer_long > result_long) ? answer : result[depth-1] ;
//                }catch(NumberFormatException e) {
//
//                }
//
//            }
//            return ;
//        }
//
//        for(int i = 0 ; i < arr.length ; i++ ) {
//            if(!visited[i]) {
//                visited[i] = true;
//                result[depth] += String.valueOf(arr[i]);
//                // 0으로 시작하면 skip
//                perm(arr, result, depth + 1, n, p);
//                visited[i] = false;
//            }
//        }
//
//    }
//
//}

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.ArrayList;
//
//public class Solution {
//    public String solution(int[] numbers) {
//        String answer = "";
//
//        // 오름차순 정렬
//        Arrays.sort(numbers);
//
//        // 리스트 생성
//        ArrayList<Integer> arr_0 = new ArrayList<>();
//        ArrayList<Integer> arr_1 = new ArrayList<>();
//        ArrayList<Integer> arr_2 = new ArrayList<>();
//        ArrayList<Integer> arr_3 = new ArrayList<>();
//        ArrayList<Integer> arr_4 = new ArrayList<>();
//        ArrayList<Integer> arr_5 = new ArrayList<>();
//        ArrayList<Integer> arr_6 = new ArrayList<>();
//        ArrayList<Integer> arr_7 = new ArrayList<>();
//        ArrayList<Integer> arr_8 = new ArrayList<>();
//        ArrayList<Integer> arr_9 = new ArrayList<>();
//
//        // 임시 리스트 생성
//        ArrayList<Integer> temp_arr_1 = new ArrayList<>();
//        ArrayList<Integer> temp_arr_2 = new ArrayList<>();
//        ArrayList<Integer> temp_arr_3 = new ArrayList<>();
//        ArrayList<Integer> temp_arr_4 = new ArrayList<>();
//        ArrayList<Integer> temp_arr_5 = new ArrayList<>();
//        ArrayList<Integer> temp_arr_6 = new ArrayList<>();
//        ArrayList<Integer> temp_arr_7 = new ArrayList<>();
//        ArrayList<Integer> temp_arr_8 = new ArrayList<>();
//        ArrayList<Integer> temp_arr_9 = new ArrayList<>();
//
//        ArrayList<Integer> answerList = new ArrayList<>();
//
//        int current_division = 1;
//
//        for (int i = 0; i < numbers.length; i++) {
//
//            // 배열의 값
//            String str = String.valueOf(numbers[i]);
//            int value = numbers[i];
//
//            // 맨 앞자리의 값
//            String pivot = str.substring(0, 1);
//
//            // 전체 자릿수
//            int division = str.length();
//
//            // 현재 체크하는 자리수와 전체자릿수가 동일하다면
//            if (current_division == division) {
//                // 맨 앞자리의 값을 확인
//                switch (pivot) {
//
//                    case "0":
//                        arr_0.add(value);
//                        break;
//                    case "1":
//                        temp_arr_1.add(value);
//                        break;
//                    case "2":
//                        temp_arr_2.add(value);
//                        break;
//                    case "3":
//                        temp_arr_3.add(value);
//                        break;
//                    case "4":
//                        temp_arr_4.add(value);
//                        break;
//                    case "5":
//                        temp_arr_5.add(value);
//                        break;
//                    case "6":
//                        temp_arr_6.add(value);
//                        break;
//                    case "7":
//                        temp_arr_7.add(value);
//                        break;
//                    case "8":
//                        temp_arr_8.add(value);
//                        break;
//                    case "9":
//                        temp_arr_9.add(value);
//                        break;
//                }
//            }
//            // 현재 체크하는 자리수가 달라진다면
//            else {
//                // 자릿수 하나 증가시키고
//                current_division = division;
//
//                // 기존에 넣었던 거를 내림차순으로 재정렬
//                Collections.reverse(temp_arr_1);
//                Collections.reverse(temp_arr_2);
//                Collections.reverse(temp_arr_3);
//                Collections.reverse(temp_arr_4);
//                Collections.reverse(temp_arr_5);
//                Collections.reverse(temp_arr_6);
//                Collections.reverse(temp_arr_7);
//                Collections.reverse(temp_arr_8);
//                Collections.reverse(temp_arr_9);
//
//                // 재정렬된거를 넣어준다.
//                arr_1.addAll(temp_arr_1);
//                arr_2.addAll(temp_arr_2);
//                arr_3.addAll(temp_arr_3);
//                arr_4.addAll(temp_arr_4);
//                arr_5.addAll(temp_arr_5);
//                arr_6.addAll(temp_arr_6);
//                arr_7.addAll(temp_arr_7);
//                arr_8.addAll(temp_arr_8);
//                arr_9.addAll(temp_arr_9);
//
//                // 임시 리스트를 비운다.
//                temp_arr_1.clear();
//                temp_arr_2.clear();
//                temp_arr_3.clear();
//                temp_arr_4.clear();
//                temp_arr_5.clear();
//                temp_arr_6.clear();
//                temp_arr_7.clear();
//                temp_arr_8.clear();
//                temp_arr_9.clear();
//
//                // 자릿수가 변경된 값을 넣어준다.
//                switch (pivot) {
//
//                    case "0":
//                        arr_0.add(value);
//                        break;
//                    case "1":
//                        temp_arr_1.add(value);
//                        break;
//                    case "2":
//                        temp_arr_2.add(value);
//                        break;
//                    case "3":
//                        temp_arr_3.add(value);
//                        break;
//                    case "4":
//                        temp_arr_4.add(value);
//                        break;
//                    case "5":
//                        temp_arr_5.add(value);
//                        break;
//                    case "6":
//                        temp_arr_6.add(value);
//                        break;
//                    case "7":
//                        temp_arr_7.add(value);
//                        break;
//                    case "8":
//                        temp_arr_8.add(value);
//                        break;
//                    case "9":
//                        temp_arr_9.add(value);
//                        break;
//                }
//            }
//
//        }
//
//        // 마지막 재정렬된거를 넣어준다.
//        arr_1.addAll(temp_arr_1);
//        arr_2.addAll(temp_arr_2);
//        arr_3.addAll(temp_arr_3);
//        arr_4.addAll(temp_arr_4);
//        arr_5.addAll(temp_arr_5);
//        arr_6.addAll(temp_arr_6);
//        arr_7.addAll(temp_arr_7);
//        arr_8.addAll(temp_arr_8);
//        arr_9.addAll(temp_arr_9);
//
//        // 최종리스트를 넣는다
//        answerList.addAll(arr_9);
//        answerList.addAll(arr_8);
//        answerList.addAll(arr_7);
//        answerList.addAll(arr_6);
//        answerList.addAll(arr_5);
//        answerList.addAll(arr_4);
//        answerList.addAll(arr_3);
//        answerList.addAll(arr_2);
//        answerList.addAll(arr_1);
//        answerList.addAll(arr_0);
//
//        for (int listValue : answerList) {
//            answer = answer + String.valueOf(listValue);
//        }
//
//        return answer;
//
//    }
//}