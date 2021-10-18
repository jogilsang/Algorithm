/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode reverse = null;
        while(head != null) {
            // 현재값의 next를 null 또는 reverse를 바라보도록
            ListNode newNode = new ListNode(head.val);
            newNode.next = reverse;
            reverse = newNode;
            // 다음으로 넘어감
            head = head.next;
        }
        return reverse;
    }
}