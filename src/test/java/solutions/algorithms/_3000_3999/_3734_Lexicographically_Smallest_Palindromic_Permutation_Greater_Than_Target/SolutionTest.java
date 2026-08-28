package solutions.algorithms._3000_3999._3734_Lexicographically_Smallest_Palindromic_Permutation_Greater_Than_Target;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void lexPalindromicPermutation1() {
        String s = "baba";
        String target = "abba";
        String answer = solution.lexPalindromicPermutation(s, target);
        Assertions.assertThat(answer).isEqualTo("baab");
    }

    @Test
    void lexPalindromicPermutation2() {
        String s = "baba";
        String target = "bbaa";
        String answer = solution.lexPalindromicPermutation(s, target);
        Assertions.assertThat(answer).isEqualTo("");
    }

    @Test
    void lexPalindromicPermutation3() {
        String s = "abc";
        String target = "abb";
        String answer = solution.lexPalindromicPermutation(s, target);
        Assertions.assertThat(answer).isEqualTo("");
    }

    @Test
    void lexPalindromicPermutation4() {
        String s = "aac";
        String target = "aab";
        String answer = solution.lexPalindromicPermutation(s, target);
        Assertions.assertThat(answer).isEqualTo("aca");
    }

    @Test
    void lexPalindromicPermutation5() {
        String s = "z";
        String target = "a";
        String answer = solution.lexPalindromicPermutation(s, target);
        Assertions.assertThat(answer).isEqualTo("z");
    }

    @Test
    void lexPalindromicPermutation6() {
        String s = "bb";
        String target = "ba";
        String answer = solution.lexPalindromicPermutation(s, target);
        Assertions.assertThat(answer).isEqualTo("bb");
    }

    @Test
    void lexPalindromicPermutation7() {
        String s = "aabb";
        String target = "abab";
        String answer = solution.lexPalindromicPermutation(s, target);
        Assertions.assertThat(answer).isEqualTo("abba");
    }

    @Test
    void lexPalindromicPermutation8() {
        String s = "aabb";
        String target = "baba";
        String answer = solution.lexPalindromicPermutation(s, target);
        Assertions.assertThat(answer).isEqualTo("");
    }
}