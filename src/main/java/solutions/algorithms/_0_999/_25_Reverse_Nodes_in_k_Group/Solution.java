package solutions.algorithms._0_999._25_Reverse_Nodes_in_k_Group;

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

    // beats ~30%
    public ListNode reverseKGroup(ListNode head, int k) {

        if (k == 1 || head.next == null) {
            return head;
        }

        ListNode l = head;
        int ctr = 0;
        while (l != null) {
            l = l.next;
            ctr++;
        }
        int nrOfGroupsToReverse = ctr / k;
        int reversedGroups = 0;

        ListNode prev = head;
        ListNode current = prev.next;
        ListNode next = null;

        // points to the last from the first group;
        ListNode toReturn = null;

        // to handle the first node
        ListNode lastInPrevGroup = head;
        ListNode lastInCurrentGroup = head;
        int counterInGroup = 1;
        while (reversedGroups != nrOfGroupsToReverse) {

            counterInGroup++;

            // store next for later
            next = current.next;

            if (counterInGroup == 1) {
                // the first in group which then is at the end and should be connected to the new group
                lastInCurrentGroup = current;
            } else if (counterInGroup == k) {
                if (toReturn == null) {
                    toReturn = current;
                } else {
                    // here I can connect it to the lastInPrevGroup
                    lastInPrevGroup.next = current;
                    lastInPrevGroup = lastInCurrentGroup;
                }
                reversedGroups++;
                counterInGroup = 0;
            }
            current.next = prev;
            prev = current;
            current = next;
        }

        // assign reset of elements or null
        lastInCurrentGroup.next = next;
        return toReturn;
    }
}