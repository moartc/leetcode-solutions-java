package solutions.algorithms._0_999._349_Intersection_of_Two_Arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void intersection1() {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        int[] answer = solution.intersection(nums1, nums2);
        Assertions.assertThat(answer).containsExactly(2);
    }

    @Test
    void intersection2() {
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};
        int[] answer = solution.intersection(nums1, nums2);
        Assertions.assertThat(answer).containsExactly(4, 9);
    }
}