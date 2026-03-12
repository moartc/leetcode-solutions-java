package solutions.algorithms._1000_1999._1937_Maximum_Number_of_Points_with_Cost;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxPoints1() {
        int[][] points = new int[][]{{1, 2, 3}, {1, 5, 1}, {3, 1, 1}};
        long answer = solution.maxPoints(points);
        Assertions.assertThat(answer).isEqualTo(9);
    }

    @Test
    void maxPoints2() {
        int[][] points = new int[][]{{1, 5}, {2, 3}, {4, 2}};
        long answer = solution.maxPoints(points);
        Assertions.assertThat(answer).isEqualTo(11);
    }
}