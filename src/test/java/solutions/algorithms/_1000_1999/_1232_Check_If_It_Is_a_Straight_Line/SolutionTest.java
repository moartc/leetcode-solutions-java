package solutions.algorithms._1000_1999._1232_Check_If_It_Is_a_Straight_Line;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void checkStraightLineTest1() {
        int[][] coordinates = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        boolean answer = solution.checkStraightLine(coordinates);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void checkStraightLineTest2() {
        int[][] coordinates = new int[][]{{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        boolean answer = solution.checkStraightLine(coordinates);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void checkStraightLineTest3() {
        int[][] coordinates = new int[][]{{6, 7}, {2, 3}, {1, 2}, {4, 5}, {5, 6}, {3, 4}};
        boolean answer = solution.checkStraightLine(coordinates);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void checkStraightLineTest4() {
        int[][] coordinates = new int[][]{{1, 1}, {7, 7}, {3, 4}, {4, 5}, {5, 6}, {2, 2}};
        boolean answer = solution.checkStraightLine(coordinates);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void checkStraightLineTest5() {
        int[][] coordinates = new int[][]{{2, -2}, {0, 0}, {-2, 2}};
        boolean answer = solution.checkStraightLine(coordinates);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void checkStraightLineTest6() {
        int[][] coordinates = new int[][]{{2, -2}, {0, 0}, {2, 2}};
        boolean answer = solution.checkStraightLine(coordinates);
        Assertions.assertThat(answer).isFalse();
    }
}