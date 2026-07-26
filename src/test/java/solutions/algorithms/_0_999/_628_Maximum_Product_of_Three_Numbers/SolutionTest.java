package solutions.algorithms._0_999._628_Maximum_Product_of_Three_Numbers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximumProduct1() {
        int[] nums = new int[]{1, 2, 3};
        int answer = solution.maximumProduct(nums);
        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void maximumProduct2() {
        int[] nums = new int[]{1, 2, 3, 4};
        int answer = solution.maximumProduct(nums);
        Assertions.assertThat(answer).isEqualTo(24);
    }

    @Test
    void maximumProduct3() {
        int[] nums = new int[]{-1, -2, -3};
        int answer = solution.maximumProduct(nums);
        Assertions.assertThat(answer).isEqualTo(-6);
    }

    @Test
    void maximumProduct4() {
        int[] nums = new int[]{-100, -98, -1, 2, 3, 4};
        int answer = solution.maximumProduct(nums);
        Assertions.assertThat(answer).isEqualTo(39200);
    }
}