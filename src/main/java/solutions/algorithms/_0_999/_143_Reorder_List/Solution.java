package solutions.algorithms._0_999._143_Reorder_List;

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

    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        // apparently there is a better approach with reversing the 2nd part of the list and merging
        /*
            for:
            [1,2,3,4,5,6,7,8,9]
            expected:
            [1,9,2,8,3,7,4,6,5]

            after reversing:
            [1,2,3,4,5,9,8,7,6]

            ------------ for the list with even number of elements
            [1,2,3,4,5,6,7,8]
            // reversed
            [1,2,3,4,8,7,6,5]
         */

        // I can find a middle by iterating 2 pointers, one by 1 and the 2nd one by 2
        ListNode middleOrLeft = head;
        ListNode p2 = head;
        while (p2.next != null && p2.next.next != null) {
            middleOrLeft = middleOrLeft.next;
            p2 = p2.next.next;
        }
        // for list with even number of nodes I have the n/2 + 1

        // start reverting from the middle to the end
        // I don't need to connect these 2 lists, I need only the 2nd one reversed
        ListNode prev = middleOrLeft.next;
        ListNode oneWhichShouldPointToPrev = middleOrLeft.next.next;
        // set the next of first elem - so the last one in the reversed list to null
        prev.next = null;
        while (oneWhichShouldPointToPrev != null) {
            ListNode oneForLaterToWhichNextPoints = oneWhichShouldPointToPrev.next;
            oneWhichShouldPointToPrev.next = prev;
            prev = oneWhichShouldPointToPrev;
            oneWhichShouldPointToPrev = oneForLaterToWhichNextPoints;
        }
        // mark it as the end of the first list
        middleOrLeft.next = null;
        // at this point, prev points to the beginning of the 2nd part of reversed list
        // for inial list [1,2,3,4,5], head points to 1 from [1,2,3] and prev to 5 from [5,4]
        // merging part
        ListNode n1 = head;
        ListNode n2 = prev;
        while (n1 != null && n2 != null) {
            ListNode realN1Next = n1.next;
            ListNode realN2Next = n2.next;
            n2.next = n1.next;
            n1.next = n2;
            n1 = realN1Next;
            n2 = realN2Next;
        }
    }

    public void initialIdea_reorderList(ListNode head) {

        // algorithm
        // 1. keep next of the current (start) node in temp,
        // 2. then for start, go to the end and add it as next, keep this end for later
        // 3. move start to the temp from 1.
        // 4. as in the 2nd step, but while finding the last one - iterate until the next one is the one from temp
        ListNode lastAdded = null;
        while (true) {
            ListNode nextForStart = head.next;

            ListNode lastToAdd = head;
            if (lastToAdd.next == lastAdded) {
                lastToAdd.next = null;
                return;
            }
            while (lastToAdd.next != lastAdded) {
                lastToAdd = lastToAdd.next;
            }
            // here toFindNext is the one which should be set as head.next
            head.next = lastToAdd;
            lastAdded = lastToAdd;
            // update next to the last one
            if (lastToAdd == nextForStart) {
                lastToAdd.next = null;
                return;
            }
            lastToAdd.next = nextForStart;
            head = nextForStart;
        }
    }
}