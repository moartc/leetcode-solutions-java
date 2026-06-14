package solutions.algorithms._2000_2999._2130_Maximum_Twin_Sum_of_a_Linked_List;

import commons.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void pairSum1() {
        ListNode head = new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1))));
        int answer = solution.pairSum(head);
        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void pairSum2() {
        ListNode head = new ListNode(4, new ListNode(2, new ListNode(2, new ListNode(3))));
        int answer = solution.pairSum(head);
        Assertions.assertThat(answer).isEqualTo(7);
    }

    @Test
    void pairSum3() {
        ListNode head = new ListNode(1, new ListNode(100000));
        int answer = solution.pairSum(head);
        Assertions.assertThat(answer).isEqualTo(100001);
    }


}