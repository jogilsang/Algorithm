


class Solution {
    // 내 풀이
    // NullPointerException
    public ListNode deleteDuplicates(ListNode head) {
        if(head != null && head.next != null) {
            ListNode first = head;
            while(head.next != null) {
                if(head.val == head.next.val) {
                    head.next = head.next.next;
                }
                head = head.next;
            }
            return first;
        }
        else {
            return head;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode cur = head;
        while (cur.next != null){
            if (cur.val == cur.next.val){
                cur.next = cur.next.next;
            }
            else {
                cur = cur.next;
            }
        }
        return head;
        
    }
}