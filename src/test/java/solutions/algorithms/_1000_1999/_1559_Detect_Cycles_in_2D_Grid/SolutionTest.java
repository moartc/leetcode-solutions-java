package solutions.algorithms._1000_1999._1559_Detect_Cycles_in_2D_Grid;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void containsCycle1() {
        char[][] grid = new char[][]{{'a', 'a', 'a', 'a'}, {'a', 'b', 'b', 'a'}, {'a', 'b', 'b', 'a'}, {'a', 'a', 'a', 'a'}};
        boolean answer = solution.containsCycle(grid);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void containsCycle2() {
        char[][] grid = new char[][]{{'c', 'c', 'c', 'a'}, {'c', 'd', 'c', 'c'}, {'c', 'c', 'e', 'c'}, {'f', 'c', 'c', 'c'}};
        boolean answer = solution.containsCycle(grid);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void containsCycle3() {
        char[][] grid = new char[][]{{'a', 'b', 'b'}, {'b', 'z', 'b'}, {'b', 'b', 'a'}};
        boolean answer = solution.containsCycle(grid);
        Assertions.assertThat(answer).isFalse();
    }
}