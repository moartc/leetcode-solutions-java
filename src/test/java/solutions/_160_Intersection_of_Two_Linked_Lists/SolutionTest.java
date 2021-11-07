package solutions._160_Intersection_of_Two_Linked_Lists;

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
    void getIntersectionNodeTest1() {
        ListNode commonPart = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode headA = new ListNode(3, new ListNode(1, commonPart));
        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1, commonPart)));
        ListNode actual = solution.getIntersectionNode(headA, headB);
        Assertions.assertEquals(commonPart.val, actual.val);
    }

    @Test
    void getIntersectionNodeTest2() {
        ListNode commonPart = new ListNode(2, new ListNode(4));
        ListNode headA = new ListNode(1, new ListNode(9, new ListNode(1, commonPart)));
        ListNode headB = new ListNode(3, commonPart);
        ListNode actual = solution.getIntersectionNode(headA, headB);
        Assertions.assertEquals(commonPart.val, actual.val);
    }

    @Test
    void getIntersectionNodeTest3() {
        ListNode headA = new ListNode(2, new ListNode(6, new ListNode(4)));
        ListNode headB = new ListNode(1, new ListNode(5));
        ListNode actual = solution.getIntersectionNode(headA, headB);
        Assertions.assertNull(actual);
    }

    @Test
    void getIntersectionNodeTest4() {
        ListNode commonPart = new ListNode(3);
        ListNode headA = commonPart;
        ListNode headB = new ListNode(3, commonPart);
        ListNode actual = solution.getIntersectionNode(headA, headB);
        Assertions.assertEquals(commonPart.val, actual.val);
    }
}