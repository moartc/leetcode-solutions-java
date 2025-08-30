package solutions.algorithms._0_999._56_Merge_Intervals;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void mergeTest1() {

        int[][] input = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        int[][] actual = solution.merge(input);
        Assertions.assertThat(Arrays.stream(actual).toList()).hasSameElementsAs(Arrays.stream(expected).toList());
    }

    @Test
    void mergeTest2() {

        int[][] input = new int[][]{{1, 4}, {4, 5}};
        int[][] expected = {{1, 5}};
        int[][] actual = solution.merge(input);
        Assertions.assertThat(Arrays.stream(actual).toList()).hasSameElementsAs(Arrays.stream(expected).toList());
    }

    @Test
    void mergeTest3() {

        int[][] input = new int[][]{{15, 18}, {2, 6}, {8, 10}, {1, 3}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        int[][] actual = solution.merge(input);
        Assertions.assertThat(Arrays.stream(actual).toList()).hasSameElementsAs(Arrays.stream(expected).toList());
    }

    @Test
    void mergeTest4() {

        int[][] input = new int[][]{{2, 3}, {5, 6}, {1, 2}, {7, 8}, {3, 4}};
        int[][] expected = {{1, 4}, {5, 6}, {7, 8}};
        int[][] actual = solution.merge(input);
        Assertions.assertThat(Arrays.stream(actual).toList()).hasSameElementsAs(Arrays.stream(expected).toList());
    }

    @Test
    void mergeTest5() {

        int[][] input = new int[][]{{1, 2}, {3, 4}, {6, 7}, {2, 3}};
        int[][] expected = {{1, 4}, {6, 7}};
        int[][] actual = solution.merge(input);
        Assertions.assertThat(Arrays.stream(actual).toList()).hasSameElementsAs(Arrays.stream(expected).toList());
    }

    @Test
    void mergeTest6() {

        int[][] input = new int[][]{{1, 4}, {2, 3}};
        int[][] expected = {{1, 4}};
        int[][] actual = solution.merge(input);
        Assertions.assertThat(Arrays.stream(actual).toList()).hasSameElementsAs(Arrays.stream(expected).toList());
    }
}