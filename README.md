# Algorithm

i want to solve all problem in many languages
> [1.java](https://github.com/jogilsang/Algorithm/tree/master/java)   
> [2.kotlin](https://github.com/jogilsang/Algorithm/tree/master/kotlin)

---

## INDEX
 - [Sort](#+%20Sort)
 - [Queue](#+%20Queue)
 - [Stack](#+%20Stack)
 - [bruteforce](#+%20bruteforce)
 - [Graphe(Tree,DFS,BFS)](#+%20Graphe(Tree,DFS,BFS))
 - [DP](#+%20DP)

- [Syntax](#Syntax)
    - [String](#String)

---

### + Sort
- [BaseSort.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/BaseSort.java)
- [BubbleSort.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestBubbleSort.java)
- [MergeSort.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestMergeSort.java)
- [MergeSort2.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestMergeSort2.java)
- [QuickSort.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestQuickSort.java)
- [SelectionSort.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestSelectionSort.java)
- [InsertionSort.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestInsertionSort.java)

### + [Queue](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestQueue.java)
`Queue는 FIFO(First In First Out) 구조의 자료구조`
Queue는 interface이기떄문에, new로 생성하지못한다   
offer, poll, peek 사용을 권장한다.   
(add,remove,element를 쓴다면 try,catch 해야한다)   
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
### + [Stack](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestStack.java)
`Stack : LIFO(Last In First Out) 구조의 자료구조`

```java
import java.util.Stack;
Stack<Integer> stack = new Stack<>();

// method
추가 : push()
제거 : pop()
제거 없이 읽기 : peek()
비었는지 검사 : empty()
```

### + bruteforce
### + Graphe(Tree,DFS,BFS)
- [BinarySearch.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestBinarySearch.java)
- [BinarySearchTree.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestBinarySearchTree.java)
- [InPrePostOrder.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestInPrePostOrder.java)
- [DFSBFS.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestDFSBFS.java)
- [DFSBFS_array.java](https://github.com/jogilsang/Algorithm/blob/master/1.java/src/data_structure/TestDFSBFS_array.java)
### + DP

### Syntax
```java
// char 배열선언하기
int[] arr1 = new int[10];
char[] arr2 = "Good".toCharArray();

// ArrayList : 배열을 사용해서 List를 구현한 클래스
import java.util.ArrayList;
ArrayList<Integer> arrayList = new ArrayList<>();
LinkedList<Integer> linkedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

// LinkedList : 노드를 연결하는 방식의 List를 구현한 클래스
import java.util.LinkedList;
LinkedList<Integer> linkedList = new LinkedList<>(); 
LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

// HashMap : Map 인터페이스를 구현한 Map 클래스. key와 value로 구성된 Entry객체를 저장하는 구조의 자료구조
import java.util.HashMap;
HashMap<String, Integer> hashMap = new HashMap();

// HashSet : Set 인터페이스를 구현한 Set 클래스
import java.util.HashSet;
HashSet<Integer> hashSet = new HashSet<>();

// PriorityQueue : Heap을 이용하여 구현한 우선순위 큐
import java.util.PriorityQueue;
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); // 우선순위 낮은순
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위 높은순
```

### String
```java
length() : 문자열의 길이. array와 collection의 길이가 다다름
equals(String s) : 다른 문자열과 같은지 비교
charAt(int i) : i번째 글자
toCharArray() : char[]로 변환
substring(int beginIndex, int endIndex) : 문자열 일부 잘라오기
toUpperCase() : 모두 대문자로 변환
replaceAll(String reg, String replacement) : 특정 문자열 모두 교체
split(String reg) : 주어진 글자로 잘라서 String[] 변환
trim() : 문자열 앞뒤의 공백문제를 제거
```



---

Reference
=============

- [backjoon](https://www.acmicpc.net/)
- [programmers](https://programmers.co.kr/)
- [project-euler](https://euler.synap.co.kr/)
- [Codewars](https://www.codewars.com/)
- [Leetcode](https://leetcode.com/)  
- [HackerRank](https://www.hackerrank.com/)   
- [Codility](https://www.codility.com/)   
- [Udemy](https://www.udemy.com/)
   


 


