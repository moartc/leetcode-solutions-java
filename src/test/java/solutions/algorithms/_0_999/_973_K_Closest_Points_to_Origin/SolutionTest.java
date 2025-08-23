package solutions.algorithms._0_999._973_K_Closest_Points_to_Origin;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[][] points = new int[][]{{1, 3}, {-2, 2}};
        int k = 1;

        int[][] answer = solution.kClosest(points, k);

        int[][] expected = new int[][]{{-2, 2}};
        Assertions.assertThat(answer).isEqualTo(expected);
    }

    @Test
    void test2() {
        int[][] points = new int[][]{{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        int[][] answer = solution.kClosest(points, k);

        List<int[]> answerAsList = Arrays.asList(answer);
        Assertions.assertThat(answerAsList).containsExactlyInAnyOrder(new int[]{-2, 4}, new int[]{3, 3});
    }

    @Test
    void test3() {
        int[][] points = new int[][]{{0, 1}, {1, 0}};
        int k = 2;

        int[][] answer = solution.kClosest(points, k);
        List<int[]> answerAsList = Arrays.asList(answer);
        Assertions.assertThat(answerAsList).containsExactlyInAnyOrder(new int[]{0, 1}, new int[]{1, 0});
    }
}