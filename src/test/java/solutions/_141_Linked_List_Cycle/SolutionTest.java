package solutions._141_Linked_List_Cycle;

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
    void hasCycleTest1() {
        ListNode third = new ListNode(0);
        ListNode second = new ListNode(2, third);
        ListNode head = new ListNode(3, second);
        ListNode fourth = new ListNode(-4, second);
        third.next = fourth;
        boolean result = solution.hasCycle(head);
        Assertions.assertTrue(result);
    }

    @Test
    void hasCycleTest2() {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2, head);
        head.next = second;
        boolean result = solution.hasCycle(head);
        Assertions.assertTrue(result);
    }

    @Test
    void hasCycleTest3() {
        ListNode head = new ListNode(1);
        boolean result = solution.hasCycle(head);
        Assertions.assertFalse(result);
    }

    @Test
    void hasCycleTest4() {
        ListNode head = null;
        boolean result = solution.hasCycle(head);
        Assertions.assertFalse(result);
    }
}