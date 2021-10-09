

// Single Linked list 구현하기

// addToHead(n)
// 리스트의 head에 노드를 추가
// node.data는 n으로 설정

// removeFirst()
// 리스트의 첫 노드 제거
// 제거할 것이 없으면 runtime exception발생

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