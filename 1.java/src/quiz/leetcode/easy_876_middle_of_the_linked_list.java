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

    // 풀이참조
    public ListNode middleNode(ListNode head) {

            ListNode list2 = head;
            ListNode list1 = head;
            
            while(list2 != null && list2.next != null) {
                list2 = list2.next.next;
                list1 = list1.next;
            }
            
            return list1;

        }
    }

    // 내풀이
    public ListNode middleNode(ListNode head) {
        int count = 0;
        // 길이 구하기
        ListNode pivot = head;
        
        while(head != null) {
            head = head.next;
            count++;
        }
        
        count = count/2 + 1;
        
        while(count-1 != 0) {
            pivot = pivot.next;
            count--;
        }
        return pivot;
    }
}