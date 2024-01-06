package solutions.algorithms._0_999._206_Reverse_Linked_List;

import commons.ListNode;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode prev = head;
        ListNode current = head.next;
        ListNode next = current.next;
        prev.next = null;
        while (next != null && next.next != null) {
            current.next = prev;
            prev = current;
            current = next;
            next = next.next;
        }
        current.next = prev;
        if (next != null) {
            next.next = current;
            return next;
        } else {
            return current;
        }
    }
}