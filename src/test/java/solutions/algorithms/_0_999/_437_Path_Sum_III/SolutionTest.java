package solutions.algorithms._0_999._437_Path_Sum_III;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void pathSum1() {

        TreeNode t3 = new TreeNode(3, new TreeNode(2), new TreeNode(-2));
        TreeNode t2 = new TreeNode(2, null, new TreeNode(1));
        TreeNode t5 = new TreeNode(5, t3, t2);
        TreeNode tm3 = new TreeNode(-3, null, new TreeNode(11));
        TreeNode t10 = new TreeNode(10, t5, tm3);

        int answer = solution.pathSum(t10, 8);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void pathSum2() {

        TreeNode t7 = new TreeNode(7);
        TreeNode t2 = new TreeNode(2);
        TreeNode t11 = new TreeNode(11, t7, t2);
        TreeNode t4_left = new TreeNode(4, t11, null);
        TreeNode t13 = new TreeNode(13);
        TreeNode t5 = new TreeNode(5);
        TreeNode t1 = new TreeNode(1);
        TreeNode t4_right = new TreeNode(4, t5, t1);
        TreeNode t8 = new TreeNode(8, t13, t4_right);
        TreeNode root = new TreeNode(5, t4_left, t8);

        int answer = solution.pathSum(root, 22);
        Assertions.assertThat(answer).isEqualTo(3);
    }
}