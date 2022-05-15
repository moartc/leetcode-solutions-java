package commons;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(val);
        ListNode tmp = next;
        while(tmp != null) {
            sb.append(" -> ");
            sb.append(tmp.val);
            tmp = tmp.next;
        }
        return sb.toString();
    }
}