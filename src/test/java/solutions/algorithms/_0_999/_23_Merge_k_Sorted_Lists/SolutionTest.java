package solutions.algorithms._0_999._23_Merge_k_Sorted_Lists;

import commons.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void mergeKListsTest1() {

        ListNode l1_3 = new ListNode(5);
        ListNode l1_2 = new ListNode(4, l1_3);
        ListNode l1_1 = new ListNode(1, l1_2);

        ListNode l2_3 = new ListNode(4);
        ListNode l2_2 = new ListNode(3, l2_3);
        ListNode l2_1 = new ListNode(1, l2_2);

        ListNode l3_2 = new ListNode(6);
        ListNode l3_1 = new ListNode(2, l3_2);

        ListNode[] toMerge = new ListNode[]{l1_1, l2_1, l3_1};

        ListNode answer = solution.mergeKLists(toMerge);

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

        Assertions.assertThat(v1).isEqualTo(1);
        Assertions.assertThat(v2).isEqualTo(1);
        Assertions.assertThat(v3).isEqualTo(2);
        Assertions.assertThat(v4).isEqualTo(3);
        Assertions.assertThat(v5).isEqualTo(4);
        Assertions.assertThat(v6).isEqualTo(4);
        Assertions.assertThat(v7).isEqualTo(5);
        Assertions.assertThat(v8).isEqualTo(6);
    }
}