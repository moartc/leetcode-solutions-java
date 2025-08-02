package solutions.algorithms._0_999._4_Median_of_Two_Sorted_Arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findMedianSortedArraysTest1() {

        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        double answer = solution.findMedianSortedArrays(nums1, nums2);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void findMedianSortedArraysTest2() {

        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        double answer = solution.findMedianSortedArrays(nums1, nums2);
        Assertions.assertThat(answer).isEqualTo(2.5);
    }
}