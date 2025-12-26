package solutions.algorithms._0_999._953_Verifying_an_Alien_Dictionary;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isAlienSorted1() {
        String[] words = new String[]{"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        boolean answer = solution.isAlienSorted(words, order);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isAlienSorted2() {
        String[] words = new String[]{"word", "world", "row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        boolean answer = solution.isAlienSorted(words, order);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void isAlienSorted3() {
        String[] words = new String[]{"apple", "app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        boolean answer = solution.isAlienSorted(words, order);
        Assertions.assertThat(answer).isFalse();
    }
}