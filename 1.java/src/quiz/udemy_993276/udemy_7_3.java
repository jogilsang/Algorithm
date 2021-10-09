
// Single linked list 뒤집기

public class udemy_7_3 {
    private Node head;
    
    public void reverse() {
        // ToDo
        Node oldHead = head;
        head = null;

        for (Node n = oldHead ; n!=null ;  n=n.next;) {
            addToHead(n.data);
        }
    }

    public void addToHead(int n) {
        Node newNode = new Node();
        newNode.data = n;
        newNode.next = head;
        head = newNode;
    }

    @Override
    public String toString() {
        String str = "[ ";
        for(Node n = head; n!=null; n=n.next) {
            str += n.data;
            str += " ";
        }
        str += "]";
        return str;
    }
}