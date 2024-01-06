package solutions.algorithms._0_999._2_Add_Two_Numbers;

import commons.ListNode;
import org.junit.jupiter.api.Test;
import solutions.utils.ListNodeAssertions;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void addTwoNumbersTest1() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));

        ListNodeAssertions.listsEquals(expected, solution.addTwoNumbers(l1, l2));
    }

    @Test
    void addTwoNumbersTest2() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode expected = new ListNode(0);

        ListNodeAssertions.listsEquals(expected, solution.addTwoNumbers(l1, l2));
    }

    @Test
    void addTwoNumbersTest3() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode expected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));

        ListNodeAssertions.listsEquals(expected, solution.addTwoNumbers(l1, l2));
    }

    @Test
    void addTwoNumbersTest4() {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9);
        ListNode expected = new ListNode(8, new ListNode(1));

        ListNodeAssertions.listsEquals(expected, solution.addTwoNumbers(l1, l2));
    }

    @Test
    void addTwoNumbersTest5() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(9)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9))));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(4, new ListNode(0, new ListNode(1)))));

        ListNodeAssertions.listsEquals(expected, solution.addTwoNumbers(l1, l2));
    }

    @Test
    void addTwoNumbersTest6() {
        ListNode l1 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9))));
        ListNode l2 = new ListNode(2, new ListNode(4, new ListNode(9)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(4, new ListNode(0, new ListNode(1)))));

        ListNodeAssertions.listsEquals(expected, solution.addTwoNumbers(l1, l2));
    }
}


