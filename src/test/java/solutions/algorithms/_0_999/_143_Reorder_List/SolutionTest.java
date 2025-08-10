package solutions.algorithms._0_999._143_Reorder_List;

import commons.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reorderListTest1() {

        ListNode ln4 = new ListNode(4);
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode ln1 = new ListNode(1, ln2);

        List<Integer> expected = List.of(1, 4, 2, 3);

        solution.reorderList(ln1);

        assertList(ln1, expected);
    }

    @Test
    void reorderListTest2() {

        ListNode ln5 = new ListNode(5);
        ListNode ln4 = new ListNode(4, ln5);
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode ln1 = new ListNode(1, ln2);

        List<Integer> expected = List.of(1, 5, 2, 4, 3);

        solution.reorderList(ln1);

        assertList(ln1, expected);
    }

    @Test
    void reorderListTest3() {

        ListNode ln9 = new ListNode(9);
        ListNode ln8 = new ListNode(8, ln9);
        ListNode ln7 = new ListNode(7, ln8);
        ListNode ln6 = new ListNode(6, ln7);
        ListNode ln5 = new ListNode(5, ln6);
        ListNode ln4 = new ListNode(4, ln5);
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode ln1 = new ListNode(1, ln2);

        List<Integer> expected = List.of(1, 9, 2, 8, 3, 7, 4, 6, 5);

        solution.reorderList(ln1);

        assertList(ln1, expected);
    }


    private void assertList(ListNode ln, List<Integer> expectedValues) {
        List<Integer> actualList = new ArrayList<>();
        while (ln != null) {
            actualList.add(ln.val);
            ln = ln.next;
        }
        Assertions.assertIterableEquals(expectedValues, actualList);
    }


}