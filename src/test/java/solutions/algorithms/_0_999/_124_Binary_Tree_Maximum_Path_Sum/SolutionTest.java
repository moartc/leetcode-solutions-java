package solutions.algorithms._0_999._124_Binary_Tree_Maximum_Path_Sum;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxPathSumTest1() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        int answer = solution.maxPathSum(root);

        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void maxPathSumTest2() {
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(-10, new TreeNode(9), right);

        int answer = solution.maxPathSum(root);

        Assertions.assertThat(answer).isEqualTo(42);
    }
}