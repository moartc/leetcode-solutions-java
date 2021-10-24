package solutions._112_Path_Sum;

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
    void hasPathSumTest1() {

        TreeNode leftLeft = new TreeNode(11, new TreeNode(7), new TreeNode(2));
        TreeNode left = new TreeNode(4, leftLeft, null);
        TreeNode rightTight = new TreeNode(4, null, new TreeNode(1));
        TreeNode right = new TreeNode(8, new TreeNode(13), rightTight);
        TreeNode root = new TreeNode(5, left, right);
        int targetSum = 22;
        Assertions.assertTrue(solution.hasPathSum(root, targetSum));
    }

    @Test
    void hasPathSumTest2() {

        TreeNode root = new TreeNode(5, new TreeNode(2), new TreeNode(3));
        int targetSum = 5;
        Assertions.assertFalse(solution.hasPathSum(root, targetSum));
    }

    @Test
    void hasPathSumTest3() {

        TreeNode root = new TreeNode(5, new TreeNode(2), null);
        int targetSum = 0;
        Assertions.assertFalse(solution.hasPathSum(root, targetSum));
    }

    @Test
    void hasPathSumTest4() {

        TreeNode root = null;
        int targetSum = 0;
        Assertions.assertFalse(solution.hasPathSum(root, targetSum));
    }
}