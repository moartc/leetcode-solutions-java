package solutions.algorithms._844_Backspace_String_Compare;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void backspaceCompareTest1() {
        String s = "ab#c", t = "ad#c";
        assertThat(solution.backspaceCompare(s, t)).isTrue();
    }

    @Test
    void backspaceCompareTest2() {
        String s = "ab##", t = "c#d#";
        assertThat(solution.backspaceCompare(s, t)).isTrue();
    }

    @Test
    void backspaceCompareTest3() {
        String s = "a#c", t = "b";
        assertThat(solution.backspaceCompare(s, t)).isFalse();
    }

    @Test
    void backspaceCompareTest4() {
        String s = "a", t = "b";
        assertThat(solution.backspaceCompare(s, t)).isFalse();
    }

    @Test
    void backspaceCompareTest5() {
        String s = "a", t = "a";
        assertThat(solution.backspaceCompare(s, t)).isTrue();
    }

    @Test
    void backspaceCompareTest6() {
        String s = "a", t = "a#";
        assertThat(solution.backspaceCompare(s, t)).isFalse();
    }

    @Test
    void backspaceCompareTest7() {
        String s = "a", t = "aa#";
        assertThat(solution.backspaceCompare(s, t)).isTrue();
    }

    @Test
    void backspaceCompareTest8() {
        String s = "a", t = "#";
        assertThat(solution.backspaceCompare(s, t)).isFalse();
    }

    @Test
    void backspaceCompareTest9() {
        String s = "mp", t =  "mu#p";
        assertThat(solution.backspaceCompare(s, t)).isTrue();
    }

    @Test
    void backspaceCompareTest10() {
        String s = "y#fo##f", t =  "y#fx#o##f";
        assertThat(solution.backspaceCompare(s, t)).isTrue();
    }

    @Test
    void backspaceCompareTest11() {
        String s = "nzp#o#g", t =  "b#nzp#o#g";
        assertThat(solution.backspaceCompare(s, t)).isTrue();
    }
}

