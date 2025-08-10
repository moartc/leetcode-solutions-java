package solutions.algorithms._0_999._21_Merge_Two_Sorted_Lists;

import commons.ListNode;

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        // point the current node from the new list
        ListNode current;
        ListNode headToReturn;
        // check the first element outside the loop and set head to return
        if (l1.val <= l2.val) {
            current = l1;
            headToReturn = current;
            l1 = l1.next;
        } else { // l1 val > l2.val
            current = l2;
            headToReturn = current;
            l2 = l2.next;
        }
        // iterate through both list until both have elements
        while (l1 != null && l2 != null) {
            ListNode next;
            if (l1.val <= l2.val) {
                next = l1;
                l1 = l1.next;
            } else {
                next = l2;
                l2 = l2.next;
            }
            current.next = next;
            current = current.next;
        }
        // add remaining part iterate through remaining one (if there is such)
        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }
        return headToReturn;
    }

}