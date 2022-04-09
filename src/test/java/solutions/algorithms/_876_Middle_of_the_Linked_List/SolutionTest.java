package solutions.algorithms._876_Middle_of_the_Linked_List;

import commons.ListNode;
import org.junit.jupiter.api.Test;
import solutions.utils.ListNodeAssertions;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void middleNodeTest1() {

        ListNode head = new ListNode(1, new ListNode(2,new ListNode (3,new ListNode(4,new ListNode(5)))));
        ListNode expected = new ListNode(3,new ListNode(4,new ListNode(5)));
        ListNode actual = solution.middleNode(head);
        ListNodeAssertions.listsEquals(expected,actual);
    }

    @Test
    void middleNodeTest2() {

        ListNode head = new ListNode(1, new ListNode(2,new ListNode (3,new ListNode(4,new ListNode(5, new ListNode(6))))));
        ListNode expected = new ListNode(4,new ListNode(5,new ListNode(6)));
        ListNode actual = solution.middleNode(head);
        ListNodeAssertions.listsEquals(expected,actual);
    }
}