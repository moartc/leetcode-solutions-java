package solutions.algorithms._0_999._430_Flatten_a_Multilevel_Doubly_Linked_List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void flatten1() {

        Node n1 = new Node();
        n1.val = 1;
        Node n2 = new Node();
        n2.val = 2;
        Node n3 = new Node();
        n3.val = 3;
        Node n4 = new Node();
        n4.val = 4;
        Node n5 = new Node();
        n5.val = 5;
        Node n6 = new Node();
        n6.val = 6;
        Node n7 = new Node();
        n7.val = 7;
        Node n8 = new Node();
        n8.val = 8;
        Node n9 = new Node();
        n9.val = 9;
        Node n10 = new Node();
        n10.val = 10;
        Node n11 = new Node();
        n11.val = 11;
        Node n12 = new Node();
        n12.val = 12;
        n1.next = n2;
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;
        n4.next = n5;
        n5.prev = n4;
        n5.next = n6;
        n6.prev = n5;
        n3.child = n7;
        n7.next = n8;
        n8.prev = n7;
        n8.next = n9;
        n9.prev = n8;
        n9.next = n10;
        n10.prev = n9;
        n8.child = n11;
        n11.next = n12;
        n12.prev = n11;

        Node answer = solution.flatten(n1);
        List<Integer> result = new ArrayList<>();
        Node curr = answer; // head
        while (curr != null) {
            result.add(curr.val);
            curr = curr.next;
        }
        Assertions.assertThat(result).containsExactly(1, 2, 3, 7, 8, 11, 12, 9, 10, 4, 5, 6);
    }

    @Test
    void flatten2() {

        Node n1 = new Node();
        n1.val = 1;
        Node n2 = new Node();
        n2.val = 2;
        Node n3 = new Node();
        n3.val = 3;
        n1.next = n2;
        n2.prev = n1;
        n1.child = n3;

        Node answer = solution.flatten(n1);

        List<Integer> result = new ArrayList<>();
        Node curr = answer;
        while (curr != null) {
            result.add(curr.val);
            curr = curr.next;
        }

        Assertions.assertThat(result).containsExactly(1, 3, 2);
    }

    @Test
    void flatten3() {

        Node head = null;
        Node answer = solution.flatten(head);

        List<Integer> result = new ArrayList<>();
        Node curr = answer;

        while (curr != null) {
            result.add(curr.val);
            curr = curr.next;
        }

        Assertions.assertThat(result).isEmpty();
    }
}