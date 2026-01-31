package solutions.algorithms._2000_2999._2807_Insert_Greatest_Common_Divisors_in_Linked_List;

import commons.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    private final Solution solution = new Solution();

    @Test
    void insertGreatestCommonDivisors1() {

        ListNode n3 = new ListNode(3);
        ListNode n2 = new ListNode(10, n3);
        ListNode n1 = new ListNode(6, n2);
        ListNode head = new ListNode(18, n1);

        ListNode answer = solution.insertGreatestCommonDivisors(head);

        Assertions.assertThat(answer.val).isEqualTo(18);
        Assertions.assertThat(answer.next.val).isEqualTo(6);
        Assertions.assertThat(answer.next.next.val).isEqualTo(6);
        Assertions.assertThat(answer.next.next.next.val).isEqualTo(2);
        Assertions.assertThat(answer.next.next.next.next.val).isEqualTo(10);
        Assertions.assertThat(answer.next.next.next.next.next.val).isEqualTo(1);
        Assertions.assertThat(answer.next.next.next.next.next.next.val).isEqualTo(3);
    }

    @Test
    void insertGreatestCommonDivisors2() {
        ListNode head = new ListNode(7);

        ListNode answer = solution.insertGreatestCommonDivisors(head);

        Assertions.assertThat(answer.val).isEqualTo(7);
    }
}