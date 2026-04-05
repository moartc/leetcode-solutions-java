package solutions.algorithms._0_999._815_Bus_Routes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numBusesToDestination1() {
        int[][] routes = new int[][]{{1, 2, 7}, {3, 6, 7}};
        int source = 1;
        int target = 6;
        int answer = solution.numBusesToDestination(routes, source, target);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void numBusesToDestination2() {
        int[][] routes = new int[][]{{7, 12}, {4, 5, 15}, {6}, {15, 19}, {9, 12, 13}};
        int source = 15;
        int target = 12;
        int answer = solution.numBusesToDestination(routes, source, target);
        Assertions.assertThat(answer).isEqualTo(-1);
    }

    @Test
    void numBusesToDestination3() {
        int[][] routes = new int[][]{{1, 9, 12, 20, 23, 24, 35, 38}, {10, 21, 24, 31, 32, 34, 37, 38, 43}, {10, 19, 28, 37}, {8}, {14, 19}, {11, 17, 23, 31, 41, 43, 44}, {21, 26, 29, 33}, {5, 11, 33, 41}, {4, 5, 8, 9, 24, 44}};
        int source = 37;
        int target = 28;
        int answer = solution.numBusesToDestination(routes, source, target);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}