package solutions.algorithms._0_999._44_Wildcard_Matching;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isMatch1() {
        String s = "aa";
        String p = "a";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void isMatch2() {
        String s = "aa";
        String p = "*";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isMatch3() {
        String s = "cb";
        String p = "?a";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void isMatch4() {
        String s = "abcdef";
        String p = "*?";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isMatc5() {
        String s = "";
        String p = "?";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void isMatch6() {
        String s = "";
        String p = "*";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isMatch7() {
        String s = "";
        String p = "??";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void isMatch8() {
        String s = "abc";
        String p = "*c";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isMatch9() {
        String s = "abcdef";
        String p = "*c?";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void isMatch10() {
        String s = "adceb";
        String p = "*a*b";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isMatch11() {
        String s = "abcabczzzde";
        String p = "*abc???de*";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isTrue();
    }
}