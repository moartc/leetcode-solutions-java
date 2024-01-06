package solutions.algorithms._0_999._350_Intersection_of_Two_Arrays_II;

import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._350_Intersection_of_Two_Arrays_II.Solution;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void intersectTest1() {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        int[] expected = new int[]{2, 2};
        assertThat(solution.intersect(nums1, nums2)).contains(expected);
    }

    @Test
    void intersectTest2() {
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};
        int[] expected = new int[]{4, 9};
        assertThat(solution.intersect(nums1, nums2)).contains(expected);
    }

    @Test
    void intersectTest3() {
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{1,1};
        int[] expected = new int[]{1};
        assertThat(solution.intersect(nums1, nums2)).contains(expected);
    }

    @Test
    void intersectTest4() {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        int[] expected = new int[]{4,9};
        assertThat(solution.intersect(nums1, nums2)).contains(expected);
    }
}
//4 4 8 9 9
//4 5 9