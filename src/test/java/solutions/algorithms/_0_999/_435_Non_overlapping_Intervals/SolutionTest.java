package solutions.algorithms._0_999._435_Non_overlapping_Intervals;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void eraseOverlapIntervalsTest1() {
        int[][] intervals = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int result = solution.eraseOverlapIntervals(intervals);
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    void eraseOverlapIntervalsTest2() {
        int[][] intervals = new int[][]{{1, 2}, {1, 2}, {1, 2}};
        int result = solution.eraseOverlapIntervals(intervals);
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    void eraseOverlapIntervalsTest3() {
        int[][] intervals = new int[][]{{1, 2}, {2, 3}};
        int result = solution.eraseOverlapIntervals(intervals);
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    void eraseOverlapIntervalsTest4() {
        int[][] intervals = new int[][]{{0, 2}, {1, 3}, {2, 4}, {3, 5}, {4, 6}};
        int result = solution.eraseOverlapIntervals(intervals);
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    void eraseOverlapIntervalsTest5() {
        int[][] intervals = new int[][]{{0, 16}, {1, 3}, {3, 5}, {5, 6}};
        int result = solution.eraseOverlapIntervals(intervals);
        Assertions.assertThat(result).isEqualTo(1);
    }
}