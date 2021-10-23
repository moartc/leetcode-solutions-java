package solutions._83_Remove_Duplicates_from_Sorted_List;

import commons.ListNode;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode resultListHead = new ListNode(head.val);
        ListNode currentNodeToCheck = resultListHead;
        while (head != null) {
            while (head != null && currentNodeToCheck.val == head.val) {
                head = head.next;
            }
            if (head != null) {
                currentNodeToCheck.next = new ListNode(head.val);
                currentNodeToCheck = currentNodeToCheck.next;
            }
        }
        return resultListHead;
    }
}