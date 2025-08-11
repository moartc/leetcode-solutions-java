package solutions.algorithms._0_999._2_Add_Two_Numbers;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode toReturn = null;
        ListNode newList = null;
        boolean initialized = false;
        int quotient = 0;
        while (l1 != null || l2 != null) {

            int fv = l1 != null ? l1.val : 0;
            int sv = l2 != null ? l2.val : 0;
            int sum = fv + sv;
            int toAdd = (quotient + sum) % 10;
            quotient = (quotient + sum) / 10;
            ListNode newNode = new ListNode(toAdd);
            if (!initialized) {
                toReturn = newNode;
                newList = newNode;
                initialized = true;
            } else {
                newList.next = newNode;
                newList = newList.next;
            }
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        
        if (quotient != 0) {
            ListNode newNode = new ListNode(quotient);
            newList.next = newNode;
        }
        return toReturn;
    }
}
