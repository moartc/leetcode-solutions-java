package solutions.algorithms._0_999._257_Binary_Tree_Paths;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void binaryTreePaths1() {
        TreeNode left = new TreeNode(2, null, new TreeNode(5));
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);
        List<String> answer = solution.binaryTreePaths(root);
        Assertions.assertThat(answer).containsExactly("1->2->5", "1->3");
    }

    @Test
    void binaryTreePaths2() {
        TreeNode root = new TreeNode(1);
        List<String> answer = solution.binaryTreePaths(root);
        Assertions.assertThat(answer).containsExactly("1");
    }
}