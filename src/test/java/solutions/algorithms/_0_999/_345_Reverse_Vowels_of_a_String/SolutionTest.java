package solutions.algorithms._0_999._345_Reverse_Vowels_of_a_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reverseVowels1() {
        String s = "IceCreAm";
        String answer = solution.reverseVowels(s);
        Assertions.assertThat(answer).isEqualTo("AceCreIm");
    }

    @Test
    void reverseVowels2() {
        String s = "leetcode";
        String answer = solution.reverseVowels(s);
        Assertions.assertThat(answer).isEqualTo("leotcede");
    }

    @Test
    void reverseVowels3() {
        String s = "a.b,.";
        String answer = solution.reverseVowels(s);
        Assertions.assertThat(answer).isEqualTo("a.b,.");
    }

    @Test
    void reverseVowels4() {
        String s = ".,";
        String answer = solution.reverseVowels(s);
        Assertions.assertThat(answer).isEqualTo(".,");
    }
}