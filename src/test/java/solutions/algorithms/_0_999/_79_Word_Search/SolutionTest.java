package solutions.algorithms._0_999._79_Word_Search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._79_Word_Search.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void existTest1() {
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        boolean actual = solution.exist(board, word);
        Assertions.assertThat(actual).isTrue();
    }

    @Test
    void existTest2() {
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "SEE";
        boolean actual = solution.exist(board, word);
        Assertions.assertThat(actual).isTrue();
    }

    @Test
    void existTest3() {
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCB";
        boolean actual = solution.exist(board, word);
        Assertions.assertThat(actual).isFalse();
    }

    @Test
    void existTest4() {
        char[][] board = new char[][]{{'X', 'B', 'C', 'E'}, {'S', 'F', 'X', 'S'}, {'Q', 'W', 'E', 'R'}};
        String word = "BC";
        boolean actual = solution.exist(board, word);
        Assertions.assertThat(actual).isTrue();
    }

    @Test
    void existTest5() {
        char[][] board = new char[][]{{'X', 'Q', 'C', 'E'}, {'S', 'B', 'X', 'S'}, {'Q', 'W', 'E', 'R'}};
        String word = "B";
        boolean actual = solution.exist(board, word);
        Assertions.assertThat(actual).isTrue();
    }

    @Test
    void existTest6() {
        char[][] board = new char[][]{{'X', 'Q', 'C', 'E'}, {'S', 'B', 'X', 'S'}, {'Q', 'W', 'E', 'R'}};
        String word = "H";
        boolean actual = solution.exist(board, word);
        Assertions.assertThat(actual).isFalse();
    }

    @Test
    void existTest7() {
        char[][] board = new char[][]{{'a', 'b'}, {'c', 'd'}};
        String word = "abcd";
        boolean actual = solution.exist(board, word);
        Assertions.assertThat(actual).isFalse();
    }

    @Test
    void existTest8() {
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCESEEEFS";
        boolean actual = solution.exist(board, word);
        Assertions.assertThat(actual).isTrue();
    }

    @Test
    void existTest9() {
        char[][] board = new char[][]{{'A', 'A', 'A', 'A', 'A', 'A'}, {'A', 'A', 'A', 'A', 'A', 'A'}, {'A', 'A', 'A', 'A', 'A', 'A'}, {'A', 'A', 'A', 'A', 'A', 'A'}, {'A', 'A', 'A', 'A', 'A', 'B'}, {'A', 'A', 'A', 'A', 'B', 'A'}};
        String word = "AAAAAAAAAAAAABB";
        boolean actual = solution.exist(board, word);
        Assertions.assertThat(actual).isFalse();
    }

    @Test
    void existTest10() {
        char[][] board = new char[][]{{'C', 'A', 'A'}, {'A', 'A', 'A'}, {'B', 'C', 'D'}};
        String word = "AAB";
        boolean actual = solution.exist(board, word);
        Assertions.assertThat(actual).isTrue();
    }

    @Test
    void existTest11() {
        char[][] board = new char[][]{{'A', 'A', 'A', 'A', 'A', 'A'}, {'A', 'A', 'A', 'A', 'A', 'A'}, {'A', 'A', 'A', 'A', 'A', 'A'}, {'A', 'A', 'A', 'A', 'A', 'A'}, {'A', 'A', 'A', 'A', 'A', 'A'}, {'A', 'A', 'A', 'A', 'A', 'A'}};
        String word = "AAAAAAAAAAAAABB";
        boolean actual = solution.exist(board, word);
        Assertions.assertThat(actual).isFalse();
    }
}