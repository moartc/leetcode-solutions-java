package solutions.algorithms._3000_3999._3121_Count_the_Number_of_Special_Characters_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numberOfSpecialChars1() {
        String word = "aaAbcBC";
        int answer = solution.numberOfSpecialChars(word);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void numberOfSpecialChars2() {
        String word = "abc";
        int answer = solution.numberOfSpecialChars(word);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void numberOfSpecialChars3() {
        String word = "AbBCab";
        int answer = solution.numberOfSpecialChars(word);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}