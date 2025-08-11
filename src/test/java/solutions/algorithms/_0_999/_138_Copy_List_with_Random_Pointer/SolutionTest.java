package solutions.algorithms._0_999._138_Copy_List_with_Random_Pointer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionTest {

    private final Solution solution = new Solution();


    private Node n7 = new Node(7);
    private Node n13 = new Node(13);
    private Node n11 = new Node(11);
    private Node n10 = new Node(10);
    private Node n1 = new Node(1);
    private Node n2 = new Node(2);
    private Node n3_1 = new Node(3);
    private Node n3_2 = new Node(3);
    private Node n3_3 = new Node(3);


    @Test
    void copyRandomListTest1() {

        n7.next = n13;
        n7.random = null;

        n13.next = n11;
        n13.random = n7;

        n11.next = n10;
        n11.random = n1;

        n10.next = n1;
        n10.random = n11;

        n1.next = null;
        n1.random = n7;

        Node solutionNode = solution.copyRandomList(n7);
        Node originalNode = n7;
        // iterate over original, compare node is different, compare values
        while (originalNode != null) {
            Assertions.assertThat(originalNode.val).isEqualTo(solutionNode.val);
            if (originalNode.random != null) {
                Assertions.assertThat(originalNode.random.val).isEqualTo(solutionNode.random.val);
            }
            originalNode = originalNode.next;
            solutionNode = solutionNode.next;
        }


    }

    @Test
    void copyRandomListTest2() {

        n1.next = n2;
        n1.random = n2;

        n2.next = null;
        n2.random = n2;

        Node solutionNode = solution.copyRandomList(n1);
        Node originalNode = n1;
        // iterate over original, compare node is different, compare values
        while (originalNode != null) {
            Assertions.assertThat(originalNode.val).isEqualTo(solutionNode.val);
            if (originalNode.random != null) {
                Assertions.assertThat(originalNode.random.val).isEqualTo(solutionNode.random.val);
            }
            originalNode = originalNode.next;
            solutionNode = solutionNode.next;
        }
    }

    @Test
    void copyRandomListTest3() {

        n3_1.next = n3_2;
        n3_1.random = null;

        n3_2.next = n3_3;
        n3_2.random = n3_1;

        n3_3.next = null;
        n3_3.random = null;

        Node solutionNode = solution.copyRandomList(n3_1);
        Node originalNode = n3_1;
        // iterate over original, compare node is different, compare values
        while (originalNode != null) {
            Assertions.assertThat(originalNode.val).isEqualTo(solutionNode.val);
            if (originalNode.random != null) {
                Assertions.assertThat(originalNode.random.val).isEqualTo(solutionNode.random.val);
            }
            originalNode = originalNode.next;
            solutionNode = solutionNode.next;
        }
    }

}