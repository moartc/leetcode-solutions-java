package solutions.algorithms._5_Longest_Palindromic_Substring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestPalindromeTest1() {
        String s = "babad";
        Assertions.assertThat(solution.longestPalindrome(s)).isEqualTo("bab");
    }

    @Test
    void longestPalindromeTest2() {
        String s = "cbbd";
        Assertions.assertThat(solution.longestPalindrome(s)).isEqualTo("bb");
    }

    @Test
    void longestPalindromeTest3() {
        String s = "abcdedcba";
        Assertions.assertThat(solution.longestPalindrome(s)).isEqualTo("abcdedcba");
    }

    @Test
    void longestPalindromeTest4() {
        String s = "xabcddcba";
        Assertions.assertThat(solution.longestPalindrome(s)).isEqualTo("abcddcba");
    }

    @Test
    void longestPalindromeTest5() {
        String s = "aacabdkacaa";
        Assertions.assertThat(solution.longestPalindrome(s)).isEqualTo("aca");
    }

    @Test
    void longestPalindromeTest6() {
        String s = "a";
        Assertions.assertThat(solution.longestPalindrome(s)).isEqualTo("a");
    }

    @Test
    void longestPalindromeTest7() {
        String s = "bb";
        Assertions.assertThat(solution.longestPalindrome(s)).isEqualTo("bb");
    }

    @Test
    void longestPalindromeTest8() {
        String s = "ac";
        Assertions.assertThat(solution.longestPalindrome(s)).isEqualTo("a");
    }
}