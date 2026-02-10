package solutions.algorithms._0_999._57_Insert_Interval;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void insert1() {
        int[][] intervals = new int[][]{{1, 3}, {6, 9}};
        int[] newInterval = new int[]{2, 5};
        int[][] answer = solution.insert(intervals, newInterval);
        Assertions.assertThat(answer[0]).containsExactly(1, 5);
        Assertions.assertThat(answer[1]).containsExactly(6, 9);
    }

    @Test
    void insert2() {
        int[][] intervals = new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = new int[]{4, 8};
        int[][] answer = solution.insert(intervals, newInterval);
        Assertions.assertThat(answer[0]).containsExactly(1, 2);
        Assertions.assertThat(answer[1]).containsExactly(3, 10);
        Assertions.assertThat(answer[2]).containsExactly(12, 16);
    }

    @Test
    void insert3() {
        int[][] intervals = new int[][]{{1, 5}};
        int[] newInterval = new int[]{2, 3};
        int[][] answer = solution.insert(intervals, newInterval);
        Assertions.assertThat(answer[0]).containsExactly(1, 5);
    }

    @Test
    void insert4() {
        int[][] intervals = new int[][]{{2, 5}, {6, 7}, {8, 9}};
        int[] newInterval = new int[]{0, 1};
        int[][] answer = solution.insert(intervals, newInterval);
        Assertions.assertThat(answer[0]).containsExactly(0, 1);
    }
}