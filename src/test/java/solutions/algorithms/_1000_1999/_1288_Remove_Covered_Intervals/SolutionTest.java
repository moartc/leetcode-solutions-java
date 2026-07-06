package solutions.algorithms._1000_1999._1288_Remove_Covered_Intervals;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void removeCoveredIntervals1() {
        int[][] intervals = new int[][]{{1, 4}, {3, 6}, {2, 8}};
        int answer = solution.removeCoveredIntervals(intervals);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void removeCoveredIntervals2() {
        int[][] intervals = new int[][]{{1, 4}, {2, 3}};
        int answer = solution.removeCoveredIntervals(intervals);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void removeCoveredIntervals3() {
        int[][] intervals = new int[][]{{1, 2}, {1, 4}, {3, 4}};
        int answer = solution.removeCoveredIntervals(intervals);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}