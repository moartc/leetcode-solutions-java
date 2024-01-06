package solutions.algorithms._0_999._226_Invert_Binary_Tree;

import commons.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._226_Invert_Binary_Tree.Solution;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void invertTreeTest1() {
        TreeNode leftBranchInput = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode rightBranchInput = new TreeNode(7, new TreeNode(6), new TreeNode(9));
        TreeNode rootInput = new TreeNode(4, leftBranchInput, rightBranchInput);

        TreeNode leftBranchOutput = new TreeNode(7, new TreeNode(9), new TreeNode(6));
        TreeNode rightBranchOutput = new TreeNode(2, new TreeNode(3), new TreeNode(1));
        TreeNode rootOutput = new TreeNode(4, leftBranchOutput, rightBranchOutput);

        TreeNode actual = solution.invertTree(rootInput);
        Assertions.assertTrue(isSameTree(rootOutput, actual));
    }

    @Test
    void invertTreeTest2() {
        TreeNode rootInput = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode rootOutput = new TreeNode(2, new TreeNode(3), new TreeNode(1));

        TreeNode actual = solution.invertTree(rootInput);
        Assertions.assertTrue(isSameTree(rootOutput, actual));
    }

    @Test
    void invertTreeTest3() {
        TreeNode actual = solution.invertTree(null);
        Assertions.assertNull(actual);
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        return areEquals(p, q);
    }

    private boolean areEquals(TreeNode p, TreeNode q) {
        if (p.left != null && q.left != null) {
            if (!areEquals(p.left, q.left)) {
                return false;
            }
        } else if (p.left != null || q.left != null) {
            return false;
        }
        if (p.right != null && q.right != null) {
            if (!areEquals(p.right, q.right)) {
                return false;
            }
        } else if (p.right != null || q.right != null) {
            return false;
        }
        return p.val == q.val;
    }

}