package solutions.algorithms._0_999._647_Palindromic_Substrings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countSubstrings1() {
        String s = "abc";
        int answer = solution.countSubstrings(s);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void countSubstrings2() {
        String s = "aaa";
        int answer = solution.countSubstrings(s);
        Assertions.assertThat(answer).isEqualTo(6);
    }
}