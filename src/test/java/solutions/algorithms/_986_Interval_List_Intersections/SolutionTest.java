package solutions.algorithms._986_Interval_List_Intersections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void intervalIntersectionTest1() {
        int[][] firstList = new int[][]{{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] secondList = new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        int[][] expected = new int[][]{{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}};
        int[][] actual = solution.intervalIntersection(firstList, secondList);
        Assertions.assertThat(actual).isDeepEqualTo(expected);
    }

    @Test
    void intervalIntersectionTest2() {
        int[][] firstList = new int[][]{{1, 3}, {5, 9}};
        int[][] secondList = new int[][]{};
        int[][] expected = new int[][]{};
        int[][] actual = solution.intervalIntersection(firstList, secondList);
        Assertions.assertThat(actual).isDeepEqualTo(expected);
    }
}