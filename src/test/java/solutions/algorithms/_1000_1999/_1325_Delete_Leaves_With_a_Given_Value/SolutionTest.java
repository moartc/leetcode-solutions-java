package solutions.algorithms._1000_1999._1325_Delete_Leaves_With_a_Given_Value;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void removeLeafNodes1() {

        TreeNode left = new TreeNode(2, new TreeNode(2), null);
        TreeNode right = new TreeNode(3, new TreeNode(2), new TreeNode(4));
        TreeNode root = new TreeNode(1, left, right);

        TreeNode answer = solution.removeLeafNodes(root, 2);

        Assertions.assertThat(answer.val).isEqualTo(1);
        Assertions.assertThat(answer.left).isNull();
        Assertions.assertThat(answer.right.val).isEqualTo(3);
        Assertions.assertThat(answer.right.left).isNull();
        Assertions.assertThat(answer.right.right.val).isEqualTo(4);
    }

    @Test
    void removeLeafNodes2() {

        TreeNode left = new TreeNode(3, new TreeNode(3), new TreeNode(2));
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);

        TreeNode answer = solution.removeLeafNodes(root, 3);

        Assertions.assertThat(answer.val).isEqualTo(1);
        Assertions.assertThat(answer.left.val).isEqualTo(3);
        Assertions.assertThat(answer.right).isNull();
        Assertions.assertThat(answer.left.left).isNull();
        Assertions.assertThat(answer.left.right.val).isEqualTo(2);
    }

    @Test
    void removeLeafNodes3() {

        TreeNode leftLeft = new TreeNode(2, new TreeNode(2), null);
        TreeNode left = new TreeNode(2, leftLeft, null);
        TreeNode root = new TreeNode(1, left, null);

        TreeNode answer = solution.removeLeafNodes(root, 2);

        Assertions.assertThat(answer.val).isEqualTo(1);
        Assertions.assertThat(answer.left).isNull();
        Assertions.assertThat(answer.right).isNull();
    }
}