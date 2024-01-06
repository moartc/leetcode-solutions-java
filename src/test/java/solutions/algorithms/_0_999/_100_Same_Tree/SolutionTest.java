package solutions.algorithms._0_999._100_Same_Tree;

import commons.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._100_Same_Tree.Solution;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void isSameTree1() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Assertions.assertTrue(solution.isSameTree(p, q));
    }

    @Test
    void isSameTree2() {
        TreeNode p = new TreeNode(1, new TreeNode(2), null);
        TreeNode q = new TreeNode(1, null, new TreeNode(2));
        Assertions.assertFalse(solution.isSameTree(p, q));
    }

    @Test
    void isSameTree3() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode q = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        Assertions.assertFalse(solution.isSameTree(p, q));
    }

    @Test
    void isSameTree4() {
        TreeNode p = null;
        TreeNode q = null;
        Assertions.assertTrue(solution.isSameTree(p, q));
    }
}