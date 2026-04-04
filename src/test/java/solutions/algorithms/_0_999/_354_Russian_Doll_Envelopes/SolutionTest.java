package solutions.algorithms._0_999._354_Russian_Doll_Envelopes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxEnvelopes1() {

        int[][] envelopes = new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        int answer = solution.maxEnvelopes(envelopes);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void maxEnvelopes2() {

        int[][] envelopes = new int[][]{{1, 1}, {1, 1}, {1, 1}};
        int answer = solution.maxEnvelopes(envelopes);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}