import java.util.*;

//문제 설명
//        셀수있는 수량의 순서있는 열거 또는 어떤 순서를 따르는 요소들의 모음을 튜플(tuple)이라고 합니다. n개의 요소를 가진 튜플을 n-튜플(n-tuple)이라고 하며, 다음과 같이 표현할 수 있습니다.
//
//        (a1, a2, a3, ..., an)
//        튜플은 다음과 같은 성질을 가지고 있습니다.
//
//        중복된 원소가 있을 수 있습니다. ex : (2, 3, 1, 2)
//        원소에 정해진 순서가 있으며, 원소의 순서가 다르면 서로 다른 튜플입니다. ex : (1, 2, 3) ≠ (1, 3, 2)
//        튜플의 원소 개수는 유한합니다.
//        원소의 개수가 n개이고, 중복되는 원소가 없는 튜플 (a1, a2, a3, ..., an)이 주어질 때(단, a1, a2, ..., an은 자연수), 이는 다음과 같이 집합 기호 '{', '}'를 이용해 표현할 수 있습니다.
//
//        {{a1}, {a1, a2}, {a1, a2, a3}, {a1, a2, a3, a4}, ... {a1, a2, a3, a4, ..., an}}
//        예를 들어 튜플이 (2, 1, 3, 4)인 경우 이는
//
//        {{2}, {2, 1}, {2, 1, 3}, {2, 1, 3, 4}}
//        와 같이 표현할 수 있습니다. 이때, 집합은 원소의 순서가 바뀌어도 상관없으므로
//
//        {{2}, {2, 1}, {2, 1, 3}, {2, 1, 3, 4}}
//        {{2, 1, 3, 4}, {2}, {2, 1, 3}, {2, 1}}
//        {{1, 2, 3}, {2, 1}, {1, 2, 4, 3}, {2}}
//        는 모두 같은 튜플 (2, 1, 3, 4)를 나타냅니다.
//
//        특정 튜플을 표현하는 집합이 담긴 문자열 s가 매개변수로 주어질 때, s가 표현하는 튜플을 배열에 담아 return 하도록 solution 함수를 완성해주세요.
//
//        [제한사항]
//        s의 길이는 5 이상 1,000,000 이하입니다.
//        s는 숫자와 '{', '}', ',' 로만 이루어져 있습니다.
//        숫자가 0으로 시작하는 경우는 없습니다.
//        s는 항상 중복되는 원소가 없는 튜플을 올바르게 표현하고 있습니다.
//        s가 표현하는 튜플의 원소는 1 이상 100,000 이하인 자연수입니다.
//        return 하는 배열의 길이가 1 이상 500 이하인 경우만 입력으로 주어집니다.
//        [입출력 예]
//        s	result
//        "{{2},{2,1},{2,1,3},{2,1,3,4}}"	[2, 1, 3, 4]
//        "{{1,2,3},{2,1},{1,2,4,3},{2}}"	[2, 1, 3, 4]
//        "{{20,111},{111}}"	[111, 20]
//        "{{123}}"	[123]
//        "{{4,2,3},{3},{2,3,4,1},{2,3}}"	[3, 2, 4, 1]
//        입출력 예에 대한 설명
//        입출력 예 #1
//        문제 예시와 같습니다.
//
//        입출력 예 #2
//        문제 예시와 같습니다.
//
//        입출력 예 #3
//        (111, 20)을 집합 기호를 이용해 표현하면 {{111}, {111,20}}이 되며, 이는 {{20,111},{111}}과 같습니다.
//
//        입출력 예 #4
//        (123)을 집합 기호를 이용해 표현하면 {{123}} 입니다.
//
//        입출력 예 #5
//        (3, 2, 4, 1)을 집합 기호를 이용해 표현하면 {{3},{3,2},{3,2,4},{3,2,4,1}}이 되며, 이는 {{4,2,3},{3},{2,3,4,1},{2,3}}과 같습니다.

