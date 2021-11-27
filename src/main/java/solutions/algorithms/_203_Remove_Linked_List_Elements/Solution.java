package solutions.algorithms._203_Remove_Linked_List_Elements;

import commons.ListNode;

class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode headToReturn;
        ListNode first;
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        first = head;
        headToReturn = first;
        while (first != null && first.next != null) {
            if (first.next.val == val) {
                ListNode temp = first.next;
                while (temp != null && temp.val == val) {
                    temp = temp.next;
                }
                first.next = temp;
            }
            first = first.next;
        }
        return headToReturn;
    }
}