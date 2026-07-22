package solutions.algorithms._0_999._61_Rotate_List;

import commons.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void rotateRight1() {
        ListNode h = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int k = 2;
        ListNode answer = solution.rotateRight(h, k);
        Assertions.assertThat(answer.val).isEqualTo(4);
        Assertions.assertThat(answer.next.val).isEqualTo(5);
        Assertions.assertThat(answer.next.next.val).isEqualTo(1);
        Assertions.assertThat(answer.next.next.next.val).isEqualTo(2);
        Assertions.assertThat(answer.next.next.next.next.val).isEqualTo(3);
        Assertions.assertThat(answer.next.next.next.next.next).isNull();
    }

    @Test
    void rotateRight2() {
        ListNode h = new ListNode(0, new ListNode(1, new ListNode(2)));
        int k = 4;
        ListNode answer = solution.rotateRight(h, k);
        Assertions.assertThat(answer.val).isEqualTo(2);
        Assertions.assertThat(answer.next.val).isEqualTo(0);
        Assertions.assertThat(answer.next.next.val).isEqualTo(1);
        Assertions.assertThat(answer.next.next.next).isNull();
    }

    @Test
    void rotateRight3() {
        ListNode h = new ListNode(1, new ListNode(2));
        int k = 1;
        ListNode answer = solution.rotateRight(h, k);
        Assertions.assertThat(answer.val).isEqualTo(2);
        Assertions.assertThat(answer.next.val).isEqualTo(1);
        Assertions.assertThat(answer.next.next).isNull();
    }

    @Test
    void rotateRight4() {
        ListNode h = new ListNode(1, new ListNode(2));
        int k = 2;
        ListNode answer = solution.rotateRight(h, k);
        Assertions.assertThat(answer.val).isEqualTo(1);
        Assertions.assertThat(answer.next.val).isEqualTo(2);
        Assertions.assertThat(answer.next.next).isNull();
    }
}