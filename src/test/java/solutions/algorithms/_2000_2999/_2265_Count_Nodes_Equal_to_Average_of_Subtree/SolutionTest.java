package solutions.algorithms._2000_2999._2265_Count_Nodes_Equal_to_Average_of_Subtree;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void averageOfSubtree1() {
        TreeNode left = new TreeNode(8, new TreeNode(0), new TreeNode(1));
        TreeNode right = new TreeNode(5, null, new TreeNode(6));
        TreeNode root = new TreeNode(4, left, right);
        int answer = solution.averageOfSubtree(root);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void averageOfSubtree2() {
        TreeNode root = new TreeNode(1);
        int answer = solution.averageOfSubtree(root);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}