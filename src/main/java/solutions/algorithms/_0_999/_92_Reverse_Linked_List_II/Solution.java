package solutions.algorithms._0_999._92_Reverse_Linked_List_II;

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
    Excluding corner cases (like a list with just 1 element)

    Remember the node before left -> it will point to the last one
    then remember the left node -> it will point to the node after right
    next iterate through the nodes between left and right and reverse them (standard reverse operation)
    at the end
    - the node before left points to the last node,
    - the original left node points to the node after right
     */
    // todo simplify if possible
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (left == right) {
            return head;
        }
        int nodeCtr = 1;
        ListNode oneBeforeLeft = null;
        ListNode originalLeft = null;
        ListNode first = head;
        ListNode second = head.next;

        while (second != null) {

            if (nodeCtr == left - 1) {
                // first node is one before left, and the second is on the left
                oneBeforeLeft = first;
                originalLeft = first.next;
            } else if (nodeCtr == left) {
                originalLeft = first;
            }

            if (nodeCtr >= left && nodeCtr < right) {
                ListNode toGo = second.next;
                second.next = first;
                first = second;
                second = toGo;
                nodeCtr++;
                // do the whole part here
                continue;
            }
            // after the loop above
            if (nodeCtr == right) {
                if (oneBeforeLeft != null) {
                    oneBeforeLeft.next = first;
                    originalLeft.next = second;
                    return head;
                }
                originalLeft.next = second;
                return first;
            }
            first = second;
            second = second.next;
            nodeCtr++;
        }
        originalLeft.next = null;
        if (oneBeforeLeft != null) {
            oneBeforeLeft.next = first;
            return head;
        }
        return first;
    }
}