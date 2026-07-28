package solutions.algorithms._3000_3999._3517_Smallest_Palindromic_Rearrangement_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void smallestPalindrome1() {
        String s = "z";
        String answer = solution.smallestPalindrome(s);
        Assertions.assertThat(answer).isEqualTo("z");
    }

    @Test
    void smallestPalindrome2() {
        String s = "babab";
        String answer = solution.smallestPalindrome(s);
        Assertions.assertThat(answer).isEqualTo("abbba");
    }

    @Test
    void smallestPalindrome3() {
        String s = "daccad";
        String answer = solution.smallestPalindrome(s);
        Assertions.assertThat(answer).isEqualTo("acddca");
    }

    @Test
    void smallestPalindrome4() {
        String s = "yey";
        String answer = solution.smallestPalindrome(s);
        Assertions.assertThat(answer).isEqualTo("yey");
    }

    @Test
    void smallestPalindrome5() {
        String s = "inini";
        String answer = solution.smallestPalindrome(s);
        Assertions.assertThat(answer).isEqualTo("inini");
    }
}