package solutions.algorithms._2000_2999._2196_Create_Binary_Tree_From_Descriptions;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void createBinaryTree1() {

        int[][] descriptions = new int[][]{{20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0}, {80, 19, 1}};
        TreeNode answer = solution.createBinaryTree(descriptions);

        TreeNode left = answer.left;
        TreeNode right = answer.right;
        Assertions.assertThat(answer.val).isEqualTo(50);
        Assertions.assertThat(left.val).isEqualTo(20);
        Assertions.assertThat(left.left.val).isEqualTo(15);
        Assertions.assertThat(left.right.val).isEqualTo(17);
        Assertions.assertThat(left.left.left).isNull();
        Assertions.assertThat(left.left.right).isNull();
        Assertions.assertThat(left.right.left).isNull();
        Assertions.assertThat(left.right.right).isNull();
        Assertions.assertThat(right.val).isEqualTo(80);
        Assertions.assertThat(right.left.val).isEqualTo(19);
        Assertions.assertThat(right.right).isNull();
    }

    @Test
    void createBinaryTree2() {

        int[][] descriptions = new int[][]{{1, 2, 1}, {2, 3, 0}, {3, 4, 1}};
        TreeNode answer = solution.createBinaryTree(descriptions);

        TreeNode left = answer.left;
        Assertions.assertThat(answer.val).isEqualTo(1);
        Assertions.assertThat(left.val).isEqualTo(2);
        Assertions.assertThat(answer.right).isNull();
        Assertions.assertThat(left.left).isNull();
        Assertions.assertThat(left.right.val).isEqualTo(3);
        Assertions.assertThat(left.right.left.val).isEqualTo(4);
        Assertions.assertThat(left.right.right).isNull();
    }

    @Test
    void createBinaryTree3() {

        int[][] descriptions = new int[][]{{39, 70, 1}, {13, 39, 1}, {85, 74, 1}, {74, 13, 1}, {38, 82, 1}, {82, 85, 1}};
        TreeNode answer = solution.createBinaryTree(descriptions);
        // just one assert - I failed on the root
        Assertions.assertThat(answer.val).isEqualTo(38);
    }
}