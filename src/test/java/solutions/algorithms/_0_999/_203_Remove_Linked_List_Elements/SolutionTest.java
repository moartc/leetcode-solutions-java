package solutions.algorithms._0_999._203_Remove_Linked_List_Elements;

import commons.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._203_Remove_Linked_List_Elements.Solution;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void removeElementsTest1() {
        //1,2,6,3,4,5,6
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3,
                new ListNode(4, new ListNode(5, new ListNode(6)))))));
        int val = 6;
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,
                new ListNode(5)))));
        ListNode actual = solution.removeElements(list, val);
        assertEquals(expected, actual);
    }

    @Test
    void removeElementsTest2() {
        ListNode list = new ListNode();
        int val = 1;
        ListNode expected = new ListNode();
        ListNode actual = solution.removeElements(list, val);
        assertEquals(expected, actual);
    }

    @Test
    void removeElementsTest3() {
        ListNode list = new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7))));
        int val = 7;
        ListNode actual = solution.removeElements(list, val);
        Assertions.assertNull(actual);
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