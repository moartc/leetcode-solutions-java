package solutions.algorithms._0_999._502_IPO;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findMaximizedCapital1() {

        int k = 2;
        int w = 0;
        int[] profits = new int[]{1, 2, 3};
        int[] capital = new int[]{0, 1, 1};
        int answer = solution.findMaximizedCapital(k, w, profits, capital);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void findMaximizedCapital2() {

        int k = 3;
        int w = 0;
        int[] profits = new int[]{1, 2, 3};
        int[] capital = new int[]{0, 1, 2};
        int answer = solution.findMaximizedCapital(k, w, profits, capital);
        Assertions.assertThat(answer).isEqualTo(6);
    }
}