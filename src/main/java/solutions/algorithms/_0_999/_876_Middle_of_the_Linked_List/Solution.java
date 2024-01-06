package solutions.algorithms._0_999._876_Middle_of_the_Linked_List;

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
    public ListNode middleNode(ListNode head) {

        ListNode iterator = head;
        int counter = 1;
        while (iterator.next != null) {
            iterator = iterator.next;
            counter++;
        }
        counter = counter / 2;
        while (counter-- > 0) {
            head = head.next;
        }
        return head;
    }
}