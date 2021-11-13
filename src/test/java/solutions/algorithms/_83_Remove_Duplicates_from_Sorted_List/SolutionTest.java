package solutions.algorithms._83_Remove_Duplicates_from_Sorted_List;

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
    void deleteDuplicatesTest1() {

        ListNode inputListNode = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode expectedListNode = new ListNode(1, new ListNode(2));
        assertEquals(expectedListNode, solution.deleteDuplicates(inputListNode));
    }

    @Test
    void deleteDuplicatesTest2() {

        ListNode inputListNode = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode expectedListNode = new ListNode(1, new ListNode(2, new ListNode(3)));
        assertEquals(expectedListNode, solution.deleteDuplicates(inputListNode));
    }

    @Test
    void deleteDuplicatesTest3() {

        ListNode inputListNode = null;
        Assertions.assertNull(solution.deleteDuplicates(inputListNode));
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