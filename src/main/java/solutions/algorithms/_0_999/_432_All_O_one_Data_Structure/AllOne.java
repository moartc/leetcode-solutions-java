package solutions.algorithms._0_999._432_All_O_one_Data_Structure;


import java.util.HashMap;
import java.util.Map;

class AllOne {

    /*
    I could use a TreeSet or TreeMap, but I can fetch the first and the last elements only in O(long n) time.
    I need to implement my own data structure. Sth like a queue where I track the first and the last node.
    Also, I need a mapping from String to node, because that gives me quick access to the node in the list.
    Similar problem to an LRU cache.
    implemented, but now I see that this approach doesn't make sense.
    Note says that "each function must run in O(1) average time complexity" and in my solution, inc and dec might run in O(n).
    todo: refactoring, sometime in the future
     */

    Node head;
    Node last;
    Map<String, Node> map;

    public AllOne() {
        this.map = new HashMap<>();
    }

    public void inc(String key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            if (node == head && node == last) {
                // just increase
                node.counter = node.counter + 1;
            } else {
                moveRight(node);
            }
        } else {
            // no mater what I can add it as head
            Node newNode = new Node(null, null, key, 1);
            if (map.size() == 0) {
                head = newNode;
                last = newNode;
            } else if (map.size() == 1) {
                newNode.next = last;
                last.prev = newNode;
                newNode.prev = null;
                head = newNode;
                last.next = null;
            } else {
                Node currentHead = head;
                currentHead.prev = newNode;
                newNode.next = currentHead;
                head = newNode;
            }
            map.put(key, newNode);
        }
    }

    /*
    cases:
    1. element
    2. elements
    3. more elements
    - head
    - tail
    - between
     */
    public void dec(String key) {


        Node node = map.get(key);
        int newCounter = node.counter - 1;
        if (node == head && node == last) {
            if (newCounter == 0) {
                map.remove(key);
                head = null;
                last = null;
            } else {
                node.counter = newCounter;
                return;
            }
        } else if (node == head) {
            if (newCounter == 0) {
                Node next = node.next;
                next.prev = null;
                head = next;
                map.remove(key);
            } else {
                node.counter = newCounter;
            }
        } else { // on the right, might be the last
            if (node == last) {
                if (newCounter == 0) {
                    if (last.prev != null) {
                        last = last.prev;
                        last.next = null;
                    }
                    map.remove(key);
                    return;
                }
                if (node.prev.counter <= newCounter) {
                    // can stay
                    node.counter = newCounter;
                } else {
                    Node beforeLast = last.prev;
                    Node tempNode = node;
                    while (tempNode.prev != null && tempNode.prev.counter >= newCounter) {
                        tempNode = tempNode.prev;
                    }
                    // insert it between tempNode and tempNode.prev
                    if (tempNode == head) {
                        // set new head
                        node.next = tempNode;
                        tempNode.prev = node;
                        head = node;
                    } else {
                        Node tempNodePrev = tempNode.prev;
                        tempNode.prev = node;
                        node.next = tempNode;
                        node.prev = tempNodePrev;
                        tempNodePrev.next = node;
                    }
                    node.counter = newCounter;
                    last = beforeLast;
                    last.next = null;
                }
            } else {
            /*
            just move left
            1 1 1 2 3 3 5 6 7
             */
                if (newCounter == 0) {
                    Node origPrev = node.prev;
                    Node origNext = node.next;
                    origPrev.next = origNext;
                    origNext.prev = origPrev;
                    map.remove(key);
                } else if (node.prev.counter <= newCounter) {
                    // can stay
                    node.counter = newCounter;
                } else {
                    Node origPrev = node.prev;
                    Node origNext = node.next;
                    Node tempNode = node;
                    while (tempNode.prev != null && tempNode.prev.counter > newCounter) {
                        tempNode = tempNode.prev;
                    }
                    // insert it between tempNode and tempNode.prev
                    if (tempNode == head) {
                        // set new head
                        node.next = tempNode;
                        tempNode.prev = node;
                        head = node;
                    } else {
                        Node tempNodePrev = tempNode.prev;
                        tempNode.prev = node;
                        node.next = tempNode;
                        node.prev = tempNodePrev;
                        tempNodePrev.next = node;
                    }
                    // delete prev connection
                    origPrev.next = origNext;
                    origNext.prev = origPrev;
                    node.counter = newCounter;
                }
            }
        }
    }

    private void moveRight(Node nodeToMove) {
        int currentValue = nodeToMove.counter;
        if (nodeToMove == last) {
            nodeToMove.counter = currentValue + 1;
        } else if (nodeToMove == head) {
            if (nodeToMove.next == null) {
                nodeToMove.counter = currentValue + 1;
                // nothing to do
            } else {
                Node afterHead = nodeToMove.next;
                Node temp = nodeToMove;
                // 1 1 2 2 3 4
                // until next is equal jump on it and then insert in behind this value and before one with highre ctr
                while (temp.next != null && temp.next.counter == temp.counter) {
                    temp = temp.next;
                }
                if (temp == last) {
                    // insert as last
                    last.next = nodeToMove;
                    nodeToMove.prev = last;
                    nodeToMove.next = null;
                    last = nodeToMove;
                    // fix head
                    afterHead.prev = null;
                    head = afterHead;
                    afterHead.prev = null;
                    nodeToMove.counter++;

                } else if (temp == head) {
                    nodeToMove.counter++;

                } else {
                    Node afterTemp = temp.next;
                    nodeToMove.next = afterTemp;
                    afterTemp.prev = nodeToMove;
                    temp.next = nodeToMove;
                    nodeToMove.prev = temp;
                    head = afterHead;
                    afterHead.prev = null;
                    nodeToMove.counter++;
                }
            }
        } else {
            Node temp = nodeToMove;
            if (temp.next.counter > temp.counter) {
                nodeToMove.counter++;
                return;
            }
            Node behindNtm = nodeToMove.prev;
            Node afterNtm = nodeToMove.next;
            behindNtm.next = afterNtm;
            afterNtm.prev = behindNtm;

            while (temp.next != null && temp.next.counter == temp.counter) {
                temp = temp.next;
            }
            if (temp == last) {
                last.next = nodeToMove;
                nodeToMove.prev = last;
                nodeToMove.next = null;
                last = nodeToMove;
            } else {
                Node behindTemp = temp.prev;
                Node afterTemp = temp.next;
                behindTemp.next = nodeToMove;
                nodeToMove.prev = behindTemp;
                nodeToMove.next = afterTemp;
                afterTemp.prev = nodeToMove;
            }
            nodeToMove.counter++;
        }
    }

    public String getMaxKey() {
        if (last != null) {
            return last.value;
        } else {
            return "";
        }
    }

    public String getMinKey() {
        if (head != null) {
            return head.value;
        } else {
            return "";
        }
    }

    class Node {
        public Node prev;
        public Node next;
        public String value;
        public int counter;

        public Node(Node prev, Node next, String value, int counter) {
            this.prev = prev;
            this.next = next;
            this.value = value;
            this.counter = counter;
        }
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */