package solutions.algorithms._0_999._543_Diameter_of_Binary_Tree;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void diameterOfBinaryTreeTest1() {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int answer = solution.diameterOfBinaryTree(root);

        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void diameterOfBinaryTreeTest2() {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        int answer = solution.diameterOfBinaryTree(root);

        Assertions.assertThat(answer).isEqualTo(1);
    }
}