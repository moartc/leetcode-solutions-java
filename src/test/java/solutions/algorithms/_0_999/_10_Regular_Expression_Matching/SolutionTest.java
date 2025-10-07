package solutions.algorithms._0_999._10_Regular_Expression_Matching;

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
        String p = "a*";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isMatch3() {
        String s = "ab";
        String p = ".*";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isMatch4() {
        String s = "aab";
        String p = "c*a*b";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isMatch5() {
        String s = "abcdeeefg";
        String p = "ab.de*fg";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isMatch6() {
        String s = "abbbb";
        String p = "ab*b";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isMatch7() {
        String s = "a";
        String p = "ab*";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isMatch8() {
        String s = "ab";
        String p = ".*c";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void isMatch9() {
        String s = "bbbba";
        String p = ".*a*a";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isMatch10() {
        String s = "ab";
        String p = ".*..";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isTrue();
    }


    @Test
    void isMatch11() {
        String s = "abcaaaaaaabaabcabac";
        String p = ".*ab.a.*a*a*.*b*b*";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isMatch12() {
        String s = "mississippi";
        String p = "mis*is*p*.";
        boolean answer = solution.isMatch(s, p);
        Assertions.assertThat(answer).isFalse();
    }
}