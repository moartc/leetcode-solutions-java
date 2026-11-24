package solutions.algorithms._3000_3999._3411_Maximum_Subarray_With_Equal_Products;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxLength1() {
        int[] nums = new int[]{1, 2, 1, 2, 1, 1, 1};
        int answer = solution.maxLength(nums);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void maxLength2() {
        int[] nums = new int[]{2, 3, 4, 5, 6};
        int answer = solution.maxLength(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void maxLength3() {
        int[] nums = new int[]{3, 4, 5};
        int answer = solution.maxLength(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void maxLength4() {
        int[] nums = new int[]{1, 2};
        int answer = solution.maxLength(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}