package solutions.algorithms._0_999._130_Surrounded_Regions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void solveTest1() {
        char[][] board = new char[][]{{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        char[][] expected = {{'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'O', 'X', 'X'}};
        solution.solve(board);
        Assertions.assertThat(board).isEqualTo(expected);
    }

    @Test
    void solveTest2() {
        char[][] board = new char[][]{{'O'}};
        char[][] expected = {{'O'}};
        solution.solve(board);
        Assertions.assertThat(board).isEqualTo(expected);
    }
}