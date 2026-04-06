package solutions.algorithms._0_999._643_Maximum_Average_Subarray_I;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findMaxAverage1() {
        int[] nums = new int[]{1, 12, -5, -6, 50, 3};
        int k = 4;
        double answer = solution.findMaxAverage(nums, k);
        Assertions.assertThat(answer).isEqualTo(12.75000, Offset.offset(1e-5));
    }

    @Test
    void findMaxAverage2() {
        int[] nums = new int[]{5};
        int k = 1;
        double answer = solution.findMaxAverage(nums, k);
        Assertions.assertThat(answer).isEqualTo(5.00000, Offset.offset(1e-5));
    }

    @Test
    void findMaxAverage3() {
        int[] nums = new int[]{-1};
        int k = 1;
        double answer = solution.findMaxAverage(nums, k);
        Assertions.assertThat(answer).isEqualTo(-1.00000, Offset.offset(1e-5));
    }
}