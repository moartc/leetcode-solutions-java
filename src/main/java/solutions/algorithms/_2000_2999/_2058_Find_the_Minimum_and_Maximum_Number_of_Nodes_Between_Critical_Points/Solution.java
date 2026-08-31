package solutions.algorithms._2000_2999._2058_Find_the_Minimum_and_Maximum_Number_of_Nodes_Between_Critical_Points;

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

    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int firstCriticalIdx = -1;
        int prevCriticalIdx = -1;
        int minDist = Integer.MAX_VALUE;
        int maxDist = -1;
        int prevVal = head.val;
        head = head.next;

        if (head == null) {
            // just 1 element, quick return
            return new int[]{minDist, maxDist};
        }

        int idxCtr = 1;
        while (head.next != null) {
            int currVal = head.val;
            int nextVal = head.next.val;
            if ((currVal < nextVal && currVal < prevVal) || (currVal > nextVal && currVal > prevVal)) {
                if (prevCriticalIdx != -1) {
                    int distToPrev = idxCtr - prevCriticalIdx;
                    minDist = Math.min(distToPrev, minDist);
                }
                prevCriticalIdx = idxCtr;

                if (firstCriticalIdx != -1) {
                    int distToFirst = idxCtr - firstCriticalIdx;
                    maxDist = Math.max(distToFirst, maxDist);
                } else {
                    firstCriticalIdx = idxCtr;
                }
            }
            prevVal = head.val;
            idxCtr++;
            head = head.next;
        }

        if (maxDist == -1) {
            return new int[]{-1, -1};
        } else {
            return new int[]{minDist, maxDist};
        }
    }
}