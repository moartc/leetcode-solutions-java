package solutions.algorithms._0_999._82_Remove_Duplicates_from_Sorted_List_II;

import commons.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._82_Remove_Duplicates_from_Sorted_List_II.Solution;
import solutions.utils.ListNodeAssertions;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void deleteDuplicatesTest1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3,
                new ListNode(4, new ListNode(4, new ListNode(5)))))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(5)));
        var actual = solution.deleteDuplicates(head);
        ListNodeAssertions.listsEquals(expected, actual);
    }

    @Test
    void deleteDuplicatesTest2() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2,
                new ListNode(3)))));
        ListNode expected = new ListNode(2, new ListNode(3));
        ListNodeAssertions.listsEquals(expected, solution.deleteDuplicates(head));
    }

    @Test
    void deleteDuplicatesTest3() {
        ListNode head = new ListNode(4);
        ListNode expected = new ListNode(4);
        ListNodeAssertions.listsEquals(expected, solution.deleteDuplicates(head));
    }

    @Test
    void deleteDuplicatesTest4() {
        Assertions.assertThat(solution.deleteDuplicates(null)).isNull();
    }

    @Test
    void deleteDuplicatesTest5() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))));
        ListNode expected = new ListNode(1, new ListNode(3));
        ListNodeAssertions.listsEquals(expected, solution.deleteDuplicates(head));
    }

    @Test
    void deleteDuplicatesTest6() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2)));
        ListNode expected = new ListNode(1);
        ListNodeAssertions.listsEquals(expected, solution.deleteDuplicates(head));
    }

    @Test
    void deleteDuplicatesTest7() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1)));
        Assertions.assertThat(solution.deleteDuplicates(head)).isNull();
    }

    @Test
    void deleteDuplicatesTest8() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode expected = new ListNode(2);
        ListNodeAssertions.listsEquals(expected, solution.deleteDuplicates(head));
    }
}