package solutions.algorithms._3000_3999._3558_Number_of_Ways_to_Assign_Edge_WeightsI;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void assignEdgeWeights1() {
        int[][] edges = new int[][]{{1, 2}};
        int answer = solution.assignEdgeWeights(edges);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void assignEdgeWeights2() {
        int[][] edges = new int[][]{{1, 2}, {1, 3}, {3, 4}, {3, 5}};
        int answer = solution.assignEdgeWeights(edges);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void assignEdgeWeights3() {
        int[][] edges = new int[][]{{3, 2}, {2, 1}};
        int answer = solution.assignEdgeWeights(edges);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}