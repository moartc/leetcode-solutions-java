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
        int counter = 1;
        ListNode iterator = head;
        while (iterator.next != null) {
            iterator = iterator.next;
            counter++;
        }
        int toRemove = counter - n;
        counter = 0;
        iterator = head;
        while (counter < toRemove - 1) {
            iterator = iterator.next;
            counter++;
        }
        if(toRemove == counter) {
            return iterator.next;
        }else {
            iterator.next = iterator.next.next;
        }
        return head;
    }
}