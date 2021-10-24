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

// solution : 1. 왼쪽으로 하나 이동하고, or연산하고 하는식으로 int반환
//            2. 스택을 선언해서 넣고, 차례로 꺼낸다. 재귀로 푸는 법이있을듯

class Solution {

    class Solution {
        public int getDecimalValue(ListNode head) {
     
            int num = head.val;
            while(head.next != null) {
                num = (num << 1) | head.next.val;
                head = head.next;
            }
            
            return num;
        
        }

    // public int getDecimalValue(ListNode head) {
    //     Stack<ListNode> stack = new Stack<>();
    //     ListNode list = head;
    //     while(list != null) {
    //         stack.push(list);
    //         list = list.next;
    //     }
    //     int sum = 0;
    //     int size = stack.size();
    //     for(int i=0 ; i<size ;i++) {
    //         ListNode node = stack.pop();
    //         int value = (int)Math.pow(2,i) * node.val;
    //         sum = sum + value;
    //     }
    //     return sum;
    // }
}