package solutions.algorithms._0_999._149_Max_Points_on_a_Line;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._149_Max_Points_on_a_Line.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxPointsTest1() {
        int[][] points = new int[][]{{1, 1}, {2, 2}, {3, 3}};
        int expected = 3;
        int actual = solution.maxPoints(points);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void maxPointsTest2() {
        int[][] points = new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};
        int expected = 4;
        int actual = solution.maxPoints(points);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void maxPointsTest3() {
        int[][] points = new int[][]{{9, -25}, {-4, 1}, {-1, 5}, {-7, 7}};
        int expected = 3;
        int actual = solution.maxPoints(points);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void maxPointsTest4() {
        int[][] points = new int[][]{{3, 2}, {4, 1}, {2, 3}, {1, 4}};
        int expected = 4;
        int actual = solution.maxPoints(points);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void maxPointsTest5() {
        int[][] points = new int[][]{{0, 1}, {0, 0}, {0, 4}, {0, -2}, {0, -1}, {0, 3}, {0, -4}};
        int expected = 7;
        int actual = solution.maxPoints(points);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void maxPointsTest6() {
        int[][] points = new int[][]{{0, 0}};
        int expected = 1;
        int actual = solution.maxPoints(points);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void maxPointsTest7() {
        int[][] points = new int[][]{{2, 3}, {3, 3}, {-5, 3}};
        int expected = 3;
        int actual = solution.maxPoints(points);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}



