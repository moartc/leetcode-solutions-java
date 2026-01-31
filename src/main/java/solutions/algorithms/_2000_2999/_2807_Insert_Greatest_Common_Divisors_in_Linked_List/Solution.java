package solutions.algorithms._2000_2999._2807_Insert_Greatest_Common_Divisors_in_Linked_List;

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
    just calculating gcd plus inserting it into the list
     */
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        var p = head;

        while (p.next != null) {
            var newNode = new ListNode(gcd(p.val, p.next.val), p.next);
            p.next = newNode;
            p = newNode.next;
        }
        return head;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}