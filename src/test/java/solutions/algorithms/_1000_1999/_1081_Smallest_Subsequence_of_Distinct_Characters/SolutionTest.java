package solutions.algorithms._1000_1999._1081_Smallest_Subsequence_of_Distinct_Characters;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void smallestSubsequence1() {
        String s = "bcabc";
        String answer = solution.smallestSubsequence(s);
        Assertions.assertThat(answer).isEqualTo("abc");
    }

    @Test
    void smallestSubsequence2() {
        String s = "cbacdcbc";
        String answer = solution.smallestSubsequence(s);
        Assertions.assertThat(answer).isEqualTo("acdb");
    }

    @Test
    void smallestSubsequence3() {
        String s = "mqnwenamqweutiqw";
        String answer = solution.smallestSubsequence(s);
        Assertions.assertThat(answer).isEqualTo("enamqutiw");
    }
}