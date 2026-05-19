package solutions.algorithms._2000_2999._2540_Minimum_Common_Value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getCommon1() {
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{2, 4};
        int answer = solution.getCommon(nums1, nums2);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void getCommon2() {
        int[] nums1 = new int[]{1, 2, 3, 6};
        int[] nums2 = new int[]{2, 3, 4, 5};
        int answer = solution.getCommon(nums1, nums2);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}