package solutions.algorithms._136_Single_Number;

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
    void singleNumberTest1() {
        int[] nums = new int[]{2, 2, 1};
        int expected = 1;
        int actual = solution.singleNumber(nums);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void singleNumberTest2() {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        int expected = 4;
        int actual = solution.singleNumber(nums);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void singleNumberTest3() {
        int[] nums = new int[]{1};
        int expected = 1;
        int actual = solution.singleNumber(nums);
        Assertions.assertEquals(expected, actual);
    }

}