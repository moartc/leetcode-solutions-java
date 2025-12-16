package solutions.algorithms._0_999._337_House_Robber_III;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void rob1() {

        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(2, null, new TreeNode(3));
        node.right = new TreeNode(3, null, new TreeNode(1));

        int answer = solution.rob(node);

        Assertions.assertThat(answer).isEqualTo(7);
    }

    @Test
    void rob2() {

        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(4, new TreeNode(1), new TreeNode(3));
        node.right = new TreeNode(5, null, new TreeNode(1));

        int answer = solution.rob(node);

        Assertions.assertThat(answer).isEqualTo(9);
    }
}