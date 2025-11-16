package solutions.algorithms._0_999._374_Guess_Number_Higher_or_Lower;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void guessNumber1() {
        // no tests
        solution.setNumber(6);
        int i = solution.guessNumber(10);
        Assertions.assertThat(i).isEqualTo(6);
    }

    @Test
    void guessNumber2() {
        // no tests
        solution.setNumber(1);
        int i = solution.guessNumber(1);
        Assertions.assertThat(i).isEqualTo(1);
    }

    @Test
    void guessNumber3() {
        // no tests
        solution.setNumber(1);
        int i = solution.guessNumber(2);
        Assertions.assertThat(i).isEqualTo(1);
    }
}