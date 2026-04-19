package solutions.algorithms._1000_1999._1855_Maximum_Distance_Between_a_Pair_of_Values;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxDistance1() {
        int[] nums1 = new int[]{55, 30, 5, 4, 2};
        int[] nums2 = new int[]{100, 20, 10, 10, 5};
        int answer = solution.maxDistance(nums1, nums2);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void maxDistance2() {
        int[] nums1 = new int[]{2, 2, 2};
        int[] nums2 = new int[]{10, 10, 1};
        int answer = solution.maxDistance(nums1, nums2);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void maxDistance3() {
        int[] nums1 = new int[]{30, 29, 19, 5};
        int[] nums2 = new int[]{25, 25, 25, 25, 25};
        int answer = solution.maxDistance(nums1, nums2);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}