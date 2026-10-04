package solutions.algorithms._0_999._404_Sum_of_Left_Leaves;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sumOfLeftLeaves1() {
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, left, right);
        int answer = solution.sumOfLeftLeaves(root);
        Assertions.assertThat(answer).isEqualTo(24);
    }

    @Test
    void sumOfLeftLeaves2() {
        TreeNode root = new TreeNode(1);
        int answer = solution.sumOfLeftLeaves(root);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}