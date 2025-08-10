package solutions.algorithms._0_999._19_Remove_Nth_Node_From_End_of_List;

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

    public ListNode removeNthFromEnd(ListNode head, int n) {

        // special handling for
        if (head.next == null) {
            // only one node, return null
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        // wait n steps and continue iterating until the fast reaches the end
        boolean wasMoved = false;
        int waiting = 0;
        while (fast.next != null) {
            fast = fast.next;
            if (waiting >= n) {
                slow = slow.next;
            }
            waiting++;
        }
        if (waiting < n) {
            // I have to remove head
            return head.next;
        }
        slow.next = slow.next.next;
        return head;
    }


    /*
    Original solution before reading a hint
     */
    public ListNode withoutHint_removeNthFromEnd(ListNode head, int n) {

        if (head.next == null) {
            // only one node, return null
            return null;
        }

        // first count all nodes, then iterate again and exclude this node
        int counter = 1;
        ListNode node = head;
        while (node.next != null) {
            node = node.next;
            counter++;
        }
        // for total number 5 and n = 2 I need to return node 4
        // counter - n +1
        int toRemove = counter - n + 1;

        if (toRemove == 1) {
            // the first node -> head points to the next one
            return head.next;
        }

        // set it again at the beginning
        node = head;
        int nodeCtr = 0;
        while (node != null) {
            nodeCtr++;
            if (nodeCtr + 1 == toRemove) {
                // if the next one is to remove, point the current one to the next next
                node.next = node.next.next;
                return head;
            }
            node = node.next;
        }
        return head;
    }
}