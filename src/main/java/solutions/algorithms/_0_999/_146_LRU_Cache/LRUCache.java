package solutions.algorithms._0_999._146_LRU_Cache;

import java.util.HashMap;
import java.util.Map;

class LRUCache {


    /*
     I need a hashmap to store a key value pair - key is integer and value is a node
     from a link list - implemented by me
     */

    // head in my implementation is the first element
    // last is the last element

    //  1 (head) -> 2 -> 3 -> 4 (last)

    // here I store key - value map
    Map<Integer, Node> map;
    Node head;
    Node last;
    int capacity = -1;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        } else {
            // cases
            // node is head & last
            // node is head
            // node is last
            // node is in the middle
            if (node == last || (node == head && node == last)) {
                // do nothing
                return node.value;
            } else if (node == head) {
                // change head
                head = node.next;
                head.prev = null;
            } else {
                // change pointes in the middle
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }
            // and add it at the end
            Node currentLast = last;
            currentLast.next = node;
            node.prev = currentLast;
            node.next = null;
            last = node;
            return node.value;
        }
    }

    public void put(int key, int value) {

        // exist - replace
        if (map.containsKey(key)) {
            Node currentNode = map.get(key);
            if (currentNode == head) {
                if (map.size() == 1) {
                    // there is only head - just update it
                    head.value = value;
                } else {

                    Node currentHead = head;
                    head = currentHead.next;
                    head.prev = null;

                    Node currentLast = last;
                    currentNode.value = value;
                    currentLast.next = currentNode;
                    currentNode.prev = currentLast;
                    currentNode.next = null;
                    last = currentNode;
                }
            } else if (currentNode == last) {
                last.value = value;
            } else {
                // somewhere in the middle
                Node currentLast = last;
                currentNode.prev.next = currentNode.next;
                currentNode.next.prev = currentNode.prev;
                currentNode.value = value;
                currentLast.next = currentNode;
                currentNode.prev = currentLast;
                currentNode.next = null;
                last = currentNode;
            }

        } else {
            Node newNode = new Node(key, value);

            // doesn't exist
            if (map.size() == 0) {
                head = newNode;
            } else if (map.size() == capacity && map.size() == 1) {
                // delete the first one
                Node nodeToDelete = head;
                map.remove(nodeToDelete.key);
                if (map.size() == 0) {
                    head = newNode;
                }
            } else if (map.size() == capacity) {
                Node nodeToDelete = head;
                map.remove(nodeToDelete.key);

                // head points to the one to delete next
                head = nodeToDelete.next;
                // it's the first one, so there is no prev
                head.prev = null;
                Node currentLast = last;
                currentLast.next = newNode;
                newNode.prev = currentLast;
            } else { // regular case - can add at the end
                Node currentLast = last;
                currentLast.next = newNode;
                newNode.prev = currentLast;
            }
            last = newNode;
            map.put(key, newNode);
        }
    }

    class Node {
        public int key;
        public int value;
        public Node next;
        public Node prev;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */