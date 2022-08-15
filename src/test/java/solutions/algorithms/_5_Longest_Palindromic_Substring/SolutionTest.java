package solutions.algorithms._5_Longest_Palindromic_Substring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestPalindromeTest1() {
        String s = "babad";
        assertThat(solution.longestPalindrome(s)).isEqualTo("bab");
    }

    @Test
    void longestPalindromeTest2() {
        String s = "cbbd";
        assertThat(solution.longestPalindrome(s)).isEqualTo("bb");
    }

    @Test
    void longestPalindromeTest3() {
        String s = "abcdedcba";
        assertThat(solution.longestPalindrome(s)).isEqualTo("abcdedcba");
    }

    @Test
    void longestPalindromeTest4() {
        String s = "xabcddcba";
        assertThat(solution.longestPalindrome(s)).isEqualTo("abcddcba");
    }

    @Test
    void longestPalindromeTest5() {
        String s = "aacabdkacaa";
        assertThat(solution.longestPalindrome(s)).isEqualTo("aca");
    }

    @Test
    void longestPalindromeTest6() {
        String s = "a";
        assertThat(solution.longestPalindrome(s)).isEqualTo("a");
    }

    @Test
    void longestPalindromeTest7() {
        String s = "bb";
        assertThat(solution.longestPalindrome(s)).isEqualTo("bb");
    }

    @Test
    void longestPalindromeTest8() {
        String s = "ac";
        assertThat(solution.longestPalindrome(s)).isEqualTo("a");
    }

    @Test
    void longestPalindromeTest9() {
        String s = "abcdefghbbd";
        assertThat(solution.longestPalindrome(s)).isEqualTo("bb");
    }

    @Test
    void longestPalindromeTest10() {
        String s = "ccc";
        assertThat(solution.longestPalindrome(s)).isEqualTo("ccc");
    }
}