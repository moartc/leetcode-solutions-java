package solutions.algorithms._258_Add_Digits;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void addDigits1() {
        var result = solution.addDigits(38);
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    void addDigits2() {
        var result = solution.addDigits(0);
        Assertions.assertThat(result).isEqualTo(0);
    }
}