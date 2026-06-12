package solutions.algorithms._3000_3999._3559_Number_of_Ways_to_Assign_Edge_Weights_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void assignEdgeWeights1() {
        int[][] edges = new int[][]{{1, 2}};
        int[][] queries = new int[][]{{1, 1}, {1, 2}};
        int[] answer = solution.assignEdgeWeights(edges, queries);
        Assertions.assertThat(answer).containsExactly(0, 1);
    }

    @Test
    void assignEdgeWeights2() {
        int[][] edges = new int[][]{{1, 2}, {1, 3}, {3, 4}, {3, 5}};
        int[][] queries = new int[][]{{1, 4}, {3, 4}, {2, 5}};
        int[] answer = solution.assignEdgeWeights(edges, queries);
        Assertions.assertThat(answer).containsExactly(2, 1, 4);
    }

}