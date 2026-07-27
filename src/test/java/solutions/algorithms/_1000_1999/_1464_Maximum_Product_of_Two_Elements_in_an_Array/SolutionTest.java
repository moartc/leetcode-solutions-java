package solutions.algorithms._1000_1999._1464_Maximum_Product_of_Two_Elements_in_an_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxProduct1() {
        int[] nums = new int[]{3, 4, 5, 2};
        int answer = solution.maxProduct(nums);
        Assertions.assertThat(answer).isEqualTo(12);
    }

    @Test
    void maxProduct2() {
        int[] nums = new int[]{1, 5, 4, 5};
        int answer = solution.maxProduct(nums);
        Assertions.assertThat(answer).isEqualTo(16);
    }

    @Test
    void maxProduct3() {
        int[] nums = new int[]{3, 7};
        int answer = solution.maxProduct(nums);
        Assertions.assertThat(answer).isEqualTo(12);
    }
}