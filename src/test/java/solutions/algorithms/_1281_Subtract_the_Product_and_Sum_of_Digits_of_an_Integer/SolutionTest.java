package solutions.algorithms._1281_Subtract_the_Product_and_Sum_of_Digits_of_an_Integer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void subtractProductAndSumTest1() {
        Assertions.assertThat(solution.subtractProductAndSum(234)).isEqualTo(15);
    }

    @Test
    void subtractProductAndSumTest2() {
        Assertions.assertThat(solution.subtractProductAndSum(4421)).isEqualTo(21);
    }
}