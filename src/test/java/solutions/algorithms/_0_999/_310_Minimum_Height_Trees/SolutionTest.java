package solutions.algorithms._0_999._310_Minimum_Height_Trees;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findMinHeightTrees1() {
        int n = 4;
        int[][] edges = new int[][]{{1, 0}, {1, 2}, {1, 3}};

        List<Integer> answer = solution.findMinHeightTrees(n, edges);

        Assertions.assertThat(answer).containsExactly(1);
    }

    @Test
    void findMinHeightTrees2() {
        int n = 6;
        int[][] edges = new int[][]{{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}};

        List<Integer> answer = solution.findMinHeightTrees(n, edges);

        Assertions.assertThat(answer).containsExactly(3, 4);
    }
}