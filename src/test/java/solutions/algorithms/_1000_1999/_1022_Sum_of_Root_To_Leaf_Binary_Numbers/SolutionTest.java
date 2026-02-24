package solutions.algorithms._1000_1999._1022_Sum_of_Root_To_Leaf_Binary_Numbers;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sumRootToLeaf1() {

        TreeNode left = new TreeNode(0, new TreeNode(0), new TreeNode(1));
        TreeNode right = new TreeNode(1, new TreeNode(0), new TreeNode(1));
        TreeNode root = new TreeNode(1, left, right);
        int answer = solution.sumRootToLeaf(root);
        Assertions.assertThat(answer).isEqualTo(22);
    }

    @Test
    void sumRootToLeaf2() {

        TreeNode root = new TreeNode(0);
        int answer = solution.sumRootToLeaf(root);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}