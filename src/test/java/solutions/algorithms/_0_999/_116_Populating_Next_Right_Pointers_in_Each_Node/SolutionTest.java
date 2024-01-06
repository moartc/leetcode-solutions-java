package solutions.algorithms._0_999._116_Populating_Next_Right_Pointers_in_Each_Node;

import commons.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._116_Populating_Next_Right_Pointers_in_Each_Node.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void connectTest1() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        solution.connect(root);

        Assertions.assertNull(root.next);
        Assertions.assertEquals(3, root.left.next.val);
        Assertions.assertNull(root.right.next);
        Assertions.assertNull(root.right.right.next);
        Assertions.assertEquals(7, root.right.left.next.val);
        Assertions.assertEquals(5, root.left.left.next.val);
        Assertions.assertEquals(6, root.left.right.next.val);
    }

    @Test
    void connectTest2() {
        Node root = new Node(-1);
        root.left = new Node(0);
        root.right = new Node(1);
        root.left.left = new Node(2);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);

        root.left.left.left = new Node(6);
        root.left.left.right = new Node(7);
        root.left.right.left = new Node(8);
        root.left.right.right = new Node(9);
        root.right.left.left = new Node(10);
        root.right.left.right = new Node(11);
        root.right.right.left = new Node(12);
        root.right.right.right = new Node(13);

        solution.connect(root);

        Assertions.assertNull(root.next);
        Assertions.assertEquals(10, root.left.right.right.next.val);
        Assertions.assertEquals(1, root.left.next.val);
    }

    @Test
    void connectTest3() {
    /*
                -1
               /   \
              2    -3
             / \   / \
           -5   2 0   4
    */
        Node root = new Node(-1);
        root.left = new Node(2);
        root.right = new Node(-3);
        root.left.left = new Node(-5);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(4);

        solution.connect(root);

        Assertions.assertNull(root.next);
        Assertions.assertEquals(-3, root.left.next.val);
        Assertions.assertEquals(2, root.left.left.next.val);
        Assertions.assertEquals(0, root.left.right.next.val);
        Assertions.assertEquals(4, root.right.left.next.val);
        Assertions.assertNull(root.right.right.next);
    }

    @Test
    void connectTest4() {
        Node root = null;
        var actual = solution.connect(root);
        Assertions.assertNull(actual);
    }
}