package solutions.algorithms._3000_3999._3536_Maximum_Product_of_Two_Digits;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxProduct1() {
        int n = 31;
        int answer = solution.maxProduct(n);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void maxProduct2() {
        int n = 22;
        int answer = solution.maxProduct(n);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void maxProduct3() {
        int n = 124;
        int answer = solution.maxProduct(n);
        Assertions.assertThat(answer).isEqualTo(8);
    }
}