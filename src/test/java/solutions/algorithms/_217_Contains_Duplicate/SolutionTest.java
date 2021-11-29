package solutions.algorithms._217_Contains_Duplicate;

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
    void containsDuplicateTest1() {
        int[] nums = new int[] {1,2,3,1};
        boolean actual = solution.containsDuplicate(nums);
        Assertions.assertTrue(actual);
    }

    @Test
    void containsDuplicateTest2() {
        int[] nums = new int[] {1,2,3,4};
        boolean actual = solution.containsDuplicate(nums);
        Assertions.assertFalse(actual);
    }

    @Test
    void containsDuplicateTest3() {
        int[] nums = new int[] {1,1,1,3,3,4,3,2,4,2};
        boolean actual = solution.containsDuplicate(nums);
        Assertions.assertTrue(actual);
    }
}