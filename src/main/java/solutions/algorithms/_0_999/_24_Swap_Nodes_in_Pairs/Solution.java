package solutions.algorithms._0_999._24_Swap_Nodes_in_Pairs;

import commons.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode toReturn = head.next;
        ListNode current = head;
        ListNode prev = null;
        while (current != null && current.next != null) {
            ListNode nextToHandle = current.next.next;
            current.next.next = current;
            if (prev != null) {
                prev.next = current.next;
            }
            prev = current;
            current.next = nextToHandle;
            current = nextToHandle;
        }
        return toReturn;
    }
}