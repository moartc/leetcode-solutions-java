package solutions.algorithms._0_999._37_Sudoku_Solver;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void solveSudoku1() {
        char[][] board = new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        solution.solveSudoku(board);

        Assertions.assertThat(board[0]).containsExactly('5', '3', '4', '6', '7', '8', '9', '1', '2');
        Assertions.assertThat(board[1]).containsExactly('6', '7', '2', '1', '9', '5', '3', '4', '8');
        Assertions.assertThat(board[2]).containsExactly('1', '9', '8', '3', '4', '2', '5', '6', '7');
        Assertions.assertThat(board[3]).containsExactly('8', '5', '9', '7', '6', '1', '4', '2', '3');
        Assertions.assertThat(board[4]).containsExactly('4', '2', '6', '8', '5', '3', '7', '9', '1');
        Assertions.assertThat(board[5]).containsExactly('7', '1', '3', '9', '2', '4', '8', '5', '6');
        Assertions.assertThat(board[6]).containsExactly('9', '6', '1', '5', '3', '7', '2', '8', '4');
        Assertions.assertThat(board[7]).containsExactly('2', '8', '7', '4', '1', '9', '6', '3', '5');
        Assertions.assertThat(board[8]).containsExactly('3', '4', '5', '2', '8', '6', '1', '7', '9');
    }

}