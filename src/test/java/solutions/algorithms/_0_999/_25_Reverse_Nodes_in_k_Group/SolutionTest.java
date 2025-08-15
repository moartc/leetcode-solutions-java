package solutions.algorithms._0_999._25_Reverse_Nodes_in_k_Group;

import commons.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reverseKGroupTest1() {

        ListNode l5 = new ListNode(5);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        int k = 2;

        ListNode answer = solution.reverseKGroup(l1, k);
        int v1 = answer.val;
        answer = answer.next;
        int v2 = answer.val;
        answer = answer.next;
        int v3 = answer.val;
        answer = answer.next;
        int v4 = answer.val;
        answer = answer.next;
        int v5 = answer.val;

        Assertions.assertThat(v1).isEqualTo(2);
        Assertions.assertThat(v2).isEqualTo(1);
        Assertions.assertThat(v3).isEqualTo(4);
        Assertions.assertThat(v4).isEqualTo(3);
        Assertions.assertThat(v5).isEqualTo(5);
    }

    @Test
    void reverseKGroupTest2() {

        ListNode l5 = new ListNode(5);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        int k = 3;

        ListNode answer = solution.reverseKGroup(l1, k);

        int v1 = answer.val;
        answer = answer.next;
        int v2 = answer.val;
        answer = answer.next;
        int v3 = answer.val;
        answer = answer.next;
        int v4 = answer.val;
        answer = answer.next;
        int v5 = answer.val;
        Assertions.assertThat(v1).isEqualTo(3);
        Assertions.assertThat(v2).isEqualTo(2);
        Assertions.assertThat(v3).isEqualTo(1);
        Assertions.assertThat(v4).isEqualTo(4);
        Assertions.assertThat(v5).isEqualTo(5);
    }

    @Test
    void reverseKGroupTest3() {

        ListNode l11 = new ListNode(11);
        ListNode l10 = new ListNode(10, l11);
        ListNode l9 = new ListNode(9, l10);
        ListNode l8 = new ListNode(8, l9);
        ListNode l7 = new ListNode(7, l8);
        ListNode l6 = new ListNode(6, l7);
        ListNode l5 = new ListNode(5, l6);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        int k = 3;

        ListNode answer = solution.reverseKGroup(l1, k);
        int v1 = answer.val;
        answer = answer.next;
        int v2 = answer.val;
        answer = answer.next;
        int v3 = answer.val;
        answer = answer.next;
        int v4 = answer.val;
        answer = answer.next;
        int v5 = answer.val;
        answer = answer.next;
        int v6 = answer.val;
        answer = answer.next;
        int v7 = answer.val;
        answer = answer.next;
        int v8 = answer.val;
        answer = answer.next;
        int v9 = answer.val;
        answer = answer.next;
        int v10 = answer.val;
        answer = answer.next;
        int v11 = answer.val;

        Assertions.assertThat(v1).isEqualTo(3);
        Assertions.assertThat(v2).isEqualTo(2);
        Assertions.assertThat(v3).isEqualTo(1);
        Assertions.assertThat(v4).isEqualTo(6);
        Assertions.assertThat(v5).isEqualTo(5);
        Assertions.assertThat(v6).isEqualTo(4);
        Assertions.assertThat(v7).isEqualTo(9);
        Assertions.assertThat(v8).isEqualTo(8);
        Assertions.assertThat(v9).isEqualTo(7);
        Assertions.assertThat(v10).isEqualTo(10);
        Assertions.assertThat(v11).isEqualTo(11);
    }

    @Test
    void reverseKGroupTest4() {

        ListNode l7 = new ListNode(7);
        ListNode l6 = new ListNode(6, l7);
        ListNode l5 = new ListNode(5, l6);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        int k = 4;

        ListNode answer = solution.reverseKGroup(l1, k);
        int v1 = answer.val;
        answer = answer.next;
        int v2 = answer.val;
        answer = answer.next;
        int v3 = answer.val;
        answer = answer.next;
        int v4 = answer.val;
        answer = answer.next;
        int v5 = answer.val;
        answer = answer.next;
        int v6 = answer.val;
        answer = answer.next;
        int v7 = answer.val;

        Assertions.assertThat(v1).isEqualTo(4);
        Assertions.assertThat(v2).isEqualTo(3);
        Assertions.assertThat(v3).isEqualTo(2);
        Assertions.assertThat(v4).isEqualTo(1);
        Assertions.assertThat(v5).isEqualTo(5);
        Assertions.assertThat(v6).isEqualTo(6);
        Assertions.assertThat(v7).isEqualTo(7);
    }

    @Test
    void reverseKGroupTest5() {

        ListNode l2 = new ListNode(2);
        ListNode l1 = new ListNode(1, l2);
        int k = 2;

        ListNode answer = solution.reverseKGroup(l1, k);
        int v1 = answer.val;
        answer = answer.next;
        int v2 = answer.val;

        Assertions.assertThat(v1).isEqualTo(2);
        Assertions.assertThat(v2).isEqualTo(1);
    }
}