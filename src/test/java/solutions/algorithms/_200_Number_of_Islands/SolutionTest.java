package solutions.algorithms._200_Number_of_Islands;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numIslandsTest1() {
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
        };
        Assertions.assertThat(solution.numIslands(grid)).isEqualTo(1);
    }

    @Test
    void numIslandsTest2() {
        char[][] grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        Assertions.assertThat(solution.numIslands(grid)).isEqualTo(3);
    }

    @Test
    void numIslandsTest3() {
        char[][] grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '1', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '1', '1', '1'}
        };
        Assertions.assertThat(solution.numIslands(grid)).isEqualTo(1);
    }

    @Test
    void numIslandsTest4() {
        char[][] grid = new char[][]{
                {'0', '0', '1', '0', '0'},
                {'0', '1', '1', '0', '0'},
                {'0', '1', '1', '1', '0'},
                {'0', '0', '0', '0', '0'}
        };
        Assertions.assertThat(solution.numIslands(grid)).isEqualTo(1);
    }

    @Test
    void numIslandsTest5() {
        char[][] grid = new char[][]{
                {'0', '0', '1', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '1', '0', '1'},
                {'0', '0', '1', '1', '1'}
        };
        Assertions.assertThat(solution.numIslands(grid)).isEqualTo(1);
    }

    @Test
    void numIslandsTest6() {
        char[][] grid = new char[][]{
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        Assertions.assertThat(solution.numIslands(grid)).isZero();
    }

    @Test
    void numIslandsTest7() {
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'}
        };
        Assertions.assertThat(solution.numIslands(grid)).isEqualTo(1);
    }
}