package solutions.algorithms._0_999._206_Reverse_Linked_List;

import commons.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void reverseListTest1() {
        ListNode input = new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(5, new ListNode(4, new ListNode(3,
                new ListNode(2, new ListNode(1)))));
        ListNode actual = solution.reverseList(input);
        assertEquals(expected, actual);
    }

    @Test
    void reverseListTest2() {
        ListNode input = new ListNode(1, new ListNode(2));
        ListNode expected = new ListNode(2, new ListNode(1));
        ListNode actual = solution.reverseList(input);
        assertEquals(expected, actual);
    }

    @Test
    void reverseListTest3() {
        ListNode input = new ListNode(1);
        ListNode actual = solution.reverseList(input);
        assertEquals(input, actual);
    }

    @Test
    void reverseListTest4() {
        ListNode input = null;
        ListNode actual = solution.reverseList(input);
        Assertions.assertNull(actual);
    }

    @Test
    void reverseListTest5() {
        ListNode input = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode expected = new ListNode(3, new ListNode(2, new ListNode(1)));
        ListNode actual = solution.reverseList(input);
        assertEquals(expected, actual);
    }

    void assertEquals(ListNode expected, ListNode actual) {

        while (expected.next != null) {
            int expectedCurrentValue = expected.val;
            int actualCurrentValue = actual.val;
            Assertions.assertEquals(expectedCurrentValue, actualCurrentValue);
            expected = expected.next;
            actual = actual.next;
        }
        Assertions.assertNull(expected.next);
        Assertions.assertNull(actual.next);
    }
}