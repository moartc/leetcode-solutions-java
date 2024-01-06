package solutions.algorithms._0_999._117_Populating_Next_Right_Pointers_in_Each_Node_II;

import commons.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._117_Populating_Next_Right_Pointers_in_Each_Node_II.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void connectTest1() {
            /*
                 1
               /   \
              2     3
             / \     \
           4    5     7
    */
        Node left = new Node(2, new Node(4), new Node(5), null);
        Node right = new Node(3, null, new Node(7), null);
        Node root = new Node(1, left, right, null);

        solution.connect(root);

        Assertions.assertNull(root.next);
        Assertions.assertEquals(3, root.left.next.val);
        Assertions.assertNull(root.right.next);
        Assertions.assertNull(root.right.right.next);
        Assertions.assertEquals(5, root.left.left.next.val);
        Assertions.assertEquals(7, root.left.right.next.val);
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

    @Test
    void connectTest5() {
        Node left = new Node(2, new Node(4), new Node(5), null);
        Node right = new Node(3, null, new Node(7), null);
        Node root = new Node(1, left, right, null);

        solution.connect(root);

        Assertions.assertNull(root.next);
        Assertions.assertEquals(3, root.left.next.val);
        Assertions.assertNull(root.right.next);
        Assertions.assertNull(root.right.right.next);
        Assertions.assertEquals(5, root.left.left.next.val);
        Assertions.assertEquals(7, root.left.right.next.val);
    }

    @Test
    void connectTest6() {
    /*
                 1
               /   \
              2     3
             /       \
            4         5
    */
        Node left = new Node(2, new Node(4), null, null);
        Node right = new Node(3, null, new Node(5), null);
        Node root = new Node(1, left, right, null);

        solution.connect(root);

        Assertions.assertNull(root.next);
        Assertions.assertEquals(3, root.left.next.val);
        Assertions.assertNull(root.right.next);
        Assertions.assertNull(root.right.right.next);
        Assertions.assertEquals(5, root.left.left.next.val);
        Assertions.assertEquals(4, root.left.left.val);
    }

    @Test
    void connectTest7() {
    /*
                 1
               /   \
              2     3
               \     \
                4     5
               /       \
              6         7
    */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.left = new Node(6);
        root.right.right = new Node(5);
        root.right.right.right = new Node(7);

        solution.connect(root);

        Assertions.assertNull(root.next);
        Assertions.assertEquals(3, root.left.next.val);
        Assertions.assertEquals(5, root.left.right.next.val);
        Assertions.assertEquals(7, root.left.right.left.next.val);
        Assertions.assertNull(root.right.next);
        Assertions.assertNull(root.right.right.next);
        Assertions.assertNull(root.right.right.right.next);
    }

    @Test
    void connectTest8() {
    /*
     [0,2,4,1,null,3,-1,5,1,null,6,null,8]

                 0
               /   \
              2     4
             /     /  \
            1     3   -1
           / \     \    \
          5   1     6    8
    */
        Node leftLeft = new Node(1, new Node(5), new Node(1), null);
        Node left = new Node(2, leftLeft, null, null);
        Node rightLeft = new Node(3, null, new Node(6), null);
        Node rightRight = new Node(-1, null, new Node(8), null);
        Node right = new Node(4, rightLeft, rightRight, null);
        Node root = new Node(0, left, right, null);


        solution.connect(root);

        Assertions.assertNull(root.next);
        Assertions.assertEquals(4, root.left.next.val);
        Assertions.assertEquals(3, root.left.left.next.val);
        Assertions.assertEquals(1, root.left.left.left.next.val);
        Assertions.assertEquals(6, root.left.left.right.next.val);
        Assertions.assertEquals(-1, root.right.left.next.val);
        Assertions.assertEquals(8, root.right.left.right.next.val);
        Assertions.assertNull(root.right.next);
        Assertions.assertNull(root.right.right.next);
        Assertions.assertNull(root.right.right.right.next);
    }

    @Test
    void connectTest9() {
    /*
     [1,2,3,4,5,null,6,7,null,null,null,null,8]

                 1
               /   \
              2     3
             / \     \
            4   5     6
           /           \
          7             8
    */
        Node leftLeft = new Node(4, new Node(7), null, null);
        Node left = new Node(2, leftLeft, new Node(5), null);
        Node rightRight = new Node(6, null, new Node(8), null);
        Node right = new Node(3, null, rightRight, null);
        Node root = new Node(1, left, right, null);


        solution.connect(root);

        Assertions.assertNull(root.next);
        Assertions.assertEquals(3, root.left.next.val);
        Assertions.assertEquals(5, root.left.left.next.val);
        Assertions.assertEquals(6, root.left.right.next.val);
        Assertions.assertEquals(8, root.left.left.left.next.val);

        Assertions.assertNull(root.right.next);
        Assertions.assertNull(root.right.right.next);
        Assertions.assertNull(root.right.right.right.next);
    }

    @Test
    void connectTest10() {
    /*
                 1
               /   \
              2     3
             / \     \
            4   5     6
           /     \     \
          7       8     9
    */
        Node leftLeft = new Node(4, new Node(7), null, null);
        Node leftRight = new Node(5, null, new Node(8), null);
        Node left = new Node(2, leftLeft, leftRight, null);
        Node rightRight = new Node(6, null, new Node(9), null);
        Node right = new Node(3, null, rightRight, null);
        Node root = new Node(1, left, right, null);


        solution.connect(root);

        Assertions.assertNull(root.next);
        Assertions.assertEquals(3, root.left.next.val);
        Assertions.assertEquals(5, root.left.left.next.val);
        Assertions.assertEquals(6, root.left.right.next.val);
        Assertions.assertEquals(8, root.left.left.left.next.val);
        Assertions.assertEquals(9, root.left.right.right.next.val);

        Assertions.assertNull(root.right.next);
        Assertions.assertNull(root.right.right.next);
        Assertions.assertNull(root.right.right.right.next);
    }

    @Test
    void connectTest11() {
    /*
    [4,-4,8,1,null,null,null,-4,-9,null,null,8,-9,7,-9,-6,6,null,null,null,null,null,null,-7,null,null,-1]

                 4
               /   \
             -4     8
             /
            1
           / \
         -4   -9
             /  \
            8    -9
           / \   / \
          7  -9 -6  6
                   /
                 -7
                   \
                   -1
    */
        Node llrrrl = new Node(-7, null, new Node(-1), null);
        Node llrrr = new Node(6, llrrrl, null, null);
        Node llrr = new Node(-9, new Node(-6), llrrr, null);
        Node llrl = new Node(8, new Node(7), new Node(-9), null);
        Node leftLeftRight = new Node(-9, llrl, llrr, null);
        Node leftLeft = new Node(1, new Node(-4), leftLeftRight, null);
        Node left = new Node(-4, leftLeft, null, null);
        Node root = new Node(4, left, new Node(8), null);


        solution.connect(root);

        Assertions.assertNull(root.next);
        Assertions.assertEquals(8, root.left.next.val);
        Assertions.assertEquals(-9, root.left.left.left.next.val);
        Assertions.assertEquals(-9, root.left.left.right.left.next.val);
        Assertions.assertEquals(-9, root.left.left.right.left.left.next.val);
        Assertions.assertEquals(-6, root.left.left.right.left.right.next.val);
        Assertions.assertEquals(6, root.left.left.right.right.left.next.val);

        Assertions.assertNull(root.right.next);
        Assertions.assertNull(root.left.left.next);
        Assertions.assertNull(root.left.left.right.next);
        Assertions.assertNull(root.left.left.right.right.next);
        Assertions.assertNull(root.left.left.right.right.right.next);
        Assertions.assertNull(root.left.left.right.right.right.left.next);
        Assertions.assertNull(root.left.left.right.right.right.left.right.next);
    }
}