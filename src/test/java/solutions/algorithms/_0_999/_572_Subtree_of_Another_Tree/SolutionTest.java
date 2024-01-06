package solutions.algorithms._0_999._572_Subtree_of_Another_Tree;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._572_Subtree_of_Another_Tree.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isSubtreeTest1() {

        TreeNode left = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        TreeNode root = new TreeNode(3, left, new TreeNode(5));

        boolean subtree = solution.isSubtree(root, left);
        Assertions.assertThat(subtree).isTrue();
    }

    @Test
    void isSubtreeTest2() {

        TreeNode leftRight = new TreeNode(2, new TreeNode(0), null);
        TreeNode left = new TreeNode(4, new TreeNode(1), leftRight);
        TreeNode root = new TreeNode(3, left, new TreeNode(5));
        TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));

        boolean subtree = solution.isSubtree(root, subRoot);
        Assertions.assertThat(subtree).isFalse();
    }

    @Test
    void isSubtreeTest3() {

        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        boolean subtree = solution.isSubtree(root, root);
        Assertions.assertThat(subtree).isTrue();
    }
}