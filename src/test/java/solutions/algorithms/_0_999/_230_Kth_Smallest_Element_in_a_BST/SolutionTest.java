package solutions.algorithms._0_999._230_Kth_Smallest_Element_in_a_BST;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void kthSmallestTest1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(1, null, new TreeNode(2)),
                new TreeNode(4));

        int answer = solution.kthSmallest(root, 1);

        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void kthSmallestTest2() {

        TreeNode left2 = new TreeNode(2, new TreeNode(1), null);
        TreeNode left3 = new TreeNode(3, left2, new TreeNode(4));
        TreeNode root = new TreeNode(5, left3, new TreeNode(6));

        int answer = solution.kthSmallest(root, 3);

        Assertions.assertThat(answer).isEqualTo(3);
    }
}