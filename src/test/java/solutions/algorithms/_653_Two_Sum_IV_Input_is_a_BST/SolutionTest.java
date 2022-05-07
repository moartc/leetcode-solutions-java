package solutions.algorithms._653_Two_Sum_IV_Input_is_a_BST;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findTargetTest1() {
        TreeNode left = new TreeNode(3, new TreeNode(2), new TreeNode(4));
        TreeNode right = new TreeNode(6, null, new TreeNode(7));
        TreeNode root = new TreeNode(5, left, right);
        boolean target = solution.findTarget(root, 9);
        Assertions.assertThat(target).isTrue();
    }

    @Test
    void findTargetTest2() {
        TreeNode left = new TreeNode(3, new TreeNode(2), new TreeNode(4));
        TreeNode right = new TreeNode(6, null, new TreeNode(7));
        TreeNode root = new TreeNode(5, left, right);
        boolean target = solution.findTarget(root, 28);
        Assertions.assertThat(target).isFalse();
    }

    @Test
    void findTargetTest3() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        boolean target = solution.findTarget(root, 4);
        Assertions.assertThat(target).isTrue();
    }
}