/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null) return head;
        ListNode left = head, right = head.next;
        while (right != null && right.next != null) {
            left = left.next;
            right = right.next.next;
        }
        return left;
    }

