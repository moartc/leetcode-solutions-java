package solutions.algorithms._3000_3999._3870_Count_Commas_in_Range;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countCommas1() {
        int n = 1002;
        int answer = solution.countCommas(n);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void countCommas2() {
        int n = 998;
        int answer = solution.countCommas(n);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void countCommas3() {
        int n = 100000;
        int answer = solution.countCommas(n);
        Assertions.assertThat(answer).isEqualTo(99001);
    }

    @Test
    void countCommas4() {
        int n = 92000;
        int answer = solution.countCommas(n);
        Assertions.assertThat(answer).isEqualTo(91001);
    }
}