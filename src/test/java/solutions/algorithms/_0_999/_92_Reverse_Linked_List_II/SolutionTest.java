package solutions.algorithms._0_999._92_Reverse_Linked_List_II;

import commons.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reverseBetween1() {

        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        int left = 2;
        int right = 4;

        ListNode answer = solution.reverseBetween(n1, left, right);

        int f1 = answer.val;
        int f2 = answer.next.val;
        int f3 = answer.next.next.val;
        int f4 = answer.next.next.next.val;
        int f5 = answer.next.next.next.next.val;
        Assertions.assertThat(f1).isEqualTo(1);
        Assertions.assertThat(f2).isEqualTo(4);
        Assertions.assertThat(f3).isEqualTo(3);
        Assertions.assertThat(f4).isEqualTo(2);
        Assertions.assertThat(f5).isEqualTo(5);
    }

    @Test
    void reverseBetween2() {

        ListNode n1 = new ListNode(5);
        int left = 1;
        int right = 1;

        ListNode answer = solution.reverseBetween(n1, left, right);

        int f1 = answer.val;
        Assertions.assertThat(f1).isEqualTo(5);
    }

    @Test
    void reverseBetween3() {

        ListNode n2 = new ListNode(5);
        ListNode n1 = new ListNode(3, n2);
        int left = 1;
        int right = 1;

        ListNode answer = solution.reverseBetween(n1, left, right);

        int f1 = answer.val;
        int f2 = answer.next.val;
        Assertions.assertThat(f1).isEqualTo(3);
        Assertions.assertThat(f2).isEqualTo(5);
    }

    @Test
    void reverseBetween4() {
        // 3 -> 5, expected: 5->3
        ListNode n2 = new ListNode(5);
        ListNode n1 = new ListNode(3, n2);
        int left = 1;
        int right = 2;

        ListNode answer = solution.reverseBetween(n1, left, right);

        int f1 = answer.val;
        int f2 = answer.next.val;
        Assertions.assertThat(f1).isEqualTo(5);
        Assertions.assertThat(f2).isEqualTo(3);
        ListNode afterSecond = answer.next.next;
        Assertions.assertThat(afterSecond).isNull();
    }

    @Test
    void reverseBetween5() {
        ListNode n3 = new ListNode(3);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        int left = 1;
        int right = 2;

        ListNode answer = solution.reverseBetween(n1, left, right);

        int f1 = answer.val;
        int f2 = answer.next.val;
        int f3 = answer.next.next.val;
        Assertions.assertThat(f1).isEqualTo(2);
        Assertions.assertThat(f2).isEqualTo(1);
        Assertions.assertThat(f3).isEqualTo(3);

        ListNode afterThird = answer.next.next.next;
        Assertions.assertThat(afterThird).isNull();
    }

    @Test
    void reverseBetween6() {
        // 1 -> 2 -> 3, expected: 1->3->2
        ListNode n3 = new ListNode(3);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        int left = 2;
        int right = 3;

        ListNode answer = solution.reverseBetween(n1, left, right);

        int f1 = answer.val;
        int f2 = answer.next.val;
        int f3 = answer.next.next.val;
        Assertions.assertThat(f1).isEqualTo(1);
        Assertions.assertThat(f2).isEqualTo(3);
        Assertions.assertThat(f3).isEqualTo(2);

        ListNode afterThird = answer.next.next.next;
        Assertions.assertThat(afterThird).isNull();
    }

}