package solutions.algorithms._0_999._199_Binary_Tree_Right_Side_View;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void rightSideViewTest1() {
        TreeNode left = new TreeNode(2, null, new TreeNode(5, null, null));
        TreeNode right = new TreeNode(3, null, new TreeNode(4, null, null));
        TreeNode root = new TreeNode(1, left, right);

        List<Integer> answer = solution.rightSideView(root);

        Assertions.assertThat(answer).hasSameElementsAs(List.of(1, 3, 4));
    }

    @Test
    void rightSideViewTest2() {
        TreeNode left = new TreeNode(2, new TreeNode(4, new TreeNode(5, null, null), null), null);
        TreeNode right = new TreeNode(3, null, null);
        TreeNode root = new TreeNode(1, left, right);

        List<Integer> answer = solution.rightSideView(root);

        Assertions.assertThat(answer).hasSameElementsAs(List.of(1, 3, 4, 5));
    }

    @Test
    void rightSideViewTest3() {
        TreeNode root = new TreeNode(1, null, new TreeNode(3, null, null));

        List<Integer> answer = solution.rightSideView(root);

        Assertions.assertThat(answer).hasSameElementsAs(List.of(1, 3));
    }

    @Test
    void rightSideViewTest4() {
        TreeNode root = null;

        List<Integer> answer = solution.rightSideView(root);

        Assertions.assertThat(answer).hasSameElementsAs(List.of());
    }
}