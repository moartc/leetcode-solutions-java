package solutions.algorithms._2000_2999._2095_Delete_the_Middle_Node_of_a_Linked_List;

import commons.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void deleteMiddle1() {
        ListNode head = new ListNode(1,
                new ListNode(3, new ListNode(4, new ListNode(7, new ListNode(1, new ListNode(2, new ListNode(6)))))));
        ListNode answer = solution.deleteMiddle(head);
        int v1 = answer.val;
        int v2 = answer.next.val;
        int v3 = answer.next.next.val;
        int v4 = answer.next.next.next.val;
        int v5 = answer.next.next.next.next.val;
        int v6 = answer.next.next.next.next.next.val;
        Assertions.assertThat(v1).isEqualTo(1);
        Assertions.assertThat(v2).isEqualTo(3);
        Assertions.assertThat(v3).isEqualTo(4);
        Assertions.assertThat(v4).isEqualTo(1);
        Assertions.assertThat(v5).isEqualTo(2);
        Assertions.assertThat(v6).isEqualTo(6);
    }

    @Test
    void deleteMiddle2() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode answer = solution.deleteMiddle(head);
        int v1 = answer.val;
        int v2 = answer.next.val;
        int v3 = answer.next.next.val;
        Assertions.assertThat(v1).isEqualTo(1);
        Assertions.assertThat(v2).isEqualTo(2);
        Assertions.assertThat(v3).isEqualTo(4);
    }

    @Test
    void deleteMiddle3() {
        ListNode head = new ListNode(2, new ListNode(1));
        ListNode answer = solution.deleteMiddle(head);
        int v1 = answer.val;
        Assertions.assertThat(v1).isEqualTo(2);
        Assertions.assertThat(answer.next).isNull();
    }
}