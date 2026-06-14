package solutions.algorithms._2000_2999._2130_Maximum_Twin_Sum_of_a_Linked_List;

import commons.ListNode;

import java.util.ArrayList;
import java.util.List;

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

    public int pairSum(ListNode head) {

        // without using additional list

        int listSize = 0;
        ListNode headToMove = head;
        while (headToMove != null) {
            listSize++;
            headToMove = headToMove.next;
        }
        // so I have a list size here. for (let's say) 4 I need to set 2 (0-based) (n/2) as the end of the 2nd part

        int nodeIdx = 0;
        headToMove = head;
        ListNode prev = null;
        while (headToMove != null) {
            if (nodeIdx < listSize / 2) {
                headToMove = headToMove.next;
            } else if (nodeIdx == listSize / 2) {
                // head found
                prev = headToMove;
                headToMove = headToMove.next;
            } else if (prev != null) { // I'm in the 2nd half
                ListNode realNext = headToMove.next;
                headToMove.next = prev;
                prev = headToMove;
                headToMove = realNext;
            }
            nodeIdx++;
        }
        // here prev should point on the last node
        int ctr = 0;
        int maxFound = Integer.MIN_VALUE;

        while (ctr < listSize / 2) {
            int f = head.val;
            int s = prev.val;
            maxFound = Math.max(maxFound, f + s);
            head = head.next;
            prev = prev.next;
            ctr++;
        }
        return maxFound;
    }


    public int pairSum2(ListNode head) {

        // add all values to a list and then iterate again and check

        List<Integer> allValues = new ArrayList<>();
        while (head != null) {
            allValues.add(head.val);
            head = head.next;
        }

        int maxFound = Integer.MIN_VALUE;
        for (int i = 0; i < allValues.size() / 2; i++) {
            int f = allValues.get(i);
            int s = allValues.get(allValues.size() - 1 - i);
            maxFound = Math.max(maxFound, f + s);
        }
        return maxFound;
    }
}