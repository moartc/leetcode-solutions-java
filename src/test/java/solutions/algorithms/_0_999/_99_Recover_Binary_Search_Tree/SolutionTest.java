package solutions.algorithms._0_999._99_Recover_Binary_Search_Tree;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void recoverTree1() {
        TreeNode root = new TreeNode(1, new TreeNode(3, null, new TreeNode(2)), null);
        solution.recoverTree(root);

        Assertions.assertThat(root.val).isEqualTo(3);
        Assertions.assertThat(root.left.val).isEqualTo(1);
        Assertions.assertThat(root.left.left).isNull();
        Assertions.assertThat(root.left.right.val).isEqualTo(2);
        Assertions.assertThat(root.right).isNull();
    }

    @Test
    void recoverTree2() {
        TreeNode root = new TreeNode(3, new TreeNode(1), new TreeNode(4, new TreeNode(2), null));
        solution.recoverTree(root);

        Assertions.assertThat(root.val).isEqualTo(2);
        Assertions.assertThat(root.left.val).isEqualTo(1);
        Assertions.assertThat(root.right.val).isEqualTo(4);
        Assertions.assertThat(root.right.left.val).isEqualTo(3);
    }

    @Test
    void recoverTree3() {
        TreeNode root = new TreeNode(2, new TreeNode(3), new TreeNode(1));
        solution.recoverTree(root);

        Assertions.assertThat(root.val).isEqualTo(2);
        Assertions.assertThat(root.left.val).isEqualTo(1);
        Assertions.assertThat(root.right.val).isEqualTo(3);
    }
}