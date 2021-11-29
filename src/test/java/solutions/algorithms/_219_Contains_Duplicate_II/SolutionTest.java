package solutions.algorithms._219_Contains_Duplicate_II;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void containsNearbyDuplicateTest1() {
        int[] nums = new int[]{1, 2, 3, 1};
        int k = 3;
        boolean actual = solution.containsNearbyDuplicate(nums, k);
        Assertions.assertTrue(actual);
    }

    @Test
    void containsNearbyDuplicateTest2() {
        int[] nums = new int[]{1, 0, 1, 1};
        int k = 1;
        boolean actual = solution.containsNearbyDuplicate(nums, k);
        Assertions.assertTrue(actual);
    }

    @Test
    void containsNearbyDuplicateTest3() {
        int[] nums = new int[]{1, 2, 3, 1, 2, 3};
        int k = 2;
        boolean actual = solution.containsNearbyDuplicate(nums, k);
        Assertions.assertFalse(actual);
    }
}