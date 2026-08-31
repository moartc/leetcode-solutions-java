package solutions.algorithms._2000_2999._2058_Find_the_Minimum_and_Maximum_Number_of_Nodes_Between_Critical_Points;

import commons.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void nodesBetweenCriticalPoints1() {
        ListNode head = new ListNode(3, new ListNode(1));
        int[] answer = solution.nodesBetweenCriticalPoints(head);
        Assertions.assertThat(answer).containsExactly(-1, -1);
    }

    @Test
    void nodesBetweenCriticalPoints2() {
        ListNode head = new ListNode(5,
                new ListNode(3, new ListNode(1, new ListNode(2, new ListNode(5, new ListNode(
                        1, new ListNode(2)
                ))))));
        int[] answer = solution.nodesBetweenCriticalPoints(head);
        Assertions.assertThat(answer).containsExactly(1, 3);
    }

    @Test
    void nodesBetweenCriticalPoints3() {
        ListNode head = new ListNode(1, new ListNode(3, new ListNode(2,
                new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(
                        2, new ListNode(2, new ListNode(7))
                )))))));
        int[] answer = solution.nodesBetweenCriticalPoints(head);
        Assertions.assertThat(answer).containsExactly(3, 3);
    }

    @Test
    void nodesBetweenCriticalPoints4() {
        ListNode head = new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(2))));
        int[] answer = solution.nodesBetweenCriticalPoints(head);
        Assertions.assertThat(answer).containsExactly(-1, -1);
    }

    @Test
    void nodesBetweenCriticalPoints5() {
        ListNode head = new ListNode(2, new ListNode(2, new ListNode(1, new ListNode(3))));
        int[] answer = solution.nodesBetweenCriticalPoints(head);
        Assertions.assertThat(answer).containsExactly(-1, -1);
    }
}