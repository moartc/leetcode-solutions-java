package solutions.algorithms._21_Merge_Two_Sorted_Lists;

import commons.ListNode;

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode ptrHead;
        ListNode ptrTmp;
        ListNode first;
        ListNode second;
        if (l1.val > l2.val) {
            first = l2;
            second = l1;
        } else {
            first = l1;
            second = l2;
        }
        ptrHead = first;
        while (true) {
            if (first.next == null) {
                first.next = second;
                return ptrHead;
            }
            if (first.next.val <= second.val) {
                first = first.next;
            } else {
                ptrTmp = first.next;
                first.next = second;
                second = ptrTmp;
            }
        }
    }
}