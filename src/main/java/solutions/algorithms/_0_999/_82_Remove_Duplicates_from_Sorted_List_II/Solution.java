package solutions.algorithms._0_999._82_Remove_Duplicates_from_Sorted_List_II;

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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode toReturn = null;
        boolean firstTime = true;
        ListNode first = head;
        ListNode second = head.next;
        head = null;
        while (second != null) {
            if (first.val != second.val) {
                if (firstTime) {
                    toReturn = new ListNode(first.val);
                    head = toReturn;
                    firstTime = false;
                } else {
                    toReturn.next = new ListNode(first.val);
                    toReturn = toReturn.next;
                }
                first = first.next;
            } else {
                while (second != null && second.val == first.val) {
                    second = second.next;
                }
                first = second;
                if (second == null) {
                    break;
                }
            }
            second = second.next;
        }
        if (first != null) {
            if (toReturn == null) {
                return first;
            } else {
                toReturn.next = new ListNode(first.val);
            }
        }
        return head;
    }
}