class kakaowinter_2 {


    public static int[] solution(String s) {
        int[] answer = {};

        HashMap<Integer,Integer> hashMap = new HashMap();
        ArrayList<Integer> answerList = new ArrayList<>();

        String sample = s;

        String cut_1 = sample.replaceAll(",","");
        String cut_2 = cut_1.replaceAll("}","");
        String cut_3 = cut_2.replaceAll("\\{","");

        String[] words = cut_3.split("");

        // 해시맵 완성
        for(String word : words ) {
            int value = Integer.valueOf(word);
            // 값을 map에 넣음. count를 증가시킴
            if (hashMap.containsKey(value)) {
                int count = hashMap.get(value);
                count++;
                hashMap.put(value, count);
            }
        }

        // hash map에 각 숫자별로 카운트 들어가있음
        // 카운트가 높은거순서로 변경해서 return 해주면됨

        // value 내림차순으로 정렬하고, value가 같으면 key 오름차순으로 정렬
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(hashMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                int comparision = (o1.getValue() - o2.getValue()) * -1;
                return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision;
            }
        });

        // 순서유지를 위해 LinkedHashMap을 사용
        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for(Iterator<Map.Entry<Integer, Integer>> iter = list.iterator(); iter.hasNext();){
            Map.Entry<Integer, Integer> entry = iter.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        sortedMap.forEach((key,value) -> {
            answerList.add(key);
            System.out.println(key + " -> " + value);
        });

        answer = answerList.stream().mapToInt(i -> i.intValue()).toArray();

        return answer;


//        HashMap<Integer,Integer> hashMap = new HashMap();
//        ArrayList<Integer> answerList = new ArrayList<>();
//
//        String sample = s;
//
//        // 시작, 끝 부분 {,}를 없앤다
//        String cut_1 = sample.substring(1);
//        String cut_2 = sample.substring(0, cut_1.length() - 1);
//        String cut_3 = cut_2.replaceAll(",","");
//
//        String[] word = cut_3.split("");
//
//        // 숫자를 찾는다
//        // {를 만나서 }까지 나타나는 문자를 담아서, int로 변환한다
//        for(int i =0  ; i < word.length ; i++) {
//
//            String pivot = word[i];
//            if(pivot.equals("{")) {
//                int j = i+1;
//
//                String temp = "";
//                while(!word[j].equals("}")) {
//                    temp = temp + word[j];
//                    j++;
//                }
//
//                // 시작지점 변경
//                if(j < word.length) {
//                    i = j;
//                }
//                else {
//                    i = j-1;
//                }
//
//                // 값을 만듬
//                int value = Integer.valueOf(temp);
//
//                // 값을 map에 넣음. count를 증가시킴
//                if (hashMap.containsKey(value)) {
//                    int number = hashMap.get(value);
//                    number++;
//                    hashMap.put(value, number);
//                }
//                else {
//                    // pass
//                }
//            }
//
//        }
//
//        // hash map에 각 숫자별로 카운트 들어가있음
//        // 카운트가 높은거순서로 변경해서 return 해주면됨
//
//        // value 내림차순으로 정렬하고, value가 같으면 key 오름차순으로 정렬
//        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(hashMap.entrySet());
//
//        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                int comparision = (o1.getValue() - o2.getValue()) * -1;
//                return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision;
//            }
//        });
//
//        // 순서유지를 위해 LinkedHashMap을 사용
//        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
//        for(Iterator<Map.Entry<Integer, Integer>> iter = list.iterator(); iter.hasNext();){
//            Map.Entry<Integer, Integer> entry = iter.next();
//            sortedMap.put(entry.getKey(), entry.getValue());
//        }
//
//        sortedMap.forEach((key,value) -> {
//            answerList.add(key);
//            System.out.println(key + " -> " + value);
//        });
//
//        answer = answerList.stream().mapToInt(i -> i.intValue()).toArray();
//
//        return answer;
    }
}