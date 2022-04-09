package solutions.algorithms._19_Remove_Nth_Node_From_End_of_List;

import commons.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.utils.ListNodeAssertions;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void removeNthFromEndTest1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int n = 2;

        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))));
        ListNode actual = solution.removeNthFromEnd(head, n);
        ListNodeAssertions.listsEquals(expected, actual);
    }

    @Test
    void removeNthFromEndTest2() {
        ListNode head = new ListNode(1);
        int n = 1;

        ListNode actual = solution.removeNthFromEnd(head, n);
        Assertions.assertNull(actual);
    }

    @Test
    void removeNthFromEndTest3() {
        ListNode head = new ListNode(1, new ListNode(2));
        int n = 1;

        ListNode expected = new ListNode(1);
        ListNode actual = solution.removeNthFromEnd(head, n);
        ListNodeAssertions.listsEquals(expected, actual);
    }

    @Test
    void removeNthFromEndTest4() {
        ListNode head = new ListNode(1, new ListNode(2));
        int n = 2;

        ListNode expected = new ListNode(2);
        ListNode actual = solution.removeNthFromEnd(head, n);
        ListNodeAssertions.listsEquals(expected, actual);
    }

    @Test
    void removeNthFromEndTest5() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        int n = 4;

        ListNode expected = new ListNode(2, new ListNode(3, new ListNode(4)));
        ListNode actual = solution.removeNthFromEnd(head, n);
        ListNodeAssertions.listsEquals(expected, actual);
    }
}