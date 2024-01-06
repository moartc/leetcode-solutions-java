package solutions.algorithms._0_999._102_Binary_Tree_Level_Order_Traversal;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._102_Binary_Tree_Level_Order_Traversal.Solution;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void levelOrderTest1() {
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, new TreeNode(9), right);
        List<List<Integer>> expected = List.of(
                List.of(3),
                List.of(9, 20),
                List.of(15, 7)
        );
        var actual = solution.levelOrder(root);
        Assertions.assertThat(actual).hasSameElementsAs(expected);
    }

    @Test
    void levelOrderTest2() {
        TreeNode root = new TreeNode(1);
        List<List<Integer>> expected = List.of(List.of(1));
        var actual = solution.levelOrder(root);
        Assertions.assertThat(actual).hasSameElementsAs(expected);
    }

    @Test
    void levelOrderTest3() {
        TreeNode root = null;
        List<List<Integer>> expected = List.of();
        var actual = solution.levelOrder(root);
        Assertions.assertThat(actual).hasSameElementsAs(expected);
    }

    @Test
    void levelOrderTest4() {
        TreeNode left = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, left, new TreeNode(9));
        List<List<Integer>> expected = List.of(
                List.of(3),
                List.of(20, 9),
                List.of(15, 7)
        );
        var actual = solution.levelOrder(root);
        Assertions.assertThat(actual).hasSameElementsAs(expected);
    }

    @Test
    void levelOrderTest5() {
        /*
                1
               /  \
              2    3
             /    / \
            4   5    6
         */
        TreeNode left = new TreeNode(2, new TreeNode(4), null);
        TreeNode right = new TreeNode(3, new TreeNode(5), new TreeNode(6));
        TreeNode root = new TreeNode(1, left, right);
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(2, 3),
                List.of(4, 5, 6)
        );
        var actual = solution.levelOrder(root);
        Assertions.assertThat(actual).hasSameElementsAs(expected);
    }

    @Test
    void levelOrderTest6() {
        /*
                1
               /  \
              2    3
             /      \
            4        5
         */
        TreeNode left = new TreeNode(2, new TreeNode(4), null);
        TreeNode right = new TreeNode(3, null, new TreeNode(5));
        TreeNode root = new TreeNode(1, left, right);
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(2, 3),
                List.of(4, 5)
        );
        var actual = solution.levelOrder(root);
        Assertions.assertThat(actual).hasSameElementsAs(expected);
    }

    @Test
    void levelOrderTest7() {
        /*
                1
               /  \
              2   null
             / \
            3  null
           / \
          4  null
         /
        5
         */
        TreeNode left4 = new TreeNode(4, new TreeNode(5), null);
        TreeNode left3 = new TreeNode(3, left4, null);
        TreeNode left2 = new TreeNode(2, left3, null);
        TreeNode root = new TreeNode(1, left2, null);

        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(2),
                List.of(3),
                List.of(4),
                List.of(5)
        );
        var actual = solution.levelOrder(root);
        Assertions.assertThat(actual).hasSameElementsAs(expected);
    }
}