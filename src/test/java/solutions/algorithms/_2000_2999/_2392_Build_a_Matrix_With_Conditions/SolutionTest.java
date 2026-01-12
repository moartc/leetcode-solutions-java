package solutions.algorithms._2000_2999._2392_Build_a_Matrix_With_Conditions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void buildMatrix1() {
        int k = 3;
        int[][] rowConditions = new int[][]{{1, 2}, {3, 2}};
        int[][] colConditions = new int[][]{{2, 1}, {3, 2}};

        int[][] answer = solution.buildMatrix(k, rowConditions, colConditions);

        Assertions.assertThat(answer[0]).containsExactly(0, 0, 1);
        Assertions.assertThat(answer[1]).containsExactly(3, 0, 0);
        Assertions.assertThat(answer[2]).containsExactly(0, 2, 0);
    }

    @Test
    void buildMatrix2() {
        int k = 3;
        int[][] rowConditions = new int[][]{{1, 2}, {2, 3}, {3, 1}, {2, 3}};
        int[][] colConditions = new int[][]{{2, 1}};

        int[][] answer = solution.buildMatrix(k, rowConditions, colConditions);

        Assertions.assertThat(answer).isEmpty();
    }

}