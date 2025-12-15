package solutions.algorithms._0_999._427_Construct_Quad_Tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void construct1() {

        int[][] grid = new int[][]{{0, 1}, {1, 0}};
        Node node = solution.construct(grid);

        Assertions.assertThat(node.isLeaf).isFalse();
        Assertions.assertThat(node.val).isFalse();
        // all inside are leaves
        Assertions.assertThat(node.topLeft.isLeaf).isTrue();
        Assertions.assertThat(node.topRight.isLeaf).isTrue();
        Assertions.assertThat(node.bottomLeft.isLeaf).isTrue();
        Assertions.assertThat(node.bottomRight.isLeaf).isTrue();
        // nad have value == 1
        Assertions.assertThat(node.topLeft.val).isFalse();
        Assertions.assertThat(node.topRight.val).isTrue();
        Assertions.assertThat(node.bottomLeft.val).isTrue();
        Assertions.assertThat(node.bottomRight.val).isFalse();
    }

    @Test
    void construct2() {

        int[][] grid = new int[][]{
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0}
        };
        Node node = solution.construct(grid);

        Assertions.assertThat(node.isLeaf).isFalse();

        Assertions.assertThat(node.topLeft.isLeaf).isTrue();
        Assertions.assertThat(node.topLeft.val).isTrue();

        Assertions.assertThat(node.topRight.isLeaf).isFalse();
        // no check for its value

        Assertions.assertThat(node.bottomLeft.isLeaf).isTrue();
        Assertions.assertThat(node.bottomLeft.val).isTrue();

        Assertions.assertThat(node.bottomRight.isLeaf).isTrue();
        Assertions.assertThat(node.bottomRight.val).isFalse();

        // now top right
        Assertions.assertThat(node.topRight.topLeft.isLeaf).isTrue();
        Assertions.assertThat(node.topRight.topLeft.val).isFalse();
        Assertions.assertThat(node.topRight.topRight.isLeaf).isTrue();
        Assertions.assertThat(node.topRight.topRight.val).isFalse();
        Assertions.assertThat(node.topRight.bottomLeft.isLeaf).isTrue();
        Assertions.assertThat(node.topRight.bottomLeft.val).isTrue();
        Assertions.assertThat(node.topRight.bottomRight.isLeaf).isTrue();
        Assertions.assertThat(node.topRight.bottomRight.val).isTrue();
    }
}