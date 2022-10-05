package solutions.algorithms._1143_Longest_Common_Subsequence;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestCommonSubsequenceTest1() {
        String text1 = "abcde", text2 = "ace";
        int actual = solution.longestCommonSubsequence(text1, text2);
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    void longestCommonSubsequenceTest2() {
        String text1 = "abc", text2 = "abc";
        int actual = solution.longestCommonSubsequence(text1, text2);
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    void longestCommonSubsequenceTest3() {
        String text1 = "abc", text2 = "def";
        int actual = solution.longestCommonSubsequence(text1, text2);
        Assertions.assertThat(actual).isEqualTo(0);
    }

    @Test
    void longestCommonSubsequenceTest4() {
        String text1 = "gab", text2 = "abg";
        int actual = solution.longestCommonSubsequence(text1, text2);
        Assertions.assertThat(actual).isEqualTo(2);
    }

    @Test
    void longestCommonSubsequenceTest5() {
        String text1 = "abcde", text2 = "abacde";
        int actual = solution.longestCommonSubsequence(text1, text2);
        Assertions.assertThat(actual).isEqualTo(5);
    }

    @Test
    void longestCommonSubsequenceTest6() {
        String text1 = "axb", text2 = "ayb";
        int actual = solution.longestCommonSubsequence(text1, text2);
        Assertions.assertThat(actual).isEqualTo(2);
    }

    @Test
    void longestCommonSubsequenceTest7() {
        String text1 = "abc", text2 = "xyz";
        int actual = solution.longestCommonSubsequence(text1, text2);
        Assertions.assertThat(actual).isEqualTo(0);
    }

    @Test
    void longestCommonSubsequenceTest8() {
        String text1 = "a", text2 = "a";
        int actual = solution.longestCommonSubsequence(text1, text2);
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    void longestCommonSubsequenceTest9() {
        String text1 = "a", text2 = "x";
        int actual = solution.longestCommonSubsequence(text1, text2);
        Assertions.assertThat(actual).isEqualTo(0);
    }

    @Test
    void longestCommonSubsequenceTest10() {
        // mhziwb
        String text1 = "mhzqrkzsnidwbun", text2 = "szulspmhwpazoxijwbq";
        int actual = solution.longestCommonSubsequence(text1, text2);
        Assertions.assertThat(actual).isEqualTo(6);
    }

    @Test
    void longestCommonSubsequenceTest11() {
        String text1 = "azbc", text2 = "abcz";
        int actual = solution.longestCommonSubsequence(text1, text2);
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    void longestCommonSubsequenceTest12() {
        String text1 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String text2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int actual = solution.longestCommonSubsequence(text1, text2);
        Assertions.assertThat(actual).isEqualTo(210);
    }

    @Test
    void longestCommonSubsequenceTest13() {
        String text1 = "papmretkborsrurgtina";
        String text2 = "nsnupotstmnkfcfavaxgl";
        int actual = solution.longestCommonSubsequence(text1, text2);
        Assertions.assertThat(actual).isEqualTo(6);
    }

    @Test
    void longestCommonSubsequenceTest14() {
        // mhziwb
        String text1 ="szulspmhwpazoxijwbq",  text2 = "mhzqrkzsnidwbun";
        int actual = solution.longestCommonSubsequence(text1, text2);
        Assertions.assertThat(actual).isEqualTo(6);
    }
}