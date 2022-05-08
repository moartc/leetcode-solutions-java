package solutions.algorithms._2_Add_Two_Numbers;

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
        ListNode toReturn = l1;
        int val = l1.val + l2.val;
        l1.val = (val) % 10;
        int move = (val) / 10;
        while (l1.next != null || l2.next != null) {
            if(l1.next != null && l2.next != null) {
                val = l1.next.val + l2.next.val + move;
                l1.next.val = val % 10;
                move = val / 10;
                l1 = l1.next;
                l2 = l2.next;
            } else {
                if(l1.next == null) {
                    l1.next = l2.next;
                }
                val = l1.next.val + move;
                l1.next.val = val % 10;
                move = val / 10;
                l1 = l1.next;
                while(l1.next != null) {
                    int v = l1.next.val + move;
                    move = v / 10;
                    l1.next.val = v % 10;
                    l1 = l1.next;
                }
                if(move == 1) {
                    l1.next = new ListNode(1);
                }
                return toReturn;
            }
        }
        if(move == 1) {
            l1.next = new ListNode(1);
        }
        return toReturn;
    }
}
