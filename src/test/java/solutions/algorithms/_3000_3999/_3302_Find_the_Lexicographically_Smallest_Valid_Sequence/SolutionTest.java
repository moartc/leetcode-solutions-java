package solutions.algorithms._3000_3999._3302_Find_the_Lexicographically_Smallest_Valid_Sequence;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void validSequence1() {
        String word1 = "vbcca";
        String word2 = "abc";
        int[] answer = solution.validSequence(word1, word2);
        Assertions.assertThat(answer).containsExactly(0, 1, 2);
    }

    @Test
    void validSequence2() {
        String word1 = "bacdc";
        String word2 = "abc";
        int[] answer = solution.validSequence(word1, word2);
        Assertions.assertThat(answer).containsExactly(1, 2, 4);
    }

    @Test
    void validSequence3() {
        String word1 = "aaaaaa";
        String word2 = "aaabc";
        int[] answer = solution.validSequence(word1, word2);
        Assertions.assertThat(answer).isEmpty();
    }

    @Test
    void validSequence4() {
        String word1 = "abc";
        String word2 = "ab";
        int[] answer = solution.validSequence(word1, word2);
        Assertions.assertThat(answer).containsExactly(0, 1);
    }

    @Test
    void validSequence5() {
        String word1 = "ccbccccbcc";
        String word2 = "b";
        int[] answer = solution.validSequence(word1, word2);
        Assertions.assertThat(answer).containsExactly(0);
    }

}