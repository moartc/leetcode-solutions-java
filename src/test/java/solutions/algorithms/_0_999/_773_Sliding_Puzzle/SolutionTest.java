package solutions.algorithms._0_999._773_Sliding_Puzzle;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void slidingPuzzle1() {
        int[][] board = new int[][]{{1, 2, 3}, {4, 0, 5}};
        int answer = solution.slidingPuzzle(board);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void slidingPuzzle2() {
        int[][] board = new int[][]{{1, 2, 3}, {5, 4, 0}};
        int answer = solution.slidingPuzzle(board);
        Assertions.assertThat(answer).isEqualTo(-1);
    }

    @Test
    void slidingPuzzle3() {
        int[][] board = new int[][]{{4, 1, 2}, {5, 0, 3}};
        int answer = solution.slidingPuzzle(board);
        Assertions.assertThat(answer).isEqualTo(5);
    }
}