package solutions.algorithms._3000_3999._3720_Lexicographically_Smallest_Permutation_Greater_Than_Target;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void lexGreaterPermutation1() {
        String s = "abc";
        String target = "bba";
        String answer = solution.lexGreaterPermutation(s, target);
        Assertions.assertThat(answer).isEqualTo("bca");
    }

    @Test
    void lexGreaterPermutation2() {
        String s = "leet";
        String target = "code";
        String answer = solution.lexGreaterPermutation(s, target);
        Assertions.assertThat(answer).isEqualTo("eelt");
    }

    @Test
    void lexGreaterPermutation3() {
        String s = "baba";
        String target = "bbaa";
        String answer = solution.lexGreaterPermutation(s, target);
        Assertions.assertThat(answer).isEqualTo("");
    }

    @Test
    void lexGreaterPermutation4() {
        String s = "ab";
        String target = "ab";
        String answer = solution.lexGreaterPermutation(s, target);
        Assertions.assertThat(answer).isEqualTo("ba");
    }

    @Test
    void lexGreaterPermutation5() {
        String s = "ab";
        String target = "ba";
        String answer = solution.lexGreaterPermutation(s, target);
        Assertions.assertThat(answer).isEqualTo("");
    }
}