package solutions.algorithms._2000_2999._2095_Delete_the_Middle_Node_of_a_Linked_List;

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
    /*
    Just iterate once and count nodes
     then iterate to the middle (actually to the one before) and delete that node
     */
    public ListNode deleteMiddle(ListNode head) {

        if (head.next == null) {
            return null;
        }

        int ctr = 0;
        ListNode h = head;
        while (h != null) {
            h = h.next;
            ctr++;
        }

        ctr = ctr / 2;
        h = head;
        while (ctr - 1 > 0) {
            h = h.next;
            ctr--;
        }
        h.next = h.next.next;
        return head;
    }
}