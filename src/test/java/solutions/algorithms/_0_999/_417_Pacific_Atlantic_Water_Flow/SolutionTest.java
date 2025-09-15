package solutions.algorithms._0_999._417_Pacific_Atlantic_Water_Flow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void pacificAtlantic1() {

        int[][] heights = new int[][]{{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};
        List<List<Integer>> answer = solution.pacificAtlantic(heights);
        Assertions.assertThat(answer).containsExactly(List.of(0, 4),
                List.of(1, 3),
                List.of(1, 4),
                List.of(2, 2),
                List.of(3, 0),
                List.of(3, 1),
                List.of(4, 0)
        );
    }

    @Test
    void pacificAtlantic2() {

        int[][] heights = new int[][]{{1}};
        List<List<Integer>> answer = solution.pacificAtlantic(heights);
        Assertions.assertThat(answer).containsExactly(List.of(0, 0));
    }


    @Test
    void pacificAtlantic3() {

        int[][] heights = new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        List<List<Integer>> answer = solution.pacificAtlantic(heights);
        Assertions.assertThat(answer).containsExactly(
                List.of(0, 2),
                List.of(1, 0),
                List.of(1, 1),
                List.of(1, 2),
                List.of(2, 0),
                List.of(2, 1),
                List.of(2, 2)
        );
    }
}