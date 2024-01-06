package solutions.algorithms._0_999._797_All_Paths_From_Source_to_Target;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._797_All_Paths_From_Source_to_Target.Solution;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void allPathsSourceTargetTest1() {

        int[][] graph = new int[][]{{1, 2}, {3}, {3}, {}};
        List<List<Integer>> expected = List.of(List.of(0, 1, 3), List.of(0, 2, 3));
        List<List<Integer>> actual = solution.allPathsSourceTarget(graph);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void allPathsSourceTargetTest2() {

        int[][] graph = new int[][]{{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}};
        List<List<Integer>> expected = List.of(List.of(0, 4), List.of(0, 3, 4), List.of(0, 1, 3, 4), List.of(0, 1, 2, 3, 4), List.of(0, 1, 4));
        List<List<Integer>> actual = solution.allPathsSourceTarget(graph);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void allPathsSourceTargetTest3() {

        int[][] graph = new int[][]{{4, 3, 1}, {3, 2, 4}, {}, {4}, {}};
        List<List<Integer>> expected = List.of(List.of(0, 4), List.of(0, 3, 4), List.of(0, 1, 3, 4), List.of(0, 1, 4));
        List<List<Integer>> actual = solution.allPathsSourceTarget(graph);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}