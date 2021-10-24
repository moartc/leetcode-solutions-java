package solutions._110_Balanced_Binary_Tree;

import commons.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void isBalancedTest1() {

        TreeNode input = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        input.left = left;
        input.right = right;
        Assertions.assertTrue(solution.isBalanced(input));
    }

    @Test
    void isBalancedTest2() {

        TreeNode leftLeft = new TreeNode(3, new TreeNode(4), new TreeNode(4));
        TreeNode left = new TreeNode(2, leftLeft, new TreeNode(3));
        TreeNode input = new TreeNode(1, left, new TreeNode(2));
        Assertions.assertFalse(solution.isBalanced(input));
    }

    @Test
    void isBalancedTest3() {

        TreeNode input = null;
        Assertions.assertTrue(solution.isBalanced(input));
    }

    @Test
    void isBalancedTest4() {

        TreeNode input = new TreeNode(1);
        Assertions.assertTrue(solution.isBalanced(input));
    }

    @Test
    void isBalancedTest5() {

        TreeNode right = new TreeNode(2, null, new TreeNode(3));
        TreeNode input = new TreeNode(1, null, right);
        Assertions.assertFalse(solution.isBalanced(input));
    }

    @Test
    void isBalancedTest6() {

        TreeNode leftLeft = new TreeNode(3, new TreeNode(4), null);
        TreeNode rightRight = new TreeNode(3, null, new TreeNode(4));
        TreeNode left = new TreeNode(2, leftLeft, null);
        TreeNode right = new TreeNode(2, null, rightRight);
        TreeNode treeNode = new TreeNode(1, left, right);
        Assertions.assertFalse(solution.isBalanced(treeNode));
    /*
    [1,2,2,3,null,null,3,4,null,null,4]

                    1
               2          2
           3      x    x     3
        4    x              x   4
    */
    }
}