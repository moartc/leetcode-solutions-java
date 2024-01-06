package solutions.algorithms._0_999._237_Delete_Node_in_a_Linked_List;

import commons.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._237_Delete_Node_in_a_Linked_List.Solution;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void deleteNodeTest1() {

        ListNode ln9 = new ListNode(9);
        ListNode ln1 = new ListNode(1);
        ln1.next = ln9;
        ListNode ln5 = new ListNode(5);
        ln5.next = ln1;
        ListNode ln4 = new ListNode(4);
        ln4.next = ln5;

        solution.deleteNode(ln5);

        ListNode expected = new ListNode(4);
        ListNode lne1 = new ListNode(1);
        lne1.next = new ListNode(9);
        expected.next = lne1;

        assertEquals(expected, ln4);
    }

    @Test
    void deleteNodeTest2() {

        ListNode ln9 = new ListNode(9);
        ListNode ln1 = new ListNode(1);
        ln1.next = ln9;
        ListNode ln5 = new ListNode(5);
        ln5.next = ln1;
        ListNode ln4 = new ListNode(4);
        ln4.next = ln5;

        solution.deleteNode(ln1);

        ListNode expected = new ListNode(4);
        ListNode lne5 = new ListNode(5);
        lne5.next = new ListNode(9);
        expected.next = lne5;

        assertEquals(expected, ln4);
    }

    void assertEquals(ListNode expected, ListNode actual) {

        while (expected.next != null) {
            int expectedCurrentValue = expected.val;
            int actualCurrentValue = actual.val;
            Assertions.assertEquals(expectedCurrentValue, actualCurrentValue);
            expected = expected.next;
            actual = actual.next;
        }
        Assertions.assertNull(actual.next);
    }
}