# Algorithm

i want to solve all problem in many languages
> [1.java](https://github.com/jogilsang/Algorithm/tree/master/java)   
> [2.kotlin](https://github.com/jogilsang/Algorithm/tree/master/kotlin)

---

## INDEX
- [DataStructure](#datastructure)
    - [Array](#array)
    - [Stack](#stack)
    - [Queue](#queue)
    - [PriorityQueue](#priorityQueue)
    - [LinkedList](#linkedList)
    - [HashMap](#hashMap)
    - [HashSet](#hashSet)
- [Algorithm](#algorithm)
    - [Sorting](#sorting)
    - [Search](#search)
        - [Graphe(Tree,DFS,BFS)](#graphe(Tree,DFS,BFS))
    - [Bruteforce](#bruteforce)
        - [순열(Permutation)](#permutation)
        - [조합(Combination)](#combination)
        - [멱집합(PowerSet)](#powerset)
    - [DP](#dp)
    - [몬테카를로 알고리즘](#몬테카를로%20알고리즘)
- [Syntax](#syntax)
    - [Integer](#integer)
    - [String](#string)
    - [Collections](#collections)
    - [IsPrime](#isPrime)
    - [BIT](#bit)
    - [Comparator](#comparator)
    - [Conversion](#conversion)
    - [MATH](#math)
- [Exception](#exception)
- [Input](#input)
- [Skills](#skills)
- [COMMENT]](#comment)

---

### isPrime
```java
    /**
    *
    * 소수 판별하기
    *
    * @param n : 정수
    * @return true : 소수인경우
    *         false : 소수가 아닌경우
    *
    */
    
    public boolean isPrime(int n) {
        
        int sqrt = (int)Math.sqrt(n);
        
        // 2는 짝수이므로 true
        if(n == 2) {return true;}
        // 1이거나 2로 나눠지면, false
        if(n==1 || n % 2 == 0) {return false;}
        // 제곱근까지 나눠지면,false
        for(int i = 3 ; i < sqrt; i += 2) {
            if( n % i == 0) {
                return false;
            }
        }
        return true;
    }
```

### bit
`BIT 연산에는 산술시프트, 논리시프트 등이 있다`   

>1011 + 0010 = 1101   
1010 >> 1 = 0101   
0010 * 0011 = 0110   
0110 + 0011 = 1001   
0110 ^ 0101 = 0011  (XOR)

```java
// 비트 확인하기
int getBit(int num, int i) {

    int mask = 1 << i ; // i만큼 시프트하면 i 번쨰 비트만 1인 수가 나옴
    return (num & mask != 0) ? 1 : 0 ;

}

// 비트 채우기
int setBit(int num, int i) {
    // 1 << i = 000010000
    // OR연산 : i번째 비트가 1이면 해당 숫자는 바뀌고, 그 외 숫자는 기존값과 동일
    int mask = 1 << i ; // i만큼 시프트하면 i 번쨰 비트만 1인 수가 나옴
    return num | mask;
}

// 비트 지우기
int clearBit(int num, int i) {
   // ~(1 << i) = 1111101111111
   // AND연산 : i번째 비트가 0이면 해당 숫자는 0이되고, 그 외 숫자는 기존값과 동일 
   int mask = ~(1 << i) ; // i만큼 시프트한걸 반전함. 다 1인데 i번쨰 비트만 0으로됨
   return num & mask;
}

// 2의 제곱수 판별하기
boolean isPowerOf2(int i) {
    return (i & (i - 1)) == 0 ;
}

// 두 수가 비트가 몇개가 다른지 구하기
int count(int a, int b) {
        int diff = a^b;
        int count = 0;

        while(diff != 0 ) {
            diff = diff & (diff-1);
            count++;
        }
        return count ;
}

```

### sorting
- [BaseSort.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/BaseSort.java)
- [BubbleSort.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestBubbleSort.java)
- [MergeSort.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestMergeSort.java)
- [MergeSort2.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestMergeSort2.java)
- [QuickSort.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestQuickSort.java)
- [SelectionSort.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestSelectionSort.java)
- [InsertionSort.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestInsertionSort.java)

### [queue](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestQueue.java)
`Queue는 FIFO(First In First Out) 구조의 자료구조`   
Queue는 interface이기떄문에, new로 생성하지못한다   
offer, poll, peek 사용을 권장한다.   
(add,remove,element를 쓴다면 try,catch 해야한다) 

- [두개의 Stack으로 Queue만들기](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/quiz/udemy_993276/udemy_9_2.java)

> Prioity Queue는 Queue인터페이스의 구현체이다.   

```java
import java.util.Queue;
import java.util.LinkedList;
Queue<Integer> queue = new LinkedList<>();
Queue<Integer> queue = new LinkedList<>(Arrays.asList(1,2,3,4,5));

// Method
add(), offer() : 추가 - O(logn) 
remove(), poll(): 제거 - O(logn) 
element(), peek() : 제거 없이 읽기 - O(1)
size() : 크기 - O(1)
```
### [stack](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestStack.java)
`Stack : LIFO(Last In First Out) 구조의 자료구조`
- [Stack 정렬하기](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestStackSort.java)

```java
import java.util.Stack;
Stack<Integer> stack = new Stack<>();

// method
추가 : push()
제거 : pop()
제거 없이 읽기 : peek()
비었는지 검사 : empty()
```

### bruteforce
#### permutation
`순열 : 순서가 있도록 모든 경우의 수를 뽑아내는 것 => n! / (n-r)!`   
`EX : {1,2,3}과 {3,2,1}은 다른 것`
```java
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1, 2, 3};
        int[] output = new int[n];
        boolean[] visited = new boolean[n];

        perm(arr, output, visited, 0, n, 3);
    }

    // 순열
    public static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {

        if(depth == r) {
            print(output);
            return ;
        }

        for(int i = 0 ; i < n ; i++) {
            if(!visited[i]){
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr,output,visited,depth + 1 ,n ,r);
                visited[i] = false;
            }
        }

    }
```
참조 :   
- [부분집합_재귀함수_순열 구하기 (JAVA)](https://codevang.tistory.com/298)

#### combination
`조합 : 순열과 달리 순서가 필요없어서 중복을 허용하지 않는 것 => n! / r! * (n-r)!`   
`EX : {1,2,3}과 {3,2,1}은 같은 것`
```java

    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1, 2, 3};
        int[] output = new int[n];
        boolean[] visited = new boolean[n];

        comb1(arr, visited, 0, 3);
    }

    // 조합
    // exec : comb1(arr, visited, 0, 3);
    // 백트래킹
    public static void combination(int[] arr, boolean[] visited, int start, int n, int r) {

        if(r == 0 ) {
            print(arr,visited,n);
            return ;
        }

        for(int i = start ; i < n ; i++) {
            visited[i] = true;
            combination(arr,visited,i+1,n , r-1);
            visited[i] = false;
        }

    }
```
참조 :   
- [부분집합_재귀함수_조합 구하기 (JAVA)](https://codevang.tistory.com/297)

#### powerset
`멱집합`
```java
```
참조 :
- [부분집합_재귀함수_멱집합 구하기 (JAVA)](https://codevang.tistory.com/291)

### graphe(Tree,DFS,BFS)

> - [코딩테스트 연습 깊이/너비 우선 탐색(DFS/BFS) 타겟 넘버](https://programmers.co.kr/learn/courses/30/lessons/43165)   

- [BinarySearch.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestBinarySearch.java)
- [BinarySearchTree.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestBinarySearchTree.java)
- [InPrePostOrder.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestInPrePostOrder.java)
- [DFSBFS.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestDFSBFS.java)
- [DFSBFS_array.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestDFSBFS_array.java)

### dp

### 몬테카를로 알고리즘
- WHAT  
이름의 유래는 미국의 라스베가스같은 도박도시, 모나코의 몬테카를로에서 유래됬다
무작위 난수를 무한히 생성해서 구하고자 하는 정보의 확률을 계산하는 알고리즘
- WHY   
현실에서 문제를 풀어내기위해 얻을 수 있는 데이터는 매우 적고 한정적이다.실제값에 근사하게 되는 구조   
- HOW   
단순한 모델에 대해서 수많은 케이스로 실험을 할경우 얻어지는 값이 실제값에 근사하게되는 구조이다
    ```
    몬테카를로 방법은 다양하지만 특정한 패턴을 따르는 경향이 있다.
    1. 가능한 입력의 도메인을 정의한다.
    2. 도메인에 대한 확률 분포에서 임의로 입력을 생성한다.
    3. 입력에 대한 결정론적인 계산을 수행한다.
    4. 결과를 집계한다.
    ```

### Exception
```java
// 제거할 것이 없을경우
throw new RuntimeException("Noting to remove")
```

### datastructure
### [array](https://devdocs.programmers.co.kr/references/java/docs/api/java.base/java/util/Arrays.html)
```java
// char 배열선언하기
int[] arr1 = new int[10];
char[] arr2 = "Good".toCharArray();

// array 정렬, 배열 정렬
int[] array = new int[]{1,2,5,4,3};
Arrays.sort(array);

// char을 int로 변환하기
char c1 = '9';
int i1 = c1 - '0'; // 57 - 48 = 9

// 배열 원소 탐색, 비교
boolean result = Arrays.stream(intArr)
        .allMatch(a -> a%2 == 0);
System.out.println("2의 배수? " result);

boolean result = Arrays.stream(intArr)
        .anyMatch(a -> a%3 == 0);
System.out.println("3의 배수가 하나라도 있나? " result);

boolean result = Arrays.stream(intArr)
        .noneMatch(a -> a%3 == 0);
System.out.println("3의 배수가 없나? " result);

// 2차원 배열, 첫번째 행 기준 오름차순 정렬
        int[][] users = new int[a][2];     
  
        Arrays.sort(users, new Comparator<int[]>() {
            @Override
            public int compare(final int[] entry1, final int[] entry2) {
                final Integer time1 = entry1[0];
                final Integer time2 = entry2[0];
                return time1.compareTo(time2);
            }
        });

Arrays.sort(a, Collections.reverseOrder());
int index = Arrays.binarySearch(arr, "asdfasf");

// Integer list int array
int[] arr = list.stream().mapToInt(i -> i).toArray();
```
---

### Integer
```java
// IntegerCache 클래스에서 ~128부터 127까지는 auto-boxing이 되도록 관리
// Integer도 객체이기때문에, == 연산자가 아닌 intValue() 메소드를 사용해서 주소값이 아닌 실제 값을 비교해야한다.
// source : https://meetup.toast.com/posts/185
```

### [string](https://devdocs.programmers.co.kr/references/java/docs/api/java.base/java/lang/String.html)
```java
length() : 문자열의 길이. array와 collection의 길이가 다다름
equals(String s) : 다른 문자열과 같은지 비교
charAt(int i) : i번째 글자
toCharArray() : char[]로 변환
substring(int beginIndex, int endIndex) : 문자열 일부 잘라오기
replaceAll(String reg, String replacement) : 특정 문자열 모두 교체
split(String reg) : 주어진 글자로 잘라서 String[] 변환, String <-> String[] 
trim() : 문자열 앞뒤의 공백문제를 제거
toUpperCase() : 모두 대문자로 변환
String.valueOf(param) : 다른 자료형을 문자열로 변경

// example
"sdf".length() = 3
"sdf".charAt(0)="s"
"sdf".split("")=["s","d","f"];
"sdf".substring(0,1) = "s"
"sdf".toUpperCase() = "SDF"
"sdf ".trim() = "sdf"
"sdf".replaceAll("s", "t") = "tdf"
"sdf".toCharArray() = ["s","d","f"]
"sdf".equals("fff") = false

StringBuffer sb = new StringBuffer();
sb.append("hello");
sb.append(" ");
sb.append("world");
System.out.println(sb.toString());

// char -> String
Char c = 'a';
String strC = String.valueOf(c);
```

### [collections](https://devdocs.programmers.co.kr/references/java/docs/api/java.base/java/util/Collections.html)
```java
import java.utils.Collections;

Collections.sort(list); // 오름차순 정렬
Collections.sort(list, Collections.reverseOrder()); // 오름차순 정렬
Collections.rotate(list, 2); // 오른쪽으로 2칸 이동, [4,5,1,2,3]
Collections.swap(list 0, 2); // index간 교환 [1,5,4,2,3]
Collections.replaceAll(list, 2, 1); // [1,5,4,1,3]
if(Collections.disjoint(list, newList)) System.out.println("공통요소가 없으면 true");
int index = Collections.binarySearch(list, 3); // 5

```

### [linkedlist](https://devdocs.programmers.co.kr/references/java/docs/api/java.base/java/util/ArrayList.html)
`ArrayList : 배열을 사용해서 List를 구현한 클래스`
`LinkedList : 노드를 연결하는 방식의 List를 구현한 클래스`
```java
// example
import java.utils.ArrayList;
import java.util.LinkedList;

LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
arrayList.add(5); //[5]
arrayList.add(3); //[5,3]
arrayList.set(0, 7); //[7,3]
arrayList.remove(0); //[3]
arrayList.size(); // 1

if(arrayList.contains(3)) System.out.println("포함되면 출력");
int index = arrayList.indexOf(3);

// ---------------------------

// Set <-> List 셋 리스트 변환
Set dataSet = new HashSet();
List dataList = new ArrayList(dataSet); 

// arrayList <-> array , 리스트 배열 변환
long[] answer = {};
ArrayList<Long> answerList = new ArrayList<>();
answer = answerList.stream().mapToLong(p -> p.longValue()).toArray();
return answer;

// arraylist 정렬, list 정렬, 리스트 정렬
ArrayList<Integer> arrayList = new ArrayList<>();        
// 거꾸로 정렬
Collections.reverse(arrayList);
// 가장 낮은거에서 높은곳으로, 오름차순 정렬(ascending)
Collections.sort(arrayList);

// 배열복사
int[] data = new int[100];
int[] oldData = data;
data = new int[data.length * 2];
System.arraycopy(oldData,0,data,0, oldData.length);

```

### [math](https://devdocs.programmers.co.kr/references/java/docs/api/java.base/java/lang/Math.html)
```java
import java.lang.Math;

System.out.println(Math.abs(-10)); // 절대값
System.out.println(Math.max(10,100)); // 100
System.out.println(Math.min(10,-10)); // -10
System.out.println((int)(Math.random() * 10)); // 0~9 난수

```
### [hashSet](https://devdocs.programmers.co.kr/references/java/docs/api/java.base/java/util/HashSet.html)
```java
// HashSet : Set 인터페이스를 구현한 Set 클래스
import java.util.HashSet;
HashSet<Integer> hashSet = new HashSet<>();

hashSet.add(5); // 5
hashSet.add(3); // 5, 3
hashSet.add(3); // 5, 3
hashSet.add(3); // 5, 3
hashSet.add(1); // 5, 3, 1

if(hashSet.contains(1)) System.out.println("true");

```
```java
// 해시셋 전체순환(해시셋 반복자)
        HashSet<String> hashSet = new HashSet<>();
        Iterator<String> it = hashSet.iterator(); 
        while (it.hasNext()) {
            String temp = it.next();
        }
```

### [hashMap](https://devdocs.programmers.co.kr/references/java/docs/api/java.base/java/util/HashMap.html)
`HashMap : Map 인터페이스를 구현한 Map 클래스. key와 value로 구성된 Entry객체를 저장하는 구조의 자료구조`
```java
// example
HashMap<String, Integer> map1 = new HashMap<>();
// key의 sort 순서
TreeMap<String, Integer> map2 = new TreeMap<>();
// put했던 순서
LinkedHashMap<String, Integer> map3 = new LinkedHashMap<>();

if(map1.isEmpty()) System.out.println("map이 비어있음");

map1.put("key2", 1);
map1.put("key3", 3);
map2.put("key11", 55); 
map2.put("key22", 11);
map2.put("key33", 33);
map1.putAll(map2);
map1.remove("key3"); 
map1.get("key1"); // 5
if(map1.containsKey("key3")); // false
if(map1.containsValue(55); // true

map1.replace("key22", 44);
if(map1.replace("key22", 44, 55)); // true
if(map1.replace("key22", 11, 66)); // false
```
```java
// hashmap <-> array, 해시맵 배열 변환
Set<String> keys = map1.keySet();
Collection<Integer> values = map1.values();
String[] arrayString = {};
int[] arrayInteger = {};
HashMap<String,Integer> hashMap = new HashMap();  
arrayString = hashMap.keySet().toArray(); // returns an array of keys
arrayInteger = hashMap.values().toArray(); // returns an array of values
arrayString = keys.toArray(); // returns an array of keys
arrayInteger = values.toArray(); // returns an array of values

hm.put(key, hm.getOrDefault(key, 0) + 1);

// 해시맵 순환(해시맵 반복)
       HashMap<String,Integer> hashMap = new HashMap(); 

        for( Map.Entry<String, Integer> elem : hashMap.entrySet() ){
            String key = elem.getKey();  
            int value = elem.getValue();
        }

       for(String key : hashMap.keySet()) {
           System.out.print(key));
           System.out.print(hashmap.get(key));
       }
```

### [priorityQueue](https://devdocs.programmers.co.kr/references/java/docs/api/java.base/java/util/PriorityQueue.html)
`Heap을 이용하여 구현한 우선순위 큐, O(nlogn)`
```java
import java.util.PriorityQueue;

PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); // 우선순위 낮은순
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위 높은순

priorityQueue.offer(5);
priorityQueue.poll(); // 5

```

### [comparator](https://devdocs.programmers.co.kr/references/java/docs/api/java.base/java/util/Comparator.html)
https://st-lab.tistory.com/112   
https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html   

### conversion
```java
// Double a -> Integer b
    a.intValue()
    b.doubleValue()
```
---

### input
- 일반적인 입력형식
```java
        // java
        // 입력형식, 100 1000 50
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // kotlin
        // 입력형식
        var str = readLine().toString()
        var A = str.split(" ").get(0).toLong()// 1000
        var B = str.split(" ").get(1).toLong() // 70
        var C = str.split(" ").get(2).toLong() // 170
```

### - 공백 입력형식
```java
         // 입력형식
        Scanner sc = new Scanner(System.in);

        // ex : 3 5 6 2 4
        // 첫 번째 행에 공백(space)을 구분자로 숫자가 주어진다
        // 각 숫자는 한 자리 숫자로 주어진다 (0과 같거나 크고, 10보다 작은 숫자)
        // 같은 숫자가 중복되어 나타나지 않는다
        String input = sc.nextLine();
        String[] splitInput = input.split(" ");
        int[] arr = new int[splitInput.length];
        
        int count = 0;
        for(String value : splitInput) {
            arr[count++] = Integer.valueOf(value);
        }
```

### - 2차원 배열 입력형식
```java
        // 입력형식
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[][] users = new int[a][2];

        for(int p = 0 ; p < a ; p++) {
            int b = sc.nextInt();
            int c = sc.nextInt();

            users[p][0] = b;
            users[p][1] = c;
        }
```

### - 숫자입력 후 문자입력 
```java
        // 입출력 받음
        // (개행문자 제거해야 오류 발생안함)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 개행문자 제거
        String b = sc.nextLine();
```

### skills
ICN SFO ATL ICN ATL SFO"    
ICN ATL SFO ATL ICN SFO"   
```java
//답들 중 가장 알파벳순이 빠른 배열들로 정렬
Collections.sort(answers); 
//가장 빠른 배열을 뽑아서 String형 배열로 만듬
String[] answer = answers.get(0).split(" ");    
```

["3", "30", "1"] -> 3303 -> o   
["30", "3", "1"] -> 3031 -> x
```java
// 숫자를 담은 문자열 배열을 내림차순으로 얻는방법
// 가장 큰 수를 구할 수 있음
Collections.sort(strList, (a,b)->(b+a).compareTo(a+b));
```

특정 정수를 잘라서 사용하고 싶을 때     
```java
// %10, /10
while(value !=0 ){
   remain = value % 10 ;
   value /= 10;
}
```

문자열의 substring을 배열에 적용하고싶다면
```java
String[] test = "asdfdsafadsfasdf";
Arrays.copyOfRange(test, 0, 5);
```

문자열의 2진연산
```java
String a = "100";
String b = "101";
int aInt = Integer.parseInt(a, 2); 
int bInt = Integer.parseInt(b, 2); 
int sum = aInt + bInt; 

return Integer.toBinaryString(sum);
```


### comment
```java
// Init
/**
 * Init
 * @author
 * @copyright
 * @license
 * @version
 * @see
 * @see
 * @todo 
 * @link 
 * 
 * Method
 * @param
 * @return
 */

/**
 * 별(*)를 a번 반복한 문자열을 b번 반복한 뒤, 출력한다.
 *
 * @param {Int} a 별(*)를 반복하는 횟수(=StarRow.length)
 * @param {Int} b 반복된 별(*)을 개행할 횟수
 * @return {StringBuffer} StarSquare 출력 시, 별(*)이 a*b 로 구성된 문자열
 */
```

---

### Reference
- [backjoon](https://www.acmicpc.net/)
  - [알고리즘 기초 1/2](https://code.plus/course/41) 
  - [알고리즘 기초 2/2](https://code.plus/course/42)
  - [알고리즘 중급 1/2](https://code.plus/course/43)
  - [알고리즘 중급 2/2](https://code.plus/course/44)
  - [알고리즘 중급 3/2](https://code.plus/course/45)
- [programmers](https://programmers.co.kr/)
- [project-euler](https://euler.synap.co.kr/)
- [Codewars](https://www.codewars.com/)
- [Leetcode](https://leetcode.com/)  
    - (14). [longest-common-prefix](https://leetcode.com/problems/longest-common-prefix)
        - 주어진 배열의 일치하는 접두사의 최대값 구하기
            - key : 오름차순 정렬로 문자열의 최소길이값 구하기
            - key : prefix의 최대값은 최소길이값
    - (26). [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
        - i번째랑 i+1번째랑 비교하는 것, 첨자를 1부터 사용하는 것
    - (27). [Remove Element](https://leetcode.com/problems/remove-element/)
        - 일치하지않을경우 첨자를 0으로 시작해서, 값을 넣음
    - (28) [Implement strStr()](https://leetcode.com/problems/implement-strstr/)
        - 일치하지않을경우 첨자를 0으로 시작해서, 값을 넣음
- [HackerRank](https://www.hackerrank.com/)   
- [Codility](https://www.codility.com/)   
- [Udemy](https://www.udemy.com/)
   


 


