package solutions.algorithms._3000_3999._3310_Remove_Methods_From_Project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void remainingMethods1() {
        int n = 4;
        int k = 1;
        int[][] invocations = new int[][]{{1, 2}, {0, 1}, {3, 2}};
        List<Integer> answer = solution.remainingMethods(n, k, invocations);
        Assertions.assertThat(answer).containsExactly(0, 1, 2, 3);
    }

    @Test
    void remainingMethods2() {
        int n = 5;
        int k = 0;
        int[][] invocations = new int[][]{{1, 2}, {0, 2}, {0, 1}, {3, 4}};
        List<Integer> answer = solution.remainingMethods(n, k, invocations);
        Assertions.assertThat(answer).containsExactly(3, 4);
    }

    @Test
    void remainingMethods3() {
        int n = 3;
        int k = 2;
        int[][] invocations = new int[][]{{1, 2}, {0, 1}, {2, 0}};
        List<Integer> answer = solution.remainingMethods(n, k, invocations);
        Assertions.assertThat(answer).isEmpty();
    }
}