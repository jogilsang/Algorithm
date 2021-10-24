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

// Runtime: 25 ms, faster than 5.09% of Java online submissions for Swapping Nodes in a Linked List.

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head.next == null) return head;
        if(head.next.next == null) {
            int temp = head.next.val;
            head.next.val = head.val;
            head.val = temp;
            return head;
        }
        Stack<ListNode> stack = new Stack<ListNode>();
        
        ListNode targetFront = head;
        ListNode targetBack = head;
        
        while(targetBack.next != null){
            stack.push(targetBack);
            targetBack = targetBack.next;
        }
        
        for(int i=0 ; i<k-1 ; i++){
            targetFront = targetFront.next;
            targetBack = stack.pop();
        }

        int temp = targetBack.val;
        targetBack.val = targetFront.val;
        targetFront.val = temp;
        
        return head;
    }
}