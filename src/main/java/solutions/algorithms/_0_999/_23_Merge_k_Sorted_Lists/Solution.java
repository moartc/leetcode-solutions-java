package solutions.algorithms._0_999._23_Merge_k_Sorted_Lists;

import commons.ListNode;

import java.util.PriorityQueue;

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

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0 || lists.length == 1 && lists[0] == null) {
            return null;
        }

        // the 3rd solution
        // similar to the 2nd one but instead of adding all nodes, I add only one per list
        PriorityQueue<ListNode> sortedQueue = new PriorityQueue<>(
                (o1, o2) -> o1.val - o2.val
        );

        for (ListNode currentNode : lists) {
            if (currentNode != null) {
                sortedQueue.add(currentNode);
            }
        }

        ListNode resultList = null;
        ListNode pointerToHead = null;
        while (!sortedQueue.isEmpty()) {
            ListNode nodeWithLowestValue = sortedQueue.poll();
            ListNode nextNodeForTheSameList = nodeWithLowestValue.next;
            if (nextNodeForTheSameList != null) {
                sortedQueue.add(nextNodeForTheSameList);
            }
            if (resultList == null) {
                // if not initialized
                resultList = nodeWithLowestValue;
                pointerToHead = resultList;
            } else {
                resultList.next = nodeWithLowestValue;
                resultList = resultList.next;
            }
        }
        return pointerToHead;
    }


    // this is a better solution - beats 40%
    public ListNode mergeKLists_v2(ListNode[] lists) {

        if (lists.length == 0 || lists.length == 1 && lists[0] == null) {
            return null;
        }

        // the 2nd solution
        // similar to the initial one below, but instead of iterating through the whole array, add everything to the sorted queue

        PriorityQueue<Integer> sortedQueue = new PriorityQueue<>(
                (o1, o2) -> o1 - o2
        );
        // initialize map
        for (int i = 0; i < lists.length; i++) {
            ListNode currentNode = lists[i];
            while (currentNode != null) {
                sortedQueue.add(currentNode.val);
                currentNode = currentNode.next;
            }
        }

        ListNode resultList = null;
        ListNode pointerToHead = null;
        while (!sortedQueue.isEmpty()) {
            Integer valueToAdd = sortedQueue.poll();
            ListNode newNode = new ListNode(valueToAdd);
            if (resultList == null) {
                // if not initialized
                resultList = newNode;
                pointerToHead = resultList;
            } else {
                resultList.next = newNode;
                resultList = resultList.next;
            }
        }
        return pointerToHead;
    }


    public ListNode mergeKLists_v1(ListNode[] lists) {

        if (lists.length == 0 || lists.length == 1 && lists[0] == null) {
            return null;
        }

        // the first solution
        // iterate over all current ListNodes, select the lowest one, add its value
        // as a next node and move the node to the next one
        // repeat it until there is at least one non-null node

        ListNode pointerToHead = null;
        ListNode resultList = null;
        while (true) {
            int indexOfListNode = -1;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < lists.length; i++) {
                ListNode currentNode = lists[i];
                if (currentNode != null && currentNode.val < min) {
                    min = currentNode.val;
                    indexOfListNode = i;
                }
            }

            if (min != Integer.MAX_VALUE) { // if found something

                if (resultList == null) {
                    // if not initialized yet
                    resultList = new ListNode(min);
                    pointerToHead = resultList;
                } else {
                    // if initialized, just add next
                    ListNode newNode = new ListNode(min);
                    resultList.next = newNode;
                    resultList = resultList.next;
                }
                // move respective list
                lists[indexOfListNode] = lists[indexOfListNode].next;

            } else {
                // otherwise return what I have
                return pointerToHead;
            }
        }
    }
}