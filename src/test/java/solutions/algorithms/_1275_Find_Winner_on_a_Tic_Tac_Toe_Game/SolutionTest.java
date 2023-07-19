package solutions.algorithms._1275_Find_Winner_on_a_Tic_Tac_Toe_Game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void tictactoeTest1() {
        int[][] moves = {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};
        String result = solution.tictactoe(moves);
        Assertions.assertThat(result).isEqualTo("A");
    }

    @Test
    void tictactoeTest2() {
        int[][] moves = {{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}};
        String result = solution.tictactoe(moves);
        Assertions.assertThat(result).isEqualTo("B");
    }

    @Test
    void tictactoeTest3() {
        int[][] moves = {{0, 0}, {1, 1}, {2, 0}, {1, 0}, {1, 2}, {2, 1}, {0, 1}, {0, 2}, {2, 2}};
        String result = solution.tictactoe(moves);
        Assertions.assertThat(result).isEqualTo("Draw");
    }

    @Test
    void tictactoeTest4() {
        int[][] moves = {{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}};
        String result = solution.tictactoe(moves);
        Assertions.assertThat(result).isEqualTo("Pending");
    }
}