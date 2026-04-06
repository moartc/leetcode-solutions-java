package solutions.algorithms._0_999._430_Flatten_a_Multilevel_Doubly_Linked_List;

// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};


class Solution {
    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }
        process(head);
        return head;
    }

    // never call for null, returns tail
    Node process(Node node) {
        Node tmp = node;
        Node last = node;
        while (tmp != null) {
            Node originalNext = tmp.next;
            if (tmp.child != null) {
                Node childLastNode = process(tmp.child);
                childLastNode.next = tmp.next;
                if (tmp.next != null) {
                    tmp.next.prev = childLastNode;
                }
                tmp.next = tmp.child;
                tmp.child.prev = tmp;
                tmp.child = null;
                tmp = originalNext;
                last = childLastNode;
            } else {
                last = tmp;
                tmp = tmp.next;
            }
        }
        return last;
    }

}
