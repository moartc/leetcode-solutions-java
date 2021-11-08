package solutions._160_Intersection_of_Two_Linked_Lists;

import commons.ListNode;

import java.util.*;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA.equals(headB)) {
            return headA;
        }
        List<ListNode> listA = new ArrayList<>();
        listA.add(headA);
        while (headA.next != null) {
            headA = headA.next;
            listA.add(headA);
        }
        List<ListNode> listB = new ArrayList<>();
        listB.add(headB);
        while (headB.next != null) {
            headB = headB.next;
            listB.add(headB);
        }
        int indexA = listA.size() - 2;
        int indexB = listB.size() - 2;

        if (!listA.get(indexA + 1).equals(listB.get(indexB + 1))) {
            return null;
        }
        while (indexA >= 0 && indexB >= 0) {
            if (listA.get(indexA).equals(listB.get(indexB))) {
                indexA--;
                indexB--;
            } else {
                return listA.get(indexA + 1);
            }
        }
        return listA.get(indexA + 1);
    }
}