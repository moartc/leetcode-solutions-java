package solutions.algorithms._0_999._38_Count_and_Say;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countAndSay1() {
        int n = 4;
        String answer = solution.countAndSay(n);
        Assertions.assertThat(answer).isEqualTo("1211");
    }

    @Test
    void countAndSay2() {
        int n = 1;
        String answer = solution.countAndSay(n);
        Assertions.assertThat(answer).isEqualTo("1");
    }
}