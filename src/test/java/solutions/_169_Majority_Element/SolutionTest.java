package solutions._169_Majority_Element;

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
    void majorityElementTest1() {
        int[] nums = new int[]{3, 2, 3};
        int expected = 3;
        int actual = solution.majorityElement(nums);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void majorityElementTest2() {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        int expected = 2;
        int actual = solution.majorityElement(nums);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void majorityElementTest3() {
        int[] nums = new int[]{6, 5, 5};
        int expected = 5;
        int actual = solution.majorityElement(nums);
        Assertions.assertEquals(expected, actual);
    }
}