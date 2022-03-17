package solutions.algorithms._234_Palindrome_Linked_List;

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
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        if (head.next.next == null) {
            return head.val == head.next.val;
        }
        int numberOfNodes = countNodes(head);
        int ctr = 0;
        int[] arr = new int[numberOfNodes / 2];
        while (ctr < numberOfNodes / 2) {
            arr[ctr] = head.val;
            head = head.next;
            ctr++;
        }
        if (numberOfNodes % 2 != 0) head = head.next;
        while (head != null) {
            if (arr[--ctr] != head.val) return false;
            head = head.next;
        }
        return true;
    }

    public int countNodes(ListNode head) {
        int ctr = 1;
        while (head.next != null) {
            ctr++;
            head = head.next;
        }
        return ctr;
    }
}