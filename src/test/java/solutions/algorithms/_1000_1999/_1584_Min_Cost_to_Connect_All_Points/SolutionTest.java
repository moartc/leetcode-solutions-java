package solutions.algorithms._1000_1999._1584_Min_Cost_to_Connect_All_Points;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minCostConnectPoints1() {
        int[][] points = new int[][]{{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};
        int answer = solution.minCostConnectPoints(points);
        Assertions.assertThat(answer).isEqualTo(20);
    }

    @Test
    void minCostConnectPoints2() {
        int[][] points = new int[][]{{3, 12}, {-2, 5}, {-4, 1}};
        int answer = solution.minCostConnectPoints(points);
        Assertions.assertThat(answer).isEqualTo(18);
    }

    @Test
    void minCostConnectPoints3() {
        int[][] points = new int[][]{{0, 0}, {1, 1}, {1, 0}, {-1, 1}};
        int answer = solution.minCostConnectPoints(points);
        Assertions.assertThat(answer).isEqualTo(4);
    }
}