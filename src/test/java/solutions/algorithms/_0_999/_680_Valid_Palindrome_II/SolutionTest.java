package solutions.algorithms._0_999._680_Valid_Palindrome_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void validPalindrome1() {
        String s = "aba";
        boolean answer = solution.validPalindrome(s);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void validPalindrome2() {
        String s = "abca";
        boolean answer = solution.validPalindrome(s);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void validPalindrome3() {
        String s = "abc";
        boolean answer = solution.validPalindrome(s);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void validPalindrome4() {
        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        boolean answer = solution.validPalindrome(s);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void validPalindrome5() {
        String s = "eeccccbebaeeabebccceea";
        boolean answer = solution.validPalindrome(s);
        Assertions.assertThat(answer).isFalse();
    }
}