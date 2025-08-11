package solutions.algorithms._0_999._138_Copy_List_with_Random_Pointer;
// Definition for a Node.

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


class Solution {
    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }
        /*
        1. Iterate the first time, create a regular nodes (copy) after the original one
        2. Iterate the second time to set random nodes
        3. Iterate the last time to delete original nodes
        */

        Node realHead = head;

        while (head != null) {
            // create a new node
            Node newNode = new Node(head.val);
            Node nodeToVisit = head.next;
            // prev head points to the new one
            head.next = newNode;
            // new node points to the next of original
            newNode.next = nodeToVisit;
            head = nodeToVisit;
        }
        /*
         now set all randoms
         start again from the original head, next of it, is my copy
         p1 points to original, p2 to the copy
         assign to p2.random = p1.random.next
         */

        Node p1 = realHead;
        Node p2 = realHead.next;
        while (true) {
            Node originalRandom = p1.random;
            if (originalRandom == null) {
                p2.random = null;
            } else {
                p2.random = originalRandom.next;
            }
            if (p1.next.next == null) {
                break;
            }
            p1 = p1.next.next;
            p2 = p2.next.next;
        }

        /*
        now remove, so from head.next, go by 2 pointes
        N1 N1c N2 N2c N3 N3c N4 N4c N5 N5c
        p1 p2
            -------^
        ------^
         */
        p1 = realHead;
        // to return next pointer of head before changing pointers
        Node nodeToReturn = realHead.next;
        p2 = realHead.next;
        while (p2.next != null) {
            p1.next = p1.next.next;
            p2.next = p2.next.next;
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = null;
        // return next of the original one, so the first copied node
        return nodeToReturn;
    }
}