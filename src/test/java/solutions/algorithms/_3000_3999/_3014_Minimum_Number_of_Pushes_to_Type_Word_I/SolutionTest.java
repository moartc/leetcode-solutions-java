package solutions.algorithms._3000_3999._3014_Minimum_Number_of_Pushes_to_Type_Word_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumPushes1() {
        String word = "abcde";
        int answer = solution.minimumPushes(word);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void minimumPushes2() {
        String word = "xycdefghij";
        int answer = solution.minimumPushes(word);
        Assertions.assertThat(answer).isEqualTo(12);
    }
}