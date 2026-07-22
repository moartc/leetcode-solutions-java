package solutions.algorithms._0_999._61_Rotate_List;

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
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int ctr = 1;
        ListNode temp = head;
        while (temp.next != null) {
            ctr++;
            temp = temp.next;
        }

        int toChange = k % ctr;
        if (toChange == 0) {
            return head;
        }
        int toMoveOutside = ctr - toChange;
        int ctr2 = 1;
        ListNode tmp2 = head;
        while (ctr2 < toMoveOutside) {
            ctr2++;
            tmp2 = tmp2.next;
        }
        ListNode tmp2Next = tmp2.next;
        tmp2.next = null;
        // temp points to the last node
        temp.next = head;
        return tmp2Next;
    }
}