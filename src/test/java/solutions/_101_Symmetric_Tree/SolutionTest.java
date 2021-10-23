package solutions._101_Symmetric_Tree;

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
    void isSymmetricTest1() {

        TreeNode input = new TreeNode(1);
        TreeNode left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        TreeNode right = new TreeNode(2, new TreeNode(4), new TreeNode(3));
        input.left = left;
        input.right = right;
        Assertions.assertTrue(solution.isSymmetric(input));
    }

    @Test
    void isSymmetricTest2() {

        TreeNode input = new TreeNode(1);
        TreeNode left = new TreeNode(2, null, new TreeNode(3));
        TreeNode right = new TreeNode(2, null, new TreeNode(3));
        input.left = left;
        input.right = right;
        Assertions.assertFalse(solution.isSymmetric(input));
    }
}