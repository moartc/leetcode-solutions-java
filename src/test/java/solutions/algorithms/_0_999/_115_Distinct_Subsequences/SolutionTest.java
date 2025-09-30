package solutions.algorithms._0_999._115_Distinct_Subsequences;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numDistinct1() {
        String s = "rabbbit";
        String t = "rabbit";
        int answer = solution.numDistinct(s, t);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void numDistinct2() {
        String s = "babgbag";
        String t = "bag";
        int answer = solution.numDistinct(s, t);
        Assertions.assertThat(answer).isEqualTo(5);
    }
}