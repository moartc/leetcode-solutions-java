package solutions.algorithms._0_999._155_Min_Stack;

class MinStack {

    private Node currentNode;

    public MinStack() {

    }

    public void push(int val) {
        if (currentNode == null) {
            currentNode = new Node(val, val, null, null);
        } else {
            currentNode.setNext(new Node(val, Math.min(currentNode.getMin(), val), currentNode, null));
            currentNode = currentNode.next;
        }
    }

    public void pop() {
        currentNode = currentNode.prev;
    }

    public int top() {
        int toReturn = currentNode.val;
        return toReturn;
    }

    public int getMin() {
        return currentNode.getMin();
    }

    private class Node {
        int val;
        int min;
        Node prev;
        Node next;

        public Node(int val, int min, Node prev, Node next) {
            this.val = val;
            this.min = min;
            this.prev = prev;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */