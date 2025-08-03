package solutions.algorithms._0_999._424_Longest_Repeating_Character_Replacement;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void characterReplacementTest1() {
        String s = "ABAB";
        int k = 2;
        int answer = solution.characterReplacement(s, k);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void characterReplacementTest2() {
        String s = "AABABBA";
        int k = 1;
        int answer = solution.characterReplacement(s, k);
        Assertions.assertThat(answer).isEqualTo(4);
    }
}