package solutions.algorithms._0_999._258_Add_Digits;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._258_Add_Digits.Solution;

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