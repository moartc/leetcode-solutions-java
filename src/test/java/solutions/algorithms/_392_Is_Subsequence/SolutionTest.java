package solutions.algorithms._392_Is_Subsequence;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isSubsequenceTest1() {
        boolean answer = solution.isSubsequence("abc", "ahbgdc");
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isSubsequenceTest2() {
        boolean answer = solution.isSubsequence("axc", "ahbgdc");
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void isSubsequenceTest3() {
        boolean answer = solution.isSubsequence("axcqwertyu", "ahbgdc");
        Assertions.assertThat(answer).isFalse();
    }
}