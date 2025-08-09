package solutions.algorithms._0_999._206_Reverse_Linked_List;

import commons.ListNode;

class Solution {
    public ListNode reverseList(ListNode head) {

        // there is no or only one element
        if (head == null || head.next == null) {
            return head;
        }

        // case for 2 also has a special handling
        // set original head.next to null
        // and assign original head as a next of this 2nd element and return it
        ListNode current = head.next;
        if (current.next == null) {
            current.next = head;
            head.next = null;
            return current;
        }

        // there are at least 3 elements
        ListNode prev = head;
        // second already defined
        ListNode next = current.next;

        // first set prev.next to null
        prev.next = null;
        while (next != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        // handle last node
        return prev;
    }
}