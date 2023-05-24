package solutions.algorithms._459_Repeated_Substring_Pattern;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void repeatedSubstringPatternTest1() {
        String s = "abab";
        boolean actual = solution.repeatedSubstringPattern(s);
        Assertions.assertThat(actual).isEqualTo(true);
    }

    @Test
    void repeatedSubstringPatternTest2() {
        String s = "aba";
        boolean actual = solution.repeatedSubstringPattern(s);
        Assertions.assertThat(actual).isEqualTo(false);
    }

    @Test
    void repeatedSubstringPatternTest3() {
        String s = "abcabcabcabc";
        boolean actual = solution.repeatedSubstringPattern(s);
        Assertions.assertThat(actual).isEqualTo(true);
    }

    @Test
    void repeatedSubstringPatternTest4() {
        String s = "a";
        boolean actual = solution.repeatedSubstringPattern(s);
        Assertions.assertThat(actual).isEqualTo(false);
    }

    @Test
    void repeatedSubstringPatternTest5() {
        String s = "aa";
        boolean actual = solution.repeatedSubstringPattern(s);
        Assertions.assertThat(actual).isEqualTo(true);
    }

    @Test
    void repeatedSubstringPatternTest6() {
        String s = "abac";
        boolean actual = solution.repeatedSubstringPattern(s);
        Assertions.assertThat(actual).isEqualTo(false);
    }
    @Test
    void repeatedSubstringPatternTest7() {
        String s = "aabaaba";
        boolean actual = solution.repeatedSubstringPattern(s);
        Assertions.assertThat(actual).isEqualTo(false);
    }

    @Test
    void repeatedSubstringPatternTest8() {
        String s = "abaababaab";
        boolean actual = solution.repeatedSubstringPattern(s);
        Assertions.assertThat(actual).isEqualTo(true);
    }
}