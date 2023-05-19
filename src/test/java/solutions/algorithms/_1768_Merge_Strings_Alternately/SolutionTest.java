package solutions.algorithms._1768_Merge_Strings_Alternately;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void mergeAlternatelyTest1() {
        String word1 = "abc";
        String word2 = "pqr";
        String expected = "apbqcr";
        String actual = solution.mergeAlternately(word1, word2);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void mergeAlternatelyTest2() {
        String word1 = "ab";
        String word2 = "pqrs";
        String expected = "apbqrs";
        String actual = solution.mergeAlternately(word1, word2);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void mergeAlternatelyTest3() {
        String word1 = "abcd";
        String word2 = "pq";
        String expected = "apbqcd";
        String actual = solution.mergeAlternately(word1, word2);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}