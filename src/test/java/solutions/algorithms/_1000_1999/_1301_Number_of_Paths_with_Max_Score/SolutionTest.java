package solutions.algorithms._1000_1999._1301_Number_of_Paths_with_Max_Score;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void pathsWithMaxScore1() {
        List<String> board = List.of("E23", "2X2", "12S");
        int[] answer = solution.pathsWithMaxScore(board);
        Assertions.assertThat(answer).containsExactly(7, 1);
    }

    @Test
    void pathsWithMaxScore2() {
        List<String> board = List.of("E12", "1X1", "21S");
        int[] answer = solution.pathsWithMaxScore(board);
        Assertions.assertThat(answer).containsExactly(4, 2);
    }

    @Test
    void pathsWithMaxScore3() {
        List<String> board = List.of("E11", "XXX", "11S");
        int[] answer = solution.pathsWithMaxScore(board);
        Assertions.assertThat(answer).containsExactly(0, 0);
    }

    @Test
    void pathsWithMaxScore4() {
        List<String> board = List.of("E11345", "X452XX", "3X43X4", "44X312", "23452X", "1342XS");
        int[] answer = solution.pathsWithMaxScore(board);
        Assertions.assertThat(answer).containsExactly(27, 1);
    }
}