package solutions.algorithms._1779_Find_Nearest_Point_That_Has_the_Same_X_or_Y_Cordinate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void nearestValidPointTest1() {
        int x = 3;
        int y = 4;
        int[][] points = new int[][]{{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}};
        int actual = solution.nearestValidPoint(x, y, points);
        Assertions.assertThat(actual).isEqualTo(2);
    }

    @Test
    void nearestValidPointTest2() {
        int x = 3;
        int y = 4;
        int[][] points = new int[][]{{3, 4}};
        int actual = solution.nearestValidPoint(x, y, points);
        Assertions.assertThat(actual).isEqualTo(0);
    }

    @Test
    void nearestValidPointTest3() {
        int x = 3;
        int y = 4;
        int[][] points = new int[][]{{2, 3}};
        int actual = solution.nearestValidPoint(x, y, points);
        Assertions.assertThat(actual).isEqualTo(-1);
    }
}