package solutions.algorithms._0_999._868_Binary_Gap;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void binaryGap1() {
        int n = 22;
        int answer = solution.binaryGap(n);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void binaryGap2() {
        int n = 8;
        int answer = solution.binaryGap(n);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void binaryGap3() {
        int n = 5;
        int answer = solution.binaryGap(n);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}