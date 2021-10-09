// Single Linked list 에서 중복 데이터 제거하기

// 더블링크드리스트는 검색을 통해 제거가가능
// 싱글링크드리스트는 이전 노드의 값을 알고있어야함

// 1. 중복 데이터를 판별
// 2. 판별됬을 때 해야될 행위
//    2.1. 중복노드제거, 이전노드와 다음노드를 연결
//    2.2. 값을 넣지않는다
// 3. 판별안됬을 떄 해야될 행위
//    3.1. 값을 set에 넣는다
//    3.2. 현재 노드를 이전노드 가리키는것에 매칭한다.
// 4. 공통
//    4.1. 다음노드로 넘어간다

import java.util.HashSet;

public void removeDuplicates(){
    // TODO
    HashSet<Integer> set = new HashSet<Integer>();
    Node prev = null;
    Node n = head;

    while(n != null) {
        // Set의 데이터가 다시 나왔으면 중복
        if(set.contains(n.data)){

            // 현재 노드는 중복노드이므로 버리고, 다음노드를 연결
            prev.next = n.next;

        } else {
            // set에 데이터를 넣고 
            set.add(n);
            prev = n;
        }
        n = n.next;
    }

}

public void addToHead(int n){
    Node newNode = new Node();
    newNode.data = n;
    newNode.next = head;
    head = newNode;
}

public void removeFirst() {
    // ToDo

    if(head == null){
        throw new RuntimeException("Noting to remove");
    }
    head = head.next;
}