package solutions.algorithms._0_999._218_The_Skyline_Problem;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getSkyline1() {
        int[][] buildings = new int[][]{{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};

        List<List<Integer>> answer = solution.getSkyline(buildings);

        Assertions.assertThat(answer.get(0)).containsExactly(2, 10);
        Assertions.assertThat(answer.get(1)).containsExactly(3, 15);
        Assertions.assertThat(answer.get(2)).containsExactly(7, 12);
        Assertions.assertThat(answer.get(3)).containsExactly(12, 0);
        Assertions.assertThat(answer.get(4)).containsExactly(15, 10);
        Assertions.assertThat(answer.get(5)).containsExactly(20, 8);
        Assertions.assertThat(answer.get(6)).containsExactly(24, 0);
    }

    @Test
    void getSkyline2() {
        int[][] buildings = new int[][]{{0, 2, 3}, {2, 5, 3}};

        List<List<Integer>> answer = solution.getSkyline(buildings);

        Assertions.assertThat(answer.get(0)).containsExactly(0, 3);
        Assertions.assertThat(answer.get(1)).containsExactly(5, 0);
    }

    @Test
    void getSkyline3() {
        int[][] buildings = new int[][]{{1, 2, 1}, {1, 2, 2}, {1, 2, 3}};

        List<List<Integer>> answer = solution.getSkyline(buildings);

        Assertions.assertThat(answer.get(0)).containsExactly(1, 3);
        Assertions.assertThat(answer.get(1)).containsExactly(2, 0);
    }
}