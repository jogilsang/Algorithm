
// Single linked list 에서 뒤에서 k번쨰 원소를 구현한다.
// 맨 끝 원소는 0번쨰 원소이다.

// 원소를 반환할수없을떄 null을 반환할지여부 물어보기
// 러너기법?

public class udemy_7_4 {
    private Node head;
    
    public boolean isPalindrome() {
        
        Node n1 = head;
        Node n2 = head;

        Stack<Integer> s = new Stack<Integer>();

        while(n1 != null && n2.next != null) {
            s.push(n1.data);
            n1 = n1.next;
            n2 = n2.next.next;
        }
        
        // 중간케이스가 odd인경우 skip
        if(n2 != null) {
            n1 = n1.next;
        }

        while(n1 != null) {
            if(s.pop() != n1.data) {
                return false;
            }
            else {
                n1 = n1.next;
            }
        }
        return true;
    }

    public void addToHead(int n) {
        Node newNode = new Node();
        newNode.data = n;
        newNode.next = head;
        head = newNode;
    }

}