package solutions.algorithms._0_999._24_Swap_Nodes_in_Pairs;

import commons.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void swapPairs1() {
        ListNode ln = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode answer = solution.swapPairs(ln);
        Assertions.assertThat(answer.val).isEqualTo(2);
        Assertions.assertThat(answer.next.val).isEqualTo(1);
        Assertions.assertThat(answer.next.next.val).isEqualTo(4);
        Assertions.assertThat(answer.next.next.next.val).isEqualTo(3);
        Assertions.assertThat(answer.next.next.next.next).isNull();
    }

    @Test
    void swapPairs2() {
        ListNode answer = solution.swapPairs(null);
        Assertions.assertThat(answer).isNull();
    }

    @Test
    void swapPairs3() {
        ListNode ln = new ListNode(1);
        ListNode answer = solution.swapPairs(ln);
        Assertions.assertThat(answer.val).isEqualTo(1);
        Assertions.assertThat(answer.next).isNull();
    }

    @Test
    void swapPairs4() {
        ListNode ln = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode answer = solution.swapPairs(ln);
        Assertions.assertThat(answer.val).isEqualTo(2);
        Assertions.assertThat(answer.next.val).isEqualTo(1);
        Assertions.assertThat(answer.next.next.val).isEqualTo(3);
        Assertions.assertThat(answer.next.next.next).isNull();
    }
}