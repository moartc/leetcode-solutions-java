package solutions.algorithms._0_999._152_Maximum_Product_Subarray;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxProduct1() {
        int[] nums = new int[]{2, 3, -2, 4};
        int answer = solution.maxProduct(nums);
        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void maxProduct2() {
        int[] nums = new int[]{-2, 0, -1};
        int answer = solution.maxProduct(nums);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void maxProduct3() {
        int[] nums = new int[]{-2};
        int answer = solution.maxProduct(nums);
        Assertions.assertThat(answer).isEqualTo(-2);
    }

    @Test
    void maxProduct4() {
        int[] nums = new int[]{-4, -3};
        int answer = solution.maxProduct(nums);
        Assertions.assertThat(answer).isEqualTo(12);
    }

    @Test
    void maxProduct5() {
        int[] nums = new int[]{0, 2};
        int answer = solution.maxProduct(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void maxProduct6() {
        int[] nums = new int[]{6, 3, -10, 0, 2};
        int answer = solution.maxProduct(nums);
        Assertions.assertThat(answer).isEqualTo(18);
    }

